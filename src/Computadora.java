/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class Computadora {
    //Atributos
    private String marca; 
    private int memoria; 
    private double precio; 
    private int almacenamiento;
    private String procesador; 
    //Constructores 
    public Computadora(){}
    
    public Computadora(String marca, int memoria){
        this.marca = marca;
        this.memoria = memoria; 
    }
    public Computadora(String marca, int memoria, double precio, int almacenamiento, String procesador){
        this.marca = marca;
        this.memoria = memoria; 
        this.precio = precio; 
        this.almacenamiento = almacenamiento; 
        this.procesador = procesador; 
    }
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    //Métodos
    public void encender() {
    System.out.println("La computadora se está encendiendo...");
    }

    public void apagar() {
    System.out.println("La computadora se está apagando...");
    }
    
    public void abrirPrograma(String programa) {
    System.out.println("Abriendo " + programa + "...");
    }
    
    public String verificarEspacio() {
    if (almacenamiento < 50) {
        return "Advertencia: Poco espacio en disco.";
    }
    return "Espacio suficiente en disco.";
    }

    public String verificarRendimiento() {
        if (memoria < 8) {
            return "El rendimiento puede ser bajo.";
        }
        return "Buen rendimiento.";
    }
}
