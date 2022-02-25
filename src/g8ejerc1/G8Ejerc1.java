/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package g8ejerc1;

import Entidades.Perros;
import Servicios.ServicioPerros;

public class G8Ejerc1 {

   
    public static void main(String[] args) {
     ServicioPerros serPerros = new ServicioPerros ();
     Perros p= new Perros();
     serPerros.pedirRazas();
     serPerros.pedirPerro();
    
    }
    
}
