/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
 */
package Servicios;

import Entidades.Perros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerros {
    Scanner scan= new Scanner (System.in);
    private ArrayList<String> razas= new ArrayList<String>();
    
    public Perros crearPerros (){
        Perros p= new Perros();
        System.out.println("Ingrese la raza");
        p.setRaza(scan.next());
        return p;
    }
   
    public void pedirRazas (){
        boolean ingresar= true;
        do {
           Perros p = crearPerros();
           razas.add(p.getRaza());
           
            System.out.println("Desea ingresar un nuevo perro? SI/NO");
            String respuesta = scan.next();
            
            if (!respuesta.equalsIgnoreCase("si")) {
               
                ingresar = false;
            }
         
        } while (ingresar);//Se puede dejar solo ingresar, se asume que es verdadero 
        mostrarPerros();
        
    }
    public void mostrarPerros(){
        System.out.println("Las razas ingresadas son : ");
        for (String aux : razas){
            System.out.println(aux);
        }
        System.out.println("Cantidad: "+ razas.size());
    }
    
    public void pedirPerro (){
        int cantPerros=0;
        int cantInicial= razas.size();
        System.out.println("Digite la raza del perro que desea eliminar");
        String perro= scan.next();
        Iterator<String> it= razas.iterator();
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(perro)) {
                it.remove();
                System.out.println("El perro raza "+ perro + " a sido eliminado.");
          
            }else{
                cantPerros ++;
            }
            if (cantPerros == cantInicial) {
                System.out.println("No se elimino ningun perro");
            }
        }
        Collections.sort(razas);
        System.out.println("Las razas ordenadas son : ");
        for (String aux : razas){
            System.out.println(aux);
        }
        
    }
}
