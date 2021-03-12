
package ejercicio5;
import java.util.Scanner;

public class Factura extends Precio{
    private String emisor;
    private String cliente;

    public Factura(Double pesos,String emisor, String cliente) {
        super(pesos);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    Factura() {
       
    }
    
    
    public void imprimirFactura(double x){
        

        ingresarEmisor();
        ingresarCliente();
        System.out.println("");
        System.out.println("El precio es: "+x);
        System.out.println("El emisor es: "+emisor);
        System.out.println("El cliente es: "+cliente);
        
        
    }
     public String ingresarEmisor() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el emisor: ");
        emisor=dato.nextLine();
        return emisor;
        
        }
         
        public String ingresarCliente() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el cliente: ");
        cliente=dato.nextLine();
        return cliente;
        
    }

 
    
    
    
}
