
package ejercicio3;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String edad;
    private String nota;
    private String codigo;

    
    //CONSTRUCTOR
    public Estudiante(String nombre, String apellido, String edad, String nota, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
        this.codigo=codigo;
    }
    //CONSTRUCTOR
     public Estudiante(){
        
    }
     
     
     //ATRIBUTOS

    public String ingresarNombre() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre=dato.nextLine();
        return nombre;
    }
    public String ingresarApellido() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la apellido: ");
        apellido=dato.nextLine();
        return apellido;
       
        
    }
    public String ingresarEdad() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        edad=dato.nextLine();
        return edad;
        
    }
    public String ingresarNota() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el nota: ");
        nota=dato.nextLine();
        return nota;
        
    }
    public String ingresarCodigo() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        codigo=dato.nextLine();
        return codigo;
        
    }
     
    
    
    
}
