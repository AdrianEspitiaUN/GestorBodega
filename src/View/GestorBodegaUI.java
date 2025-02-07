/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DBaccess;
import Model.User;
import ModelView.Item;
import ModelView.ItemList;
import java.awt.CardLayout;
import java.util.Arrays;
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
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adria_6
 */
public class GestorBodegaUI extends javax.swing.JFrame {

    /**
     * Creates new form Authenticate
     */
    public GestorBodegaUI() {
        initComponents();
    }
    CardLayout c1 = new CardLayout();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Authenticate = new javax.swing.JPanel();
        Ingresar = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        IngresarPanel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        UsuarioLabel = new javax.swing.JLabel();
        claveLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        IngresarUserPass = new javax.swing.JButton();
        RegistrarsePanel = new javax.swing.JPanel();
        userRegistrar = new javax.swing.JTextField();
        UsuarioLabel1 = new javax.swing.JLabel();
        claveLabel1 = new javax.swing.JLabel();
        passwordRegistrar = new javax.swing.JPasswordField();
        registrarUserPass = new javax.swing.JButton();
        exitoRegistroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        continueToHome = new javax.swing.JButton();
        menuAcciones = new javax.swing.JPanel();
        agregarItem = new javax.swing.JButton();
        listaItems = new javax.swing.JButton();
        AgregarItemPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        pesoField = new javax.swing.JTextField();
        duenoField = new javax.swing.JTextField();
        crearItem = new javax.swing.JButton();
        exitoAgregarItem = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        volverAAgregar = new javax.swing.JButton();
        volverMenuAccion = new javax.swing.JButton();
        listaItemsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeItems = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor Bodega");
        getContentPane().setLayout(new java.awt.CardLayout());

