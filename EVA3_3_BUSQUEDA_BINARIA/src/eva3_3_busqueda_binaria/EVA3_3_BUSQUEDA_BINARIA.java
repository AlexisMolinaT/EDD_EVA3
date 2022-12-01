/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA3_3_BUSQUEDA_BINARIA {

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
        
        System.out.println("INSERTION SORT: ");
        copia(arregloDatos, arregloSel);
        imprimir(arregloSel);
        ini = System.nanoTime();
        insertionSort(arregloSel);
        fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Insertion sort = " + (fin - ini));
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor que deseas buscar: ");
        int buscar = input.nextInt(); 
        //System.out.println("");
        
        System.out.println("El valor esta en " + busquedaBinaria(arregloSel, buscar));
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
    //BUSQUEDA BINARIA            //arreglo con los datos, valor a buscar
    public static int busquedaBinaria(int[] datos, int valor){
        return busquedaBinRec(datos, 0, datos.length - 1, valor);
    }
    
    private static int busquedaBinRec(int[] datos, int ini, int fin, int valor){
        int mitad = ini + ((fin - ini) / 2);
        int resu = -1;
        
        
        if(ini < fin){ //aqui hacemos la busqueda recursiva
            if(valor == datos[mitad]) //lo encontramos
                resu = mitad; //posicion donde esta el valor que buscamos
            else if(valor < datos[mitad]) //menor que la mitad, esta a la izquierda
                resu = busquedaBinRec(datos, 0, mitad - 1, valor); 
            else  //mayor, esta a la derecha
                 resu = busquedaBinRec(datos, mitad + 1,fin, valor);
        } 
        return resu;
    
}
}