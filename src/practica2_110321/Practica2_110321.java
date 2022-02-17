/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_110321;

import java.util.Scanner;

/**
 *
 * @author Ian_l
 */
public class Practica2_110321 {

    

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opc;
        //objetos de la clase pelicula
        
        Pelicula elDorado=new Pelicula("nombre", "genero", "duracion");
        
        
        //menu de opciones
        
        do{
            
            System.out.println("Seleccione una opcion");
            System.out.println("1)Mostrar datos de peliculas");
            System.out.println("2)Modificar Nombre");
            System.out.println("3)Modificar genero");
            System.out.println("4)Modificar duracion");
            System.out.println("5) Salir");
            
            //lectura de opcion seleccionada
            
            opc=teclado.nextInt();
            
            //Seleccion de usuario
            
            switch(opc){
                
                case 1:
                    
                    //Mostrar los datos del objeto
                    System.out.println(elDorado.toString());
                    System.out.println("**************************");
                    break;
                    
                case 2:
                    
                    //Modificar el nombre
                    System.out.println("Ingresa el nuevo nombre");
                    elDorado.setTitulo(teclado.next());
                    System.out.println("**************************");
                    
                    break;
                case 3:
                    
                    //Modificar genero
                    System.out.println("Ingrese el nuevo genero");
                    elDorado.setGenero(teclado.next());
                    System.out.println("**************************");
                    break;
                    
                case 4:
                    
                    //Modificar duracion
                    System.out.println("Ingresa la nueva duracion");
                    elDorado.setGenero(teclado.next());
                    System.out.println("**************************");
                    break;
                
                case 5:
                    //salir
                    System.out.println("Saliendo");
                    
                default:
                    
                    //error de usuario
                    System.out.println("Porfavor solo selecciona ");
            }
        
        } while (opc !=5);
    }    

    

    
        
}
    
    
  