        Ingresar.setText("Ingresar");
        Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        Registrarse.setText("Registrarse");
        Registrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AuthenticateLayout = new javax.swing.GroupLayout(Authenticate);
        Authenticate.setLayout(AuthenticateLayout);
        AuthenticateLayout.setHorizontalGroup(
            AuthenticateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthenticateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AuthenticateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingresar)
                    .addComponent(Registrarse))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        AuthenticateLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Ingresar, Registrarse});

        AuthenticateLayout.setVerticalGroup(
            AuthenticateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AuthenticateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        AuthenticateLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Ingresar, Registrarse});

        getContentPane().add(Authenticate, "card2");

        IngresarPanel.setEnabled(false);

        user.setToolTipText("");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        UsuarioLabel.setText("Usuario");

        claveLabel.setText("Contraseña");

        password.setToolTipText("");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        IngresarUserPass.setText("Ingresar1");
        IngresarUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarUserPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarPanelLayout = new javax.swing.GroupLayout(IngresarPanel);
        IngresarPanel.setLayout(IngresarPanelLayout);
        IngresarPanelLayout.setHorizontalGroup(
            IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarPanelLayout.createSequentialGroup()
                        .addGroup(IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioLabel)
                            .addComponent(claveLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarPanelLayout.createSequentialGroup()
                        .addComponent(IngresarUserPass)
                        .addGap(38, 38, 38))))
        );

        IngresarPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IngresarUserPass, password, user});

        IngresarPanelLayout.setVerticalGroup(
            IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresarUserPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IngresarPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {IngresarUserPass, password, user});

        getContentPane().add(IngresarPanel, "card3");

        RegistrarsePanel.setEnabled(false);

        userRegistrar.setToolTipText("");
        userRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegistrarActionPerformed(evt);
            }
        });

        UsuarioLabel1.setText("Usuario");

        claveLabel1.setText("Contraseña");

        registrarUserPass.setText("Registrarse");
        registrarUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUserPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarsePanelLayout = new javax.swing.GroupLayout(RegistrarsePanel);
        RegistrarsePanel.setLayout(RegistrarsePanelLayout);
        RegistrarsePanelLayout.setHorizontalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarsePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarsePanelLayout.createSequentialGroup()
                        .addGroup(RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioLabel1)
                            .addComponent(claveLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarsePanelLayout.createSequentialGroup()
                        .addComponent(registrarUserPass)
                        .addGap(38, 38, 38))))
        );

        RegistrarsePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordRegistrar, registrarUserPass, userRegistrar});

        RegistrarsePanelLayout.setVerticalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarsePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabel1)
                    .addComponent(passwordRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarUserPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(RegistrarsePanel, "card4");

        jLabel1.setText("Usuario Registrado!");

        continueToHome.setText("Continuar");
        continueToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exitoRegistroPanelLayout = new javax.swing.GroupLayout(exitoRegistroPanel);
        exitoRegistroPanel.setLayout(exitoRegistroPanelLayout);
        exitoRegistroPanelLayout.setHorizontalGroup(
            exitoRegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitoRegistroPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(exitoRegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(continueToHome)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26))
        );
        exitoRegistroPanelLayout.setVerticalGroup(
            exitoRegistroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitoRegistroPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(continueToHome)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(exitoRegistroPanel, "card5");

        agregarItem.setText("Agregar Item");
        agregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarItemActionPerformed(evt);
            }
        });

        listaItems.setText("Lista de Items");
        listaItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAccionesLayout = new javax.swing.GroupLayout(menuAcciones);
        menuAcciones.setLayout(menuAccionesLayout);
        menuAccionesLayout.setHorizontalGroup(
            menuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarItem)
                    .addComponent(listaItems))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        menuAccionesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {agregarItem, listaItems});

        menuAccionesLayout.setVerticalGroup(
            menuAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAccionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(agregarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaItems)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        menuAccionesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {agregarItem, listaItems});

        getContentPane().add(menuAcciones, "card6");

        jLabel2.setText("id:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Peso:");

        jLabel5.setText("Propieatrio:");

        crearItem.setText("Añadir");
        crearItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgregarItemPanelLayout = new javax.swing.GroupLayout(AgregarItemPanel);
        AgregarItemPanel.setLayout(AgregarItemPanelLayout);
        AgregarItemPanelLayout.setHorizontalGroup(
            AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duenoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(AgregarItemPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(crearItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AgregarItemPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {duenoField, idField, jLabel5, nameField, pesoField});

        AgregarItemPanelLayout.setVerticalGroup(
            AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarItemPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pesoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AgregarItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(duenoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AgregarItemPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {duenoField, idField, nameField, pesoField});

        getContentPane().add(AgregarItemPanel, "card7");

        jLabel6.setText("Item agregado!");

        volverAAgregar.setText("Agregar Otro");
        volverAAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAAgregarActionPerformed(evt);
            }
        });

        volverMenuAccion.setText("Terminar");
        volverMenuAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exitoAgregarItemLayout = new javax.swing.GroupLayout(exitoAgregarItem);
        exitoAgregarItem.setLayout(exitoAgregarItemLayout);
        exitoAgregarItemLayout.setHorizontalGroup(
            exitoAgregarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitoAgregarItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(exitoAgregarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(volverMenuAccion)
                    .addComponent(volverAAgregar)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14))
        );
        exitoAgregarItemLayout.setVerticalGroup(
            exitoAgregarItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitoAgregarItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverAAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverMenuAccion)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(exitoAgregarItem, "card8");

        TablaDeItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Peso", "Propietario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDeItems);

        jLabel7.setText("Lista de Items");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listaItemsPanelLayout = new javax.swing.GroupLayout(listaItemsPanel);
        listaItemsPanel.setLayout(listaItemsPanelLayout);
        listaItemsPanelLayout.setHorizontalGroup(
            listaItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaItemsPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(listaItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaItemsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaItemsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaItemsPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(156, 156, 156))))
        );
        listaItemsPanelLayout.setVerticalGroup(
            listaItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaItemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(listaItemsPanel, "card9");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        
    }//GEN-LAST:event_userActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        Authenticate.setVisible(false);
        RegistrarsePanel.setVisible(true);
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        Authenticate.setVisible(false);
        IngresarPanel.setVisible(true);
    }//GEN-LAST:event_IngresarActionPerformed

    private void registrarUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUserPassActionPerformed
        User usuario = new User(userRegistrar.getText(), Arrays.toString(passwordRegistrar.getPassword()));
        DBaccess db = new DBaccess();
        if(db.registerUser(usuario)){
            RegistrarsePanel.setVisible(false);
            exitoRegistroPanel.setVisible(true);
            
        };
    }//GEN-LAST:event_registrarUserPassActionPerformed

    private void userRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userRegistrarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void continueToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueToHomeActionPerformed
        exitoRegistroPanel.setVisible(false);
        Authenticate.setVisible(true);
    }//GEN-LAST:event_continueToHomeActionPerformed

    private void IngresarUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarUserPassActionPerformed
        String userText = user.getText();
        String passText = Arrays.toString(password.getPassword());
        initFirebase();
        DatabaseReference dbUserRef = firebaseDatabase.getReference("users/"+userText);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        dbUserRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // This method is called once with the initial value and again
                    // whenever data at this location is updated.
                    
                    
                    IngresarPanel.setVisible(false);
                    menuAcciones.setVisible(true);
                    

                    //System.out.println("valor: "+ value.getPrice());
                    //System.out.println("valor: "+ value.getName());
                    countDownLatch.countDown();

                    //Log.d(TAG, "Value is: " + value);
                }

                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                   // Log.w(TAG, "Failed to read value.", error.toException());
                }
            });
        try {
            //wait for firebase to saves record.
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_IngresarUserPassActionPerformed

    private void agregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarItemActionPerformed
        menuAcciones.setVisible(false);
        AgregarItemPanel.setVisible(true);
    }//GEN-LAST:event_agregarItemActionPerformed

    private void crearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearItemActionPerformed
        Item item = new Item(nameField.getText(), duenoField.getText(),
                            Integer.parseInt(pesoField.getText()), idField.getText());
        DatabaseReference itemRef = firebaseDatabase.getReference("items/"+item.getId());        
        itemRef.setValue(item, new DatabaseReference.CompletionListener() {

            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                AgregarItemPanel.setVisible(false);
                exitoAgregarItem.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_crearItemActionPerformed

    private void volverAAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAAgregarActionPerformed
        exitoAgregarItem.setVisible(false);
        AgregarItemPanel.setVisible(true);
    }//GEN-LAST:event_volverAAgregarActionPerformed

    private void volverMenuAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuAccionActionPerformed
        exitoAgregarItem.setVisible(false);
        menuAcciones.setVisible(true);
    }//GEN-LAST:event_volverMenuAccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listaItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaItemsActionPerformed
        
        DatabaseReference itemRef = firebaseDatabase.getReference("items");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        itemRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // This method is called once with the initial value and again
                    // whenever data at this location is updated.
                    ItemList lista = new ItemList();
                    DefaultTableModel model = (DefaultTableModel) TablaDeItems.getModel();
                    for(DataSnapshot dsp: dataSnapshot.getChildren()){
                        Item item = dsp.getValue(Item.class);
                        lista.addItem(item);
                        model.addRow(new Object[]{item.getId(), item.getNombre(), item.getPeso(), item.getDueno()});
                    }
                    menuAcciones.setVisible(false);
                    listaItemsPanel.setVisible(true);
                }

                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                   // Log.w(TAG, "Failed to read value.", error.toException());
                }
            });
        try {
            //wait for firebase to saves record.
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_listaItemsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorBodegaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorBodegaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorBodegaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorBodegaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorBodegaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarItemPanel;
    private javax.swing.JPanel Authenticate;
    private javax.swing.JButton Ingresar;
    private javax.swing.JPanel IngresarPanel;
    private javax.swing.JButton IngresarUserPass;
    private javax.swing.JButton Registrarse;
    private javax.swing.JPanel RegistrarsePanel;
    private javax.swing.JTable TablaDeItems;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JLabel UsuarioLabel1;
    private javax.swing.JButton agregarItem;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JLabel claveLabel1;
    private javax.swing.JButton continueToHome;
    private javax.swing.JButton crearItem;
    private javax.swing.JTextField duenoField;
    private javax.swing.JPanel exitoAgregarItem;
    private javax.swing.JPanel exitoRegistroPanel;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaItems;
    private javax.swing.JPanel listaItemsPanel;
    private javax.swing.JPanel menuAcciones;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordRegistrar;
    private javax.swing.JTextField pesoField;
    private javax.swing.JButton registrarUserPass;
    private javax.swing.JTextField user;
    private javax.swing.JTextField userRegistrar;
    private javax.swing.JButton volverAAgregar;
    private javax.swing.JButton volverMenuAccion;
    // End of variables declaration//GEN-END:variables
}
