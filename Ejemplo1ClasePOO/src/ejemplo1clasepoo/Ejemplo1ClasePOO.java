/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1clasepoo;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Ejemplo1ClasePOO {

    //atributos
    private String nombre;
    private int edad;
       
    public Ejemplo1ClasePOO(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  
    //metodos
    public void cargarDatos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        nombre=lector.next();
        System.out.println("Digite la edad: ");
        edad = lector.nextInt();
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    public void esMayorEdad(){
        if (edad<18){
            System.out.println(nombre+" no es mayor de edad");
        }
        else {
            System.out.println(nombre+" es mayor de edad ");
        }            
    }
       
    
}