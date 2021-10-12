
/*
    Método inserción:
	Si numeroIzq > numeroActual
            Cambio
 */
import static Vectores.Vector.*;

/**
 *
 * @author Aylen
 */

public class MetodoInsercion {

    public static void main(String[] args) {
        int vec[] = {3, 65, 23, -32, 90, 20, 80, -45, 0, -24};
        int pos, aux;

        System.out.println("Vector desordenado: ");
        mostrarVector(vec);

        // Ordenamiento por inserción
        for (int i = 0; i < vec.length; i++) {
            pos = i;
            aux = vec[i];

            while ((pos > 0) && (vec[pos - 1] > aux)) {
                vec[pos] = vec[pos - 1];
                pos--;
            }

            vec[pos] = aux;
        }

        System.out.println("\nOrden ascendente: ");
        mostrarVector(vec);
    }
}
