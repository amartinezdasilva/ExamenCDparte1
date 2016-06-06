package examenfinalparte1;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        MetodoSuma();
        RestaAlPrimerMetodo();       
        ValorNegativo();
    }

    public static void ValorNegativo() {
        Calculos ObjetoCreado = new Calculos();
        int nn = ObjetoCreado.i;
        System.out.println("Es: " + nn);
    }

    public static void RestaAlPrimerMetodo() {
        Calculos ObjetoCreado2 = new Calculos(10);
        int m = ObjetoCreado2.i;
        System.out.println("Es: " + m);
    }

    public static void MetodoSuma() {
        Calculos obj = new Calculos(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}
