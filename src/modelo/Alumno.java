package modelo;
// Generated 24/01/2019 12:13:40 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private float sueldo;
     private String registrado;
     private Date fechaNac;
     private Date horaTutoria;
     private Date fechaRegistro;
     private String observaciones;

    public Alumno() {
    }

    public Alumno(String nombre, float sueldo, String registrado, Date fechaNac, Date horaTutoria, Date fechaRegistro, String observaciones) {
       this.nombre = nombre;
       this.sueldo = sueldo;
       this.registrado = registrado;
       this.fechaNac = fechaNac;
       this.horaTutoria = horaTutoria;
       this.fechaRegistro = fechaRegistro;
       this.observaciones = observaciones;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public String getRegistrado() {
        return this.registrado;
    }
    
    public void setRegistrado(String registrado) {
        this.registrado = registrado;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public Date getHoraTutoria() {
        return this.horaTutoria;
    }
    
    public void setHoraTutoria(Date horaTutoria) {
        this.horaTutoria = horaTutoria;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", registrado=" + registrado + ", fechaNac=" + fechaNac + ", horaTutoria=" + horaTutoria + ", fechaRegistro=" + fechaRegistro + ", observaciones=" + observaciones + '}';
    }




}

