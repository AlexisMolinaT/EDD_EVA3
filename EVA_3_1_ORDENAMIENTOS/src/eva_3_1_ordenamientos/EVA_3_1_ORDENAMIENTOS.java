package eva_3_1_ordenamientos;

/**
 * @author moviles
 */
public class EVA_3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);

        System.out.println("SELECCTION SORT: ");
        copia(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection sort = " + (fin - ini));
        
        System.out.println("INSERTION   SORT: ");
        copia(arregloDatos, arregloSel);
        imprimir(arregloSel);
        ini = System.nanoTime();
        insertionSort(arregloSel);
        fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Insertion sort = " + (fin - ini));
    }

    //LLENAR ARREGLO
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    //IMPRIMIR ARREGLO
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 10) {
                System.out.print("[" + arreglo[i] + "]");
            } else {
                System.out.print("[" + arreglo[i] + "]");
            }
        }
        System.out.println("");

    }

    //COPIA ARREGLO
    public static void copia(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    //SELECCTION SORT O(n^)
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCO EL ELEMENTO (POSICION) MAS PEQUEñO
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
            }
            //SWAP INTERRCAMBIAR
            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }

    //INSERTION SORT O(n^2)
    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; //es el valor que vamos a ordenar
            int insP = i;
            //EN QUE PUNTO DEBE DE QUEDAR TEMP
            //ESA POSICION QUEDA ALMACENADA EN insP
            for (int prev = i - 1; prev >= 0; prev--) { //comparar
                if (arreglo[prev] > temp) {
                    //swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                } else {
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }
    
    //BUBBLE SORT NO LO VAMOS A PROGRAMAR
    
    //QUICKSORT PUBLICO
    public static void quicksort(int[] arreglo){
        quickSortRec(arreglo, 0, arreglo.length - 1);
        
    }
    
    public static void quickSortRec(int[] arreglo, int ini, int fin){
        //pivote --> posición
        //dos indices:
        //ind_gran --> busca los mayores al pivote
        //ind_peq --> busca los menores al pivote
        //si se encuentran valores, se intercambian
        //si se cruzan, se intercambia pivote con el ind_peq
        //quicksort a cada lado del pivote
        
        
}
    
    
    
}