/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogetset;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class EjemploGetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
       
         Persona person = new Persona();
        // Persona person = new Persona("Edwin",33); Opcion2 con envio
        
        System.out.println("Digite nombre: ");
        person.setNombre(lector.next());
        
        System.out.println("Digite edad: ");
        person.setEdad(lector.nextInt());
        
        System.out.println("El nombre es: "+person.getNombre());
        System.out.println("La edad es: "+person.getEdad());
    }
    
}
