/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto10;

/**
 *
 * @author User
 */
public class Reto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         // # 256 -> 2 + 5 + 6 = 13
         
         System.out.println(sumarDigitos(234));
    }
    
    static public int sumarDigitos(int numero){
        if (numero == 0){ // si el numero es cero retornamos cero
            return 0; // cambio remoto pa ver si lo trae al original
            
        } else {
            System.out.println("numero a sumar ahorita " + (numero % 10 ));
            return numero % 10 + sumarDigitos(numero/10); // vamos obeteniendo el ultimo numero y vamos sumando
        }

    
    }
}
