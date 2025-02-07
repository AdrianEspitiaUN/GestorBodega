/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
/**
 *
 * @author adria_6
 */
public class DBaccess {
    private FirebaseDatabase firebaseDatabase;
    private void initFirebase() {
        
        try {
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()   
                    .setDatabaseUrl("https://proyecto-poo-24bb1-default-rtdb.firebaseio.com/")
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\adria_6\\OneDrive\\Documentos\\NetBeansProjects\\Firebase\\proyecto-poo-24bb1-firebase-adminsdk-fbsvc-66b7d4598d.json")))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
            System.out.println("Conexión exitosa....");
        }catch (RuntimeException ex) {
            System.out.println("Problema ejecucion ");
        }catch (FileNotFoundException ex) {
            System.out.println("Problema archivo");
        }
    }

    public DBaccess() {
    }
    public boolean registerUser(User user){
        boolean exito;
        initFirebase();
        String name = user.getUsername();
        String password = user.getPassword();
        /* Get database root reference */
        DatabaseReference databaseReference = firebaseDatabase.getReference("/");
        DatabaseReference childReference = databaseReference.child("users/"+name);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        childReference.setValue(user, new DatabaseReference.CompletionListener() {
            
            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                System.out.println("Registro guardado!");
                // decrement countDownLatch value and application will be continues its execution.
                countDownLatch.countDown();
            }
        });
        try {
                //wait for firebase to saves record.
                countDownLatch.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        exito = true;
        return exito;
    }
    
}
