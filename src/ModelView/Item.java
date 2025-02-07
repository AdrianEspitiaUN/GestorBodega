/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

/**
 *
 * @author adria_6
 */
public class Item {
    public String nombre;
    public String dueno;
    public int peso;
    public String id;
    public int diasContrato;

    public Item(String nombre, String dueno, int peso, String id) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.peso = peso;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public int getPeso() {
        return peso;
    }

    public String getId() {
        return id;
    }

    public Item() {
    }

    public int getDiasContrato() {
        return diasContrato;
    }

    public void setDiasContrato(int diasContrato) {
        this.diasContrato = diasContrato;
    }
    
    
}
