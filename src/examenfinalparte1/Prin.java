package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        MetodoSuma();
        RestaAlPrimerMetodo();
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

    public static void RestaAlPrimerMetodo() {
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
    }

    public static void MetodoSuma() {
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}
