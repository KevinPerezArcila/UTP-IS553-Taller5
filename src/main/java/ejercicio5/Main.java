
package ejercicio5;

public class Main {


    public static void main(String[] args) {
        Precio pre = new Precio();
       Factura fac = new Factura();
       double y;
       y=pre.ingresarPrecio();
       fac.imprimirFactura(y);
       
    }
    
}
