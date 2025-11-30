package PROVA;
import PROVA.UtilExamen;
import java.util.ArrayList;
public class EX_4 {
    public static void main(String[] args) {
        int[] array = UtilExamen.generaArray(10, 0, 9);  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> OrdenadoRepetir = UtilExamen.obteRepetitsOrdenat(array);  // 'arraylist' resultado
        // Calcula l''ArrayList' emprant el mètode 'obteRepetitsOrdenat'
        System.out.println("ArrayList Ordenado y sin repeticiones: " + OrdenadoRepetir);
        // Mostra l''ArrayList' resultant  
        // NOTA: el mètode 'obteRepetitsOrdenat' pot servir-se dels mètodes anteriors:
        // 'obteRepetits' -> 'arrayListToArray' -> 'ordenaArray' 
    }
}

