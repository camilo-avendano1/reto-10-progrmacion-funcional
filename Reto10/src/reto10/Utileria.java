package reto10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utileria {

    public static double scanDouble(String mensaje) {   //ESCANER PARA INGRESAR DOUBLE
        System.out.println(mensaje);
        return new Scanner(System.in).nextDouble();
    }

    public static String scanString(String mensaje) {
        System.out.println(mensaje);
        return new Scanner(System.in).nextLine(); //ESCANER PARA INGRESAR STRING
    }

    public static int scanInt(String mensaje) {
        System.out.println(mensaje);
        return new Scanner(System.in).nextInt(); //ESCANER PARA INGRESAR ENTEROS
    }

    public static void raices(List<Double> doubles) {
        if (doubles.size() > 0) {
            List<Double> raices = doubles.stream().map(n -> Math.sqrt(n)).collect(Collectors.toList());
            System.out.println("Las raices son las siguientes: ");
            raices.stream().forEach(System.out::println);
        } else {
            System.out.println("No hay elementos en la lista.");
        }
    }

    public static int sumarDigitos(int numero) {
        if (numero == 0) { // si el numero es cero retornamos cero
            return 0; // cambio remoto pa ver si lo trae al original

        } else {
            System.out.println("numero a sumar ahorita " + (numero % 10));
            return numero % 10 + sumarDigitos(numero / 10); // vamos obeteniendo el ultimo numero y vamos sumando
        }
    }

    public static void factorial(int n) {
        System.out.println("El factorial es: "+IntStream.rangeClosed(1, n)
         .reduce(1, (int a, int b) -> a * b));
    }
    
    public static void cadenas(String palabras){
      List<String> palabrasEncontradas= Arrays.asList(palabras.split(" ")).stream()
       .filter(c -> c.length() > 5).collect(Collectors.toList());
      
        if(palabrasEncontradas.size()>0){
        System.out.println("Las palabras mayores a 5 son:");
        palabrasEncontradas.forEach(System.out::println);
        }else{
            System.out.println("No hay palabras mayores a 5");
        }
    }
}

