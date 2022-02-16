/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_110321;

import java.util.Scanner;

/**
 *
 * @author Ian_l
 */
public class Practica1_110321 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fruta manzana=new Fruta ("rojo",2.3f,"dulce",15.2f,"febrero",5.2f);//asigna un nuevo objeto a la clase manzana
        
        String sabor="amargo";
        String mes;
        
        Scanner teclado = new Scanner(System.in);
        
        manzana.setColor("verde");
        manzana.setSabor(sabor);
        
        System.out.println("Teclea el mes de temporada");
        
        manzana.setMesTemporada(teclado.next());
        
        System.out.println("manzana");
        System.out.println(manzana.getColor());
        System.out.println(manzana.getPeso());
        System.out.println(manzana.getSabor());
        System.out.println(manzana.getCostoKilo());
        System.out.println(manzana.getMesTemporada());
        System.out.println(manzana.getCantidadAzucar());
        
        
        System.out.print(manzana.toString());
        
        
             

        }    
}
