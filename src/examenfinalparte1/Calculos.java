package examenfinalparte1;

public class Calculos {

    int i;

    public Calculos(int j, int m) {
        i = calculo(j, m);
    }

    public Calculos(int j) {
        i = calculo(j, j);
    }

    public Calculos() {
        i = -1;
    }

    public int calculo(int x, int x1) {
        return x + x1;
    }
}
