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
        int negativo = ObjetoCreado.i;
        System.out.println("Es: " + negativo);
    }

    public static void RestaAlPrimerMetodo() {
        Calculos ObjetoCreado2 = new Calculos(10);
        int resta = ObjetoCreado2.i;
        System.out.println("Es: " + resta);
        //nombre variable de m a resta
    }

    public static void MetodoSuma() {
        Calculos obj = new Calculos(10, 20);
        int suma = obj.i;
        System.out.println("Es: " + suma);
    }
}
