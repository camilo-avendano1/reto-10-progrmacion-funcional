
package reto10;

import java.util.Scanner;

public class Utileria {

   public static double scanDouble(String mensaje){   //ESCANER PARA INGRESAR DOUBLE
       System.out.println(mensaje);
       return new Scanner(System.in).nextDouble(); 
   }
   
   public static String scanString(String mensaje){
       System.out.println(mensaje);
       return new Scanner(System.in).nextLine(); //ESCANER PARA INGRESAR STRING
   }
   
   public static int scanInt(String mensaje){
       System.out.println(mensaje);
       return new Scanner(System.in).nextInt(); //ESCANER PARA INGRESAR ENTEROS
   }
    
    public static int sumarDigitos(int numero){
        if (numero == 0){ // si el numero es cero retornamos cero
            return 0; // cambio remoto pa ver si lo trae al original
            
        } else {
            System.out.println("numero a sumar ahorita " + (numero % 10 ));
            return numero % 10 + sumarDigitos(numero/10); // vamos obeteniendo el ultimo numero y vamos sumando
        }
    }
}
