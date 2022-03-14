/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import static reto10.Estudiante.ingresarEstudiante;
import static reto10.Estudiante.mayorPromedio;
import static reto10.Estudiante.promedioTotal;
import static reto10.Utileria.scanDouble;
import static reto10.Utileria.scanInt;
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
  double opcion = -1;
        ArrayList<Estudiante> estudiantes = new ArrayList(); //creamos la lista de estudiantes.
        while (opcion != 0) {
            try {
                opcion = scanDouble("\n!!BIENVENIDO AL RETO 10!!\n "
                 + "LEE LAS OPCIONES DISPONIBLES E INGRESE LA QUE DESEA ACCIONAR:\n"
                 + "1) SUMA DE DIGITOS DE UN NÚMERO ENTERO\n"
                 + "2) RESPUESTA DE LA FUNCIÓN flatmap.\n"
                 + "3) \n"
                 + "4) INGRESAR ESTUDIANTE NUEVO.\n"
                 + "5) CONSULTAR PROMEDIO DE TODOS LOS ESTUDIANTES\n"
                 + "0) SALIR.\n");

                switch ((int)opcion) {
                    case 1:
                        System.out.println(sumarDigitos(scanInt("Ingrese el número al cual desea sumarle los digitos. ")));
                        break;
                    case 4:
                        ingresarEstudiante(estudiantes);
                        break;
                    case 5:
                        promedioTotal(estudiantes);
                        break;
                    case 6:
                        mayorPromedio(estudiantes);
                }
                //

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor válido por favor. ERROR: " + e.toString());
            }
            catch (NoSuchElementException e){
                System.out.println("No hay estudiantes registrados. ERROR: " + e.getMessage());
            }
        }
    }

}

