
package com.mycompany.taller5.ejercicio2;
import com.mycompany.taller5.ejercicio1.*;
import java.util.Scanner;



public class LibretaDeDirecciones {
    Integer contador=0;
    RegistroLibreta op = new RegistroLibreta();
    String[][] libreta = new String[100][4];
    
  
    
    
    
    
    //Metodo para añadir datos
    public void añadirEntrada(){
        System.out.println("");
        libreta[contador][0]=op.ingresarNombre();
        libreta[contador][1]=op.ingresarDireccion();
        libreta[contador][2]=op.ingresarTelefono();
        libreta[contador][3]=op.ingresarCorreo();
        System.out.println("");
        contador=contador+1;
       
        
        
      
    }
    
        public void verEntradas(){ 
        for(int i = 0; i<contador; i++)
        {
                System.out.println("Entrada numero " + (i+1));
            
                System.out.println("Nombre: "+libreta[i][0]);
                System.out.println("Direccion: "+libreta[i][1]);
                System.out.println("Telefono: "+libreta[i][2]);
                System.out.println("Correo: "+libreta[i][3]);
                System.out.println("");
            
            
        }
        System.out.println("");
        
    }
        
        
    
    public void borrarEntrada(int x){
        Integer  y;
        y=x;
       if(x<=contador){
           x = x-1;
           libreta[x][0]=null;
           libreta[x][1]=null;
           libreta[x][2]=null;
           libreta[x][3]=null;
           
           for(int i= 0; i<(contador-1); i++)
           {
               libreta[x][0]=libreta[y][0];
               libreta[x][1]=libreta[y][1];
               libreta[x][2]=libreta[y][2];
               libreta[x][3]=libreta[y][3];
               x=y;
               y=y+1;
               
               
           }
           contador=contador-1;
       }
       else{
           System.out.println("Ingreso una entrada no valida.");
       }
        
        
          
    }
    
   
    
    public void actualizarEntrada(int x){
        Integer y;
        y=contador;
        if(x<=contador){
            x=x-1;
            contador=x;
            añadirEntrada();
            contador=y;
        }
        else{
            System.out.println("Ingreso un numero no valido.");
        }
        
    }
}



