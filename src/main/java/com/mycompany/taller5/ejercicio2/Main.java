
package com.mycompany.taller5.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer opcion;
        LibretaDeDirecciones op = new LibretaDeDirecciones();
        
        Scanner dato = new Scanner(System.in);
        
        do{
        System.out.println("1) Añadir entrada ");
        System.out.println("2) Borrar entrada ");
        System.out.println("3) Ver todas las entradas ");
        System.out.println("4) Actualizar una entrada ");
        System.out.println("PRESIONA 0 PARA SALIR.");
        System.out.println("Que opcion quiere ejecutar: ");
        opcion = dato.nextInt();
        
        
        switch(opcion){
 
            case 1: 
                op.añadirEntrada();
                break;
            case 2:
                op.verEntradas();
                System.out.println("");
                Integer x;
                System.out.println("Cual entrada quiere eliminar: ");
                x = dato.nextInt();
                op.borrarEntrada(x);
                     
                break;

            case 3:
                op.verEntradas();
                break;
            case 4:
                op.verEntradas();
                System.out.println("");
                System.out.println("Cual entrada quiere modificar: ");
                x = dato.nextInt();
                op.actualizarEntrada(x);
                break;
            default:
                System.out.println("Ingreso un dato erroneo o se salio del programa.");
                break; 
                   
        }
        
            
      }while(opcion!=0);
        
    }
    
    
  /*  public static void meterOpcion(){
        LibretaDeDirecciones op = new LibretaDeDirecciones();
        System.out.println("");
        Integer x;
        Scanner dato = new Scanner(System.in);
        System.out.println("Cual entrada quiere eliminar: ");
        x = dato.nextInt();
        op.borrarEntrada(x);
       
    }*/

    
}
