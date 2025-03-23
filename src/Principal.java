
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op=0;
        while (op != 8) {
            System.out.println("    MENU");
            System.out.println("1.- Busqueda lineal de enteros basica (si/no)");
            System.out.println("2.- Busqueda lineal de enteros indice");
            System.out.println("3.- Busqueda lineal de enteros apariciones");
            System.out.println("4.- Busqueda binaria de enteros basica (si/no)");
            System.out.println("5.- Busqueda binaria de enteros apariciones");
            System.out.println("6.- Busqueda de computadoras por marca");
            System.out.println("7.- Busqueda de computadoras por memoria");
            System.out.println("8.- Salir");
            op = Integer.parseInt(teclado.nextLine());
            ListaEnteros list = new ListaEnteros();
            ListaComputadoras lis = new ListaComputadoras();
            BusquedaBinaria busc = new BusquedaBinaria();
            switch(op) {
            case 1:
                List<Integer> lista1 = list.iniciarListaEnteros();
                System.out.println("Ingresa un numero a buscar");
                int z = Integer.parseInt(teclado.nextLine());
                boolean resp = BusquedaLineal.busquedaLineal(lista1, z);
                if (resp == true) {
                    System.out.println("Si esta el numero "+z+"en la lista");
                } else {
                    System.out.println("No esta el numero "+z+"en la lista");
                }
                break;
            case 2:
                List<Integer> lista2 = list.iniciarListaEnteros();
                System.out.println("Ingresa un numero a buscar");
                int i = Integer.parseInt(teclado.nextLine());
                int ind = BusquedaLineal.busquedaLineal2(lista2, i);
                if (ind == -1) {
                    System.out.println("No esta el numero "+i+"en la lista");
                } else {
                    System.out.println("El numero "+i+" esta en el indice "+ind);
                }
                break;
            case 3:
                List<Integer> lista3 = list.iniciarListaEnteros();
                System.out.println("Ingresa un numero a buscar");
                int u = Integer.parseInt(teclado.nextLine());
                int con = BusquedaLineal.busquedaLineal3(lista3, u);
                if (con == 0) {
                    System.out.println("No esta el numero "+u+"en la lista");
                } else {
                    System.out.println("El numero "+u+" se encuentra "+con+ " veces");
                }
                break;
            case 4:
                List<Integer> lista = list.iniciarListaEnteros();
                Collections.sort(lista);
                System.out.println("Ingresa un numero a buscar");
                int x = Integer.parseInt(teclado.nextLine());
                boolean res = busc.busquedaBoolean(lista, 0,lista.size()-1, x);
                if (res == true) {
                    System.out.println("Si esta el numero "+x+" en la lista");
                } else {
                    System.out.println("No esta el numero "+x+" en la lista");
                }
                break;
            case 5:
                List<Integer> lista5 = list.iniciarListaEnteros();
                Collections.sort(lista5);
                System.out.println("Ingresa un numero a buscar");
                int y = Integer.parseInt(teclado.nextLine());
                int cont = busc.busquedaCont(lista5, 0,lista5.size()-1, y);
                if (cont == 0) {
                    System.out.println("No esta el numero "+y+" en la lista");
                } else {
                    System.out.println("El numero "+y+" se encuentra "+cont+ " veces");
                }
                break;
            case 6:
                lis.iniciarListaCompus();
                List<Computadora> listmarc = new ArrayList<>();
                System.out.println("Ingresa la marca a buscar");
                String mar = teclado.nextLine();
                listmarc = BusquedaLineal.busquedaLinealPorMarca(lis.computadoras, mar);
                if (listmarc.isEmpty()) {
                    System.out.println("La marca "+mar+" no esta en la lista");
                } else {
                    int cnt = listmarc.size();
                    System.out.println("La marca "+mar+" se encuentra "+cnt+ " veces");
                    for (int j = 0; j < listmarc.size(); j++) {
                        Computadora c = listmarc.get(j);
                        System.out.println("Memoria: " + c.getMemoria() + "GB, Precio: $" + c.getPrecio() +", Almacenamiento: " + c.getAlmacenamiento() + "GB, Procesador: " + c.getProcesador());
                    }
                }
                break;
            case 7:
                lis.iniciarListaCompus();
                List<Computadora> listmem = new ArrayList<>();
                System.out.println("Ingresa el numero de memoria a buscar");
                int mem = Integer.parseInt(teclado.nextLine());
                listmem = BusquedaLineal.busquedaLinealPorMemoria(lis.computadoras, mem);
                if (listmem.isEmpty()) {
                    System.out.println("El numero de memoria "+mem+" no esta en la lista");
                } else {
                    int cnta = listmem.size();
                    System.out.println("El numero de memoria "+mem+" se encuentra "+cnta+ " veces");
                    for (int j = 0; j < listmem.size(); j++) {
                        Computadora cm = listmem.get(j);
                        System.out.println("Marca: " + cm.getMarca() + " Precio: $" + cm.getPrecio() +", Almacenamiento: " + cm.getAlmacenamiento() + "GB, Procesador: " + cm.getProcesador());
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
            }  
        }
        
        //List<Integer> lista1 = new ArrayList<>(Arrays.asList(10, 20, 50, 40, 50)) ;
       
        
    } 
    
}
