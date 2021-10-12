
/*
    Método Selección:
	1. Buscar el mínimo elemento del vector.
	2. Intercambiarlo con la posición actual
        3. Avanzar una posición
*/

import static Vectores.Vector.mostrarVector;

/**
 *
 * @author Aylen
 */

public class MetodoSeleccion {
    public static void main(String[] args) {
        int vec[] = {3, 65, 23, -32, 90, 20, 80, -45, 0, -24};
        int aux, indexMin;

        System.out.println("Vector desordenado: ");
        mostrarVector(vec);
        
        // Método por selección
        for(int i = 0; i < vec.length; i++) {
            indexMin = buscarMenor(vec, i);
            if(indexMin != i) {
                aux = vec[i];
                vec[i] = vec[indexMin];
                vec[indexMin] = aux;
            }
        }
        
        System.out.println("Orden ascendente: ");
        mostrarVector(vec);
    }
    
    public static int buscarMenor(int arr[], int index) {
        int indexMenor = index;
        
        for(int i = index; i < arr.length; i++) {
            if(arr[i] < arr[indexMenor]) {
                indexMenor = i;
            }
        }
        
        return indexMenor;
    }
}
