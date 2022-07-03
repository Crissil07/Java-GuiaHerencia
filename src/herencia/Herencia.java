/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Date;

public class Herencia {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList();
        
        
        Alumno alumno = new Alumno();

        alumno.llenarAlumno();

        Profesor profesor = new Profesor();

        profesor.llenarProfesor();

        Date fechaNacimiento2 = new Date();

        fechaNacimiento2.setDate(23);
        fechaNacimiento2.setMonth(6);
        fechaNacimiento2.setYear(1990);

        Director director = new Director(20000, 8, "Pilar", "Gonzalez", 123124, fechaNacimiento2);

        personas.add(alumno);

        personas.add(profesor);
        
        personas.add(director);

        for (Persona pr : personas) {

            if (pr instanceof Director) {
                System.out.println("La edad de mi director es: " + pr.calcularEdad());
            }
            

        }
    }

}
