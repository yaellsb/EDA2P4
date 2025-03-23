
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class BusquedaBinaria {
    
    public boolean busquedaBoolean(List<Integer> lista,int inicio,int fin,int x) {
        Collections.sort(lista);
        if (fin >= inicio){
            int medio = (inicio+fin)/2;
            if (lista.get(medio)==x) {     
                return true;
            }
            if (lista.get(medio)>x) {
                return busquedaBoolean(lista,inicio,medio-1,x);
            } else {
                return busquedaBoolean(lista,medio+1,fin,x);
            }
        }
        return false;
    }
    
    public int busquedaCont(List<Integer> lista, int inicio, int fin, int x) {
        if (fin>=inicio) {
            int medio = (inicio+fin)/2;
            int cont = 0;
            if (lista.get(medio)==x) {
                cont = 1;
                int izq = medio -1;
                while (izq >= inicio && lista.get(izq) == x) {
                    cont++; 
                    izq--;
                }
                int der = medio + 1;
                while (der <= fin && lista.get(der) == x) {
                    cont++; 
                    der++;
                }
                return cont;
            }
            if (lista.get(medio)>x){
                return busquedaCont(lista, inicio, medio-1, x);
            } else {
                return busquedaCont(lista, medio+1, fin, x);
            }
        }
        return 0;
    }
}
