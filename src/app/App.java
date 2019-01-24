/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import conexion.AlumnoDAO;
import conexion.ProfesorDAO;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import modelo.Alumno;
import modelo.Profesor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Maite
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoDAO alumdao = new AlumnoDAO();
        ProfesorDAO profdao = new ProfesorDAO();

        Alumno alum = new Alumno("Tihomir", 2000f, "1", Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), "Observame esta");

        alumdao.altaAlumno(alum);

        Alumno alumRecuperado = alumdao.obtenerAlumnoById(1);
        System.out.println(alumRecuperado.toString());

        alumdao.bajaAlumno(alum);
        System.out.println("Eliminado con exito");

        Profesor prof = new Profesor("Pep", "Bananano", "Pepet", "Funcionario basico");
        profdao.altaProfesor(prof);
        System.out.println("Dado de alta profesor " + prof.toString());
        Profesor profRecuperado = profdao.obtenerProfesorById(11);
        System.out.println("Recuperado " + profRecuperado);
       // profdao.bajaProfesor(profRecuperado);
        //System.out.println("Elimindocon exito " + prof);

    }

}
