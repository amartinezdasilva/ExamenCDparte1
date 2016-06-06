package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        MetodoSuma();
        RestaAlPrimerMetodo();       
        ValorNegativo();
    }

    public static void ValorNegativo() {
        Principal ObjetoCreado = new Principal();
        int nn = ObjetoCreado.i;
        System.out.println("Es: " + nn);
    }

    public static void RestaAlPrimerMetodo() {
        Principal ObjetoCreado2 = new Principal(10);
        int m = ObjetoCreado2.i;
        System.out.println("Es: " + m);
    }

    public static void MetodoSuma() {
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}
