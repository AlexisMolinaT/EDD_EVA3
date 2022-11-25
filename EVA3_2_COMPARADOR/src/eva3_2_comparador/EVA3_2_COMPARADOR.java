package eva3_2_comparador;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Alexis M.
 */
public class EVA3_2_COMPARADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> miLista = new <Integer>LinkedList();
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        
        System.out.println(miLista);
        //ORDENAR --> COMPARATOR
        //COMPARATOR ES UNA INTERFAZ
        Comparator ordenar = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)o2;
                
                /*if(val1 < val2)
                    return -1;
                else if(val1 > val2)
                    return +1;
                else
                return 0;*/
                return val1 - val2;

            }
        };
        miLista.sort(ordenar);
        System.out.println("ORDENADO MENOR A MAYOR");
        System.out.println(miLista);
        
        LinkedList<Persona> ListaPersonas = new <Persona>LinkedList();
        ListaPersonas.add(new Persona("Ricardo", "Molina", "Terrazas", 19, 1000));
        ListaPersonas.add(new Persona("Eduardo", "Muñoz", "Torres", 29, 1200));
        ListaPersonas.add(new Persona("Roberto", "Montes", "Tarango", 49, 1500));
        ListaPersonas.add(new Persona("Armando", "Marquez", "Lres", 54, 3000));
        ListaPersonas.add(new Persona("Fernando", "Torrez", "Enriquez", 12, 300));
        ListaPersonas.add(new Persona("Emilio", "Esparza", "Molina", 15, 6000));
        ListaPersonas.add(new Persona("Ruben", "Enriquez", "Torres", 22, 700));
        ListaPersonas.add(new Persona("Alejandro", "Perez", "Garcia", 23, 10));
        ListaPersonas.add(new Persona("Esteban", "Martinez", "Chamorro", 78, 650));
        ListaPersonas.add(new Persona("Juan", "Sainz", "Olivas", 30, 645));
        ListaPersonas.add(new Persona("Luis", "Ramirez", "Del Campo Loa", 51, 11));
        
        //COMPARATOR: APELLIDO PATERNO
        //COMPARATOR: SALARIO
        
        //COMO RECORRER COLLECTIONS
        //ITERATOR
        
        for ( Iterator<Persona> iterator = ListaPersonas.iterator();
                iterator.hasNext();){
            Persona perso = iterator.next();
            System.out.print(perso.getNombre() + " ");
            
        }
        

    }
}
     class Persona{
        private String nombre;
        private String paterno;
        private String materno;
        private int edad;
        private double salario;   

        public Persona(String nombre, String paterno, String materno, int edad, double salario) {
            this.nombre = nombre;
            this.paterno = paterno;
            this.materno = materno;
            this.edad = edad;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPaterno() {
            return paterno;
        }

        public void setPaterno(String paterno) {
            this.paterno = paterno;
        }

        public String getMaterno() {
            return materno;
        }

        public void setMaterno(String materno) {
            this.materno = materno;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    
        
        
        
} 

   
    
    
    
    

