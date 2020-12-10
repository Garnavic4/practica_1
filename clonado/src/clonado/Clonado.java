/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonado;

/**
 *
 * @author Estela
 */
public class Clonado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int solucionsuma , solucionresta;
        solucionresta = resta(8,2);
        solucionsuma = suma(5,4);
        System.out.println("La suma es: " + solucionsuma);
        System.out.println("La resta es: " + solucionresta);
    }
 
     public static int suma (int a, int b){
        int sol;
        sol = a + b;
        return sol;
    }
      public static int resta (int a, int b){
      int sol;
      sol = a - b;
      return sol;
  }
}
