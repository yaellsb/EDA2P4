
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dueñas Fuentes David y Sánchez Bautista Luis Yael
 */
public class BusquedaLineal {
    public static boolean busquedaLineal(List<Integer> list, int valorBuscado){
        int n = list.size(); 
        for(int i = 0; i<=n; i++){
            if(list.get(i).equals(valorBuscado))
                return true;           
        }
        return false;
    }
    
    public static int busquedaLineal2(List<Integer> list, int valorBuscado){
        int n = list.size(); 
        for(int i=0; i<=n; i++){
            if(list.get(i).equals(valorBuscado))
                return i; 
        }
        return  -1; 
    }
    
    public static int busquedaLineal3(List<Integer> list, int valorBuscado){
        int n = list.size(); 
        int contador = 0; 
        for(int i=0; i<n; i++){
            if(list.get(i).equals(valorBuscado)){
                contador++; 
            } 
        }
        return contador; 
    }
    
    public static List<Computadora> busquedaLinealPorMarca(List<Computadora> list, String marca) {
    List<Computadora> cmps = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMarca().equalsIgnoreCase(marca)) { 
                cmps.add(list.get(i));
            }
        }
        return cmps; 
    }
    //public static int busquedaLinealPorMarca(List<Computadora> list, String marca) {
    //int contador = 0;
    //for (int i = 0; i < list.size(); i++) {
    //    if (list.get(i).getMarca().equalsIgnoreCase(marca)) { 
    //        contador++; 
    //    }
    //}
    //return contador; 
    //}
    
    public static List<Computadora> busquedaLinealPorMemoria(List<Computadora> list, int memoria) {
    List<Computadora> cmps = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getMemoria()== memoria){ 
            cmps.add(list.get(i));
        }
    }
    return cmps; 
    }
    
    //public static int busquedaLinealPorMemoria(List<Computadora> list, int memoria) {
    //int contador = 0;
    //for (int i = 0; i < list.size(); i++) {
    //    if (list.get(i).getMemoria()== memoria){ 
    //        contador++; 
    //    }
    //}
    //return contador; 
    //}

}
