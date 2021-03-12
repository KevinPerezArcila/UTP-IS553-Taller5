
package com.mycompany.taller5.ejercicio1;


//ATRIBUTOS DE LA CLASE

import java.util.Scanner;

public class RegistroLibreta {
    private String nombre;
    private String direccion;
    private String numeroDeTelefono;
    private String correoElectronico;
    
    
    
    //CONSTRUCTOR
    public RegistroLibreta(String nombre, String direccion, String numeroDeTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDeTelefono = numeroDeTelefono;
        this.correoElectronico = correoElectronico;
        
    }
    
    //CONSTRUCTOR
    public RegistroLibreta() {
       
    }
    
    //METODOS DE ACCESO

    public String ingresarNombre() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre=dato.nextLine();
        return nombre;
    }
    public String ingresarDireccion() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la direccion: ");
        direccion=dato.nextLine();
        return direccion;
       
        
    }
    public String ingresarTelefono() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el telefono: ");
        numeroDeTelefono=dato.nextLine();
        return numeroDeTelefono;
        
    }
    public String ingresarCorreo() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el correo: ");
        correoElectronico=dato.nextLine();
        return correoElectronico;
        
    }
    
   
   

    
    
    
}
