package examenfinalparte1;

public class Principal {

    int i;

    public Principal(int j, int m) {
        i = calculo(j, m);
    }

    public Principal(int j) {
        i = calculo(j, j);
    }

    public Principal() {
        i = -1;
    }

    public int calculo(int x, int x1) {
        return x + x1;
    }
}
