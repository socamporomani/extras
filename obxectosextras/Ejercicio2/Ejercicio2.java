/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author socamporomani
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Clase1 obj1= new Clase1(5,4); 
 System.out.print(obj1.modificar(4)+" "); 
 /* 
 Crea obj1 y a partir de 5 y 4 se le suma 4 para que de 8 y 9
 */
 Clase1 obj2= new Clase1(5,4); 
 System.out.print(obj2.modificar(5)+" "); 
 /*
  Crea obj2 y a partir de 5 y 4 se le suma 5 para que de 9 y 10
 */
 obj2=obj1; 
 System.out.println(obj2.modificar(5)+" "); 
 /*
 Apartir de igualar obj1 a obj2 partimos de los numeros 8 y 9 a los que se les suma 5
 */
 }//fin main 
} 
class Clase1{ 
 int p1,p2; 
 public Clase1 (int i, int j){ 
 p1=i; 
 p2=j; 
 } 
 public int modificar(int i){ 
 p1=p1+i; 
 p2=p2+i; 
 System.out.print(p2+" "); 
 return p1; 
 }   
 
}
    

