
/*
    Método burbuja:
	Si numeroActual > numeroSiguiente
            Cambio
*/

import static Vectores.Vector.*;

/**
 *
 * @author Aylen
 */
public class MetodoBurbuja {
    public static void main(String[] args) {
        int vec[] = { 3, 65, 23, -32, 90, 20, 80, -45, 0, -24 };
        int aux;
        
        System.out.println("Vector desordenado: ");
        mostrarVector(vec);
        
        // Método burbuja
        for(int i = 0; i < vec.length - 1; i++) {
            for(int j = 0; j < vec.length - 1; j++) {
                if(vec[j] > vec[j+1]) {
                   aux = vec[j];
                   vec[j] = vec[j+1];
                   vec[j+1] = aux;
                }
            }
        }
        
        System.out.println("\nVector ordenado: ");
        mostrarVector(vec);
    }
}
