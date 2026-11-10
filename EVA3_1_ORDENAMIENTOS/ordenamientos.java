public class ordenamientos {
    public static void main(String[] args) {
        int[] original = new int[5];
        int[] seleccion = new int[5];
        // Llenar el arreglo original con números aleatorios
        llenarArreglo(original); 
        copiarArreglo(original, seleccion);
        System.out.print("Arreglo original: ");
        imprimirArreglo(original);
        //selection sort
        System.out.println("Selection Sort");
        ordenarSeleccion(<seleccion);
        // Imprimir el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(seleccion);
        //fin 
        System.out.println("Fin del Selection Sort");
    }

    public static void llenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void copiarArreglo(int[] original, int[] copia) {
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
    }
    
    // Método para intercambiar posiciones
    public static void intercambiar(int[] arreglo, int pos1, int pos2) {
        int temp = arreglo[pos1];
        arreglo[pos1] = arreglo[pos2];
        arreglo[pos2] = temp;
    }
    // Método para ordenar el arreglo usando Selection Sort
    public static void ordenarSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j; 
                }
            } 
            
            
            intercambiar(arreglo, i, min);
        } 
    }

}

    

