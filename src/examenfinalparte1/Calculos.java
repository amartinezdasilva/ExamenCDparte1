package examenfinalparte1;
/**
 * @author Aaron
*/
public class Calculos {

    int VariableCalculos;
/**
 * 
 * @param j 
 * @param m  
 */
    public Calculos(int j, int m) {
        VariableCalculos = calculo(j, m);
    }
/**
 * 
 * @param j 
 */
    public Calculos(int j) {
        VariableCalculos = calculo(j, j);
    }
/**
 * @see Calculos da el valor '-1' a la variable VariableCalculos
 */
    public Calculos() {
        VariableCalculos = -1;
    }
/**
 * 
 * @param x
 * @param x1
 * @return 
 */
    public int calculo(int x, int x1) {
        return x + x1;
    }
}
