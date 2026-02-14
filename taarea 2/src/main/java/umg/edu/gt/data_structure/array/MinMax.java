package umg.edu.gt.data_structure.array;

public class MinMax {
	public void findSecondMinMax(int[] arr) {
        // Verificación de seguridad: si el arreglo es muy pequeño no hay segundos
        if (arr == null || arr.length < 2) {
            System.out.println("El arreglo debe tener al menos 2 elementos.");
            return;
        }

        // Inicializamos usando los primeros elementos para evitar valores basura
        int mayor1 = Math.max(arr[0], arr[1]);
        int mayor2 = Math.min(arr[0], arr[1]);
        int menor1 = Math.min(arr[0], arr[1]);
        int menor2 = Math.max(arr[0], arr[1]);

        // Usamos un ciclo while para variar la estructura (Sigue siendo un solo recorrido)
        int i = 2; 
        while (i < arr.length) {
            int actual = arr[i];

            // Lógica de comparación para extremos máximos
            if (actual != mayor1) {
                if (actual > mayor1) {
                    mayor2 = mayor1;
                    mayor1 = actual;
                } else if (actual > mayor2) {
                    mayor2 = actual;
                }
            }

            // Lógica de comparación para extremos mínimos
            if (actual != menor1) {
                if (actual < menor1) {
                    menor2 = menor1;
                    menor1 = actual;
                } else if (actual < menor2) {
                    menor2 = actual;
                }
            }
            
            i++; // Incremento del puntero
        }

        // Salida de datos
        System.out.println("Análisis de Arreglo");
        System.out.println("Segundo valor más alto: " + mayor2);
        System.out.println("Segundo valor más bajo: " + menor2);
    }

}
