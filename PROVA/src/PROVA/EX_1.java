package PROVA;
import PROVA.UtilExamen;
import java.util.ArrayList;
public class EX_1 {   
    public static void main(String[] args) {
        int[] array = UtilExamen.generaArray(5, 0, 9);
        // Crea un 'Array' de 5 posicions amb números aleatoris entre 0 i 9
        ArrayList<Integer> arrayL = UtilExamen.arrayToArrayList(array);
        // arrayL tendra los resultados de ArrayList que hemos pasado por el metodo
        // Calcula l''ArrayList' emprant el mètode 'arrayToArrayList' 
        System.out.println("El array ahora es un ArrayList: " + arrayL);  // CORRECCIÓ: no usas el método 'mostrarArrayListInt' que se pide
        // Mostra l''ArrayList' resultat emprant el mètode 'mostraArrayListInt' 
    }
}

