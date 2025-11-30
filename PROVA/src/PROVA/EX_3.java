package PROVA;
import PROVA.UtilExamen;
import java.util.ArrayList;
public class EX_3 {
    public static void main(String[] args) {
        int[] array = UtilExamen.generaArray(10, 0, 9);// 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> ordenaArray = UtilExamen.ordenaArray(array);  // 'arraylist' resultado
        // Calcula l''ArrayList' emprant el mètode 'ordenaArray' 
        System.out.println("Este es el ArrayList Ordenado: " + ordenaArray);
        // Mostra l''ArrayList' resultant
    }
}

