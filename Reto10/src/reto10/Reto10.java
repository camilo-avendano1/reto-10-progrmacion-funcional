/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import static reto10.Estudiante.ingresarEstudiante;
import static reto10.Estudiante.mayorPromedio;
import static reto10.Estudiante.menorPromedio;
import static reto10.Estudiante.promedioTotal;
import static reto10.Utileria.cadenas;
import static reto10.Utileria.factorial;
import static reto10.Utileria.raices;
import static reto10.Utileria.scanDouble;
import static reto10.Utileria.scanInt;
import static reto10.Utileria.scanString;
import static reto10.Utileria.sumarDigitos;

/**
 *
 * @author User
 */
public class Reto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Double> dobles = new ArrayList();
        dobles.add(2.3);
        dobles.add(9.0);
  double opcion = -1;
        ArrayList<Estudiante> estudiantes = new ArrayList(); //creamos la lista de estudiantes.
        while (opcion != 0) {
            try {
                opcion = scanDouble("\n!!BIENVENIDO AL RETO 10!!\n "
                 + "LEE LAS OPCIONES DISPONIBLES E INGRESE LA QUE DESEA ACCIONAR:\n"
                 + "1) SUMA DE DIGITOS DE UN NÚMERO ENTERO\n"
                 + "2) RESPUESTA DE LA FUNCIÓN flatmap.\n"
                 + "3) ENCONTRAR RAICES DE UNA LISTA\n"
                 + "4) INGRESAR ESTUDIANTE NUEVO.\n"
                 + "5) CONSULTAR PROMEDIO DE TODOS LOS ESTUDIANTES\n"
                 + "6) CONSULTAR ESTUDIANTE/S CON MAYOR PROMEDIO.\n"
                 + "7) CONSULTAR ESTUDIANTE/S CON MENOR PROMEDIO. \n"
                 + "8) FACTORIAL RECURSIVO\n"
                 + "9) CONTADOR DE CARACTERES.\n"
                 + "0) SALIR.\n");

                switch ((int)opcion) {
                    case 1:
                        System.out.println(sumarDigitos(scanInt("Ingrese el número al cual desea sumarle los digitos. ")));
                        break;
                    case 3:
                        raices(dobles);
                        break;
                    case 4:
                        ingresarEstudiante(estudiantes);
                        break;
                    case 5:
                        promedioTotal(estudiantes);
                        break;
                    case 6:
                        mayorPromedio(estudiantes);
                        break;
                    case 7:
                        menorPromedio(estudiantes);
                        break;
                    case 8:
                        factorial(scanInt("Ingrese el número al cual desea conocerle el factorial."));
                        break;
                    case 9:
                        cadenas(scanString("Ingrese las palabras que deseas analizar."));
                        break;
                    default:
                        System.out.println("Ingrese una opción del menú");
                }
              

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor válido por favor. ERROR: " + e.toString());
            }
            catch (NoSuchElementException e){
                System.out.println("No hay estudiantes registrados. ERROR: " + e.getMessage());
            }
        }
    }

}


