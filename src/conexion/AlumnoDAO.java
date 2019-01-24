/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import modelo.Alumno;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author mati
 */
public class AlumnoDAO {

    public Alumno obtenerAlumnoById(int id) {
        Session s = NewHibernateUtil.getCurrentSession();
        s.beginTransaction();
        Alumno result = (Alumno) s.get(Alumno.class, id);
        s.getTransaction().commit();
        s.close();
        return result;
    }

    public void altaAlumno(Alumno a) {
        Session s = NewHibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }

    public void bajaAlumno(Alumno a) {
        Session s = NewHibernateUtil.getCurrentSession();
        s.beginTransaction();
        s.delete(a);
        s.getTransaction().commit();
        s.close();
    }
}
