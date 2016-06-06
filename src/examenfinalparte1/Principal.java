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
        int suma = ObjetoCreado.i;
        System.out.println("Es: " + suma);
    }

    public static void RestaAlPrimerMetodo() {
        Calculos ObjetoCreado2 = new Calculos(10);
        int resta = ObjetoCreado2.i;
        System.out.println("Es: " + resta);
    }

    public static void MetodoSuma() {
        Calculos obj = new Calculos(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}
