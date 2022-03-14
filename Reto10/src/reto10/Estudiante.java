package reto10;

import java.util.ArrayList;
import static reto10.Utileria.scanDouble;
import static reto10.Utileria.scanString;

public class Estudiante {

    private String nombre;
    private String apellido;
    private double promedio;

    public Estudiante(String nombre, String apellido, double promedio) { //constructor 
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public Estudiante() {
    }// constructor vacio.
    
    public static void ingresarEstudiante(ArrayList <Estudiante> estudiantes){
        estudiantes.add(new Estudiante(scanString("Ingrese el nombre del estudiante: "), scanString("Ingrese el apellido del estudiante"), scanDouble("Ingrese el promedio de notas del estudiante: ")));
    }
    public static void promedioTotal(ArrayList<Estudiante> estudiantes) { 
        double suma = estudiantes.stream()
         .mapToDouble(n -> n.getPromedio())
         .average()     //funcion de promedio.
         .getAsDouble(); //convertimos a double
        System.out.println("El promedio de notas de todos los estudiantes registrados es: "+suma);
    }
    
    public static void mayorPromedio(ArrayList<Estudiante> estudiantes){
        System.out.println(
           estudiantes.stream()
         .map(estudiante -> estudiante.getPromedio())
        )
        ;
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre: " + nombre + ", apellido: " + apellido + ", promedio: " + promedio + '}';
    }
}
