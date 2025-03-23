
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class ListaComputadoras {
    List<String> marcas = new ArrayList<>();
    List<Integer> memorias = new ArrayList<>();
    List<Double> precios = new ArrayList<>();
    List<Integer> almacenamientos = new ArrayList<>();
    List<String> procesadores = new ArrayList<>();
    List<Computadora> computadoras = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    
    public void iniciarListaCompus() {
        System.out.println("Ingresa la informacion de 5 computadoras");
        for (int i = 1; i <= 5; i++) {
            System.out.println("    Computadora #" + i);
            System.out.print("Marca: ");
            String marca = teclado.nextLine();
            System.out.print("Memoria: ");
            int memoria = Integer.parseInt(teclado.nextLine());
            System.out.print("Precio: ");
            double precio = Double.parseDouble(teclado.nextLine());
            System.out.print("Almacenamiento: ");
            int almacenamiento = Integer.parseInt(teclado.nextLine());
            System.out.print("Procesador: ");
            String procesador = teclado.nextLine();
            Computadora compu = new Computadora(marca, memoria, precio, almacenamiento, procesador);
            computadoras.add(compu);
            marcas.add(compu.getMarca());
            memorias.add(compu.getMemoria());
            precios.add(compu.getPrecio());
            almacenamientos.add(compu.getAlmacenamiento());
            procesadores.add(compu.getProcesador());
            System.out.println();
        }
    }
}
