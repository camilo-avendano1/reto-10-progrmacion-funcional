package reto10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
        if(estudiantes.size() > 0){
        List <Estudiante> resultado = estudiantes.stream().filter(estudiante -> estudiante.getPromedio() == estudiantes.stream()
        .mapToDouble(Estudiante::getPromedio)
        .max().getAsDouble())
        .collect(Collectors.toList());
        System.out.println("El/los estudiantes con mayor promedio son:");
        resultado.forEach(System.out::println);
        }else{
            System.out.println("No hay estudiantes por analizar.");
        }
    }
    public static void menorPromedio(ArrayList<Estudiante> estudiantes){
        if(estudiantes.size() > 0){
        List <Estudiante> resultado = estudiantes.stream().filter(estudiante -> estudiante.getPromedio() == estudiantes.stream()
        .mapToDouble(Estudiante::getPromedio)
        .min().getAsDouble())
        .collect(Collectors.toList());
        System.out.println("El/los estudiantes con menor promedio son:");
        resultado.forEach(System.out::println);
        }else{
            System.out.println("No hay estudiantes por analizar.");
        }
    
    
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
        return "nombre: " + nombre + ", apellido: " + apellido ;
    }
}

