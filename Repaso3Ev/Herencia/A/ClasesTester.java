package Repaso3Ev.Herencia.A;

public class ClasesTester {
       public static void main(String[] args) {
        Persona persona = new Persona("John", "Doe");
        Alumno alumno = new Alumno("Alice", "Smith", "Q1B");
        Profesor profesor = new Profesor("Robert", "Johnson", "D6-212");

        System.out.println(persona);
        System.out.println(alumno);
        System.out.println(profesor);
    }
}
