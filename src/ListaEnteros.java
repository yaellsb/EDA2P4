
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class ListaEnteros {
    List<Integer> lista1 = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    public List<Integer> iniciarListaEnteros() {
        System.out.println("Ingresa 10 numeros");
        int num;
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero "+(i+1)+": ");
            num = Integer.parseInt(teclado.nextLine());
            lista1.add(num); 
            System.out.println();
        }
        return lista1;
    }
    
    Random rand = new Random();
    /**
    public List<Integer> iniciarListaEnteros() {
        for (int i = 0; i < 10; i++) {
            lista1.add(rand.nextInt(100) + 1); 
        }
        return lista1;
    }*/
}
