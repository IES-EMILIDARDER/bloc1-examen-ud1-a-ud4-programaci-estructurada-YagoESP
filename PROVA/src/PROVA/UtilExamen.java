package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    
    // Utilizamos este metodo para pasar un array a un ArrayList
    // Primer Ejercicio
    public static ArrayList<Integer> arrayToArrayList(int [] array){
        ArrayList<Integer> ArrayL = new ArrayList<>();
         // <- Creamos el ArrayList
        for(int i = 0; i < array.length; i++) {
            // <- Leeremos el array que hemos recibido
            ArrayL.add(array[i]);
            // <- por cada posicion insertaremos al ArrayList
        }
        //devolvemos el arraylist
        return ArrayL;
    }
    
    // Utilizamos este metodo para obtener los numeros repetidos entre 2 arrays
    // Segundo Ejercicio
    public static ArrayList<Integer> obteRepetits(int [] array1, int [] array2){
        ArrayList<Integer> ObtenerRepetidos = new ArrayList<>();
        // leemos el array
        for(int i = 0; i < array1.length; i++) {
            // iniciamos que los elementos sean false, porq en un principio no
            //no sabes si existen o no
            boolean existe = false;
            
            for(int j = 0; j < array2.length; j++) {
                // Leemos el segundo array para compararlos
                // comparamos
                if(array1[i] == array2[j]){
                    existe = true;
                    break;
                }
            }
            
            if (existe){ // ? Si encontró en array2, lo a?ade   // CORRECCIÓ: no se pide tanta complicación ...
                boolean existeenarray1 = false;
                for (int q = 0; q < ObtenerRepetidos.size(); q++) {
                    if(array1[i] == ObtenerRepetidos.get(q)){
                        existeenarray1 = true;
                        break;
                    }
                }
                if(!existeenarray1){
                    ObtenerRepetidos.add(array2[i]);
                }    
            }
        }        
        return ObtenerRepetidos;
    }
    
    // Utilizamos este metodo para ordenar el ArrayList 
    // Tercer Ejercicio
    public static ArrayList<Integer> ordenaArray(int [] array){
        ArrayList<Integer> ordenaArray = new ArrayList<>();
        
        for(int i = 0; i < array.length; i++) {
            // Buscamos la posición donde insertarlo
            boolean existe = false;
            for(int j = 0; j < ordenaArray.size(); j++) {
                 
                if(array[i] < ordenaArray.get(j)){
                    existe= true;
                    ordenaArray.add(j, array[i]);
                    break;
                }
            }
            //Insertamos en la posición correspondiente
            if(!existe){
                ordenaArray.add(array[i]);
            }
        }
        return ordenaArray;
    }
    
    //Este metodo obtiene un arrayList repetido y ordenado
    //Cuarto Ejercicio
    public static ArrayList<Integer> obteRepetitsOrdenat(int[] array) {
        ArrayList<Integer> ObtenerRepetidoOrdenado = new ArrayList<>();
        
        for(int i = 0; i < array.length; i++) {
            boolean existe = false;

            // Verificar si el elemento ya existe
            for(int j = 0; j < ObtenerRepetidoOrdenado.size(); j++) {
                
                if(array[i] == ObtenerRepetidoOrdenado.get(j)) {
                    existe = true;
                    break;
                }
            }

            // Si no existe, buscamos la posición correcta
            if(!existe){
                boolean orden = false;

                for(int j = 0; j < ObtenerRepetidoOrdenado.size(); j++) {
                    if(array[i] < ObtenerRepetidoOrdenado.get(j)) {
                        ObtenerRepetidoOrdenado.add(j, array[i]);
                        orden = true;
                        break;
                    }
                }

                // Si no encontró posición, lo a?ade al final
                if(!orden) {
                    ObtenerRepetidoOrdenado.add(array[i]);
                }
            }
        
        }
        return ObtenerRepetidoOrdenado;
    }    
    
    // Traemos un array y devolvemos longitud: cuantas posiciones y minimo y maximo
    // minimo: Valores minimos dentro de la posicion
    // maximo: Valores maximos dentro de la posicion
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }
     
}
