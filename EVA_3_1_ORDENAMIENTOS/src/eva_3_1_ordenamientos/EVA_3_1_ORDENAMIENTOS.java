package eva_3_1_ordenamientos;

/**
 *
 * @author Alexis M.
 */
public class EVA_3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[10000];
        int[] arregloSel = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL: ");
        llenar(arregloDatos);
        //imprimir(arregloDatos);
        System.out.println("SELECTION SORT: ");
        copiar(arregloDatos, arregloSel);
        //imprimir(arregloSel);
        System.out.println("ARREGLO ORDENADO:");
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        //imprimir(arregloSel);
        System.out.println("Tiempo que le toma ordenar = " + (fin - ini));
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
            } else 
                System.out.print("[" + arreglo[i] + "]");
            

        }
        System.out.println("");
    }

    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    
    //SELECTION SORT (n^2)
    //COMPARACIONES
    //INTERCAMBIOS (SWAP)
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCO EL ELEMENTO(POSICION) MAS PEQUEÑO
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el numero mas pequeño
                if(arreglo[min] > arreglo[j])
                    min = j;
                
            }
            //SWAP INTERCAMBIAR
             if(min != i){
                 int temp = arreglo[i];
                 arreglo[i] = arreglo[min];
                 arreglo[min] = temp;
             }
        }
    }
    
    
    
    
    
    
}