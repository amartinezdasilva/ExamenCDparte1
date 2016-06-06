package examenfinalparte1;

public class Calculos {

    int VariableCalculos;

    public Calculos(int j, int m) {
        VariableCalculos = calculo(j, m);
    }

    public Calculos(int j) {
        VariableCalculos = calculo(j, j);
    }

    public Calculos() {
        VariableCalculos = -1;
    }

    public int calculo(int x, int x1) {
        return x + x1;
    }
}
