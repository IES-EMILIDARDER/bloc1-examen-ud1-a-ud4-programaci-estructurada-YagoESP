package PROVA;
import PROVA.UtilExamen;
import java.util.ArrayList;
public class EX_2 {
    public static void main(String[] args) {
        int[] array1 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        int[] array2 = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultado = UtilExamen.obteRepetits(array1, array2);  // 'arraylist' resultant
        // Calcula l''ArrayList' emprant el mètode 'obteRepetits' 
        System.out.println("Array1: " + array1);  // CORRECCIÓ: no usas el método: 'mostrarArray'
        System.out.println("Array2: " + array2);  // CORRECCIÓ: idem
        System.out.println("Resultado del arraylist: " + resultado);
            // Mostra els 2 'Array' i l''ArrayList' resultant
    }
}

