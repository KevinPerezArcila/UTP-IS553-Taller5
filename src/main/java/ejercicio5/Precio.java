
package ejercicio5;

import java.util.Scanner;


public class Precio {
    private Double pesos;

    public Precio(Double pesos) {
        this.pesos = pesos;
    }
     public Precio() {
       
    }

public Double ingresarPrecio() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        pesos=dato.nextDouble();
        return pesos;
    }
    
    
    
    
    
}
