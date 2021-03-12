
package ejercicio3;
import java.util.Scanner;

public class EstudianteDeInformatica extends Estudiante{
    private Integer semestre;
    private Integer programacionVistaActualmente;
    
    
    
    //CONSTRUCTOR
    public EstudianteDeInformatica(String nombre, String apellido, String edad, String nota, String codigo, Integer semestre, Integer programacionVistaActualmente){
      super(nombre,apellido,edad,nota,codigo);
      this.semestre = semestre;
      this.programacionVistaActualmente = programacionVistaActualmente;
      
      }

    EstudianteDeInformatica() {
    }
      
      public void registroEstudiante(){
          ingresarNombre();
          ingresarApellido();
          ingresarEdad();
          ingresarNota();
          ingresarCodigo();
          ingresarSemestre();
          ingresarProgramacionVistaActualmente();
          }
      
         public Integer ingresarSemestre() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el semestre a cursar: ");
        semestre=dato.nextInt();
        return semestre;
        
        }
         
        public Integer ingresarProgramacionVistaActualmente() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la programacion a cursar: ");
        programacionVistaActualmente=dato.nextInt();
        return programacionVistaActualmente;
        
    }
 }
    
    
      
      
      

