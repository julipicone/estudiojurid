/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiojuridico;

import java.util.Date;

/**
 *
 * @author Julieta
 */
public class Persona {

  
  private String nombre;
  private String apellido;
  private String dni;
  private String telefonoCel;
  private String telefonoFijo;
  private String domicilio;
  private int edad;
  private Date fechaNacimiento;
  
  //CONSTRUCTOR
  public Persona(){
    
  }
  //METODO
  
  public void mostrarDatos(){
    System.out.println("Nombre: "+ getNombre());
    System.out.println("Apellido: "+ getApellido());
    System.out.println("Dni: "+ getDni());
  }
  /**
   * @return the domicilio
   */
  public String getDomicilio() {
    return domicilio;
  }

  /**
   * @param domicilio the domicilio to set
   */
  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }
  
  

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @param apellido the apellido to set
   */
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  /**
   * @return the dni
   */
  public String getDni() {
    return dni;
  }

  /**
   * @param dni the dni to set
   */
  public void setDni(String dni) {
    this.dni = dni;
  }

  /**
   * @return the telefonoCel
   */
  public String getTelefonoCel() {
    return telefonoCel;
  }

  /**
   * @param telefonoCel the telefonoCel to set
   */
  public void setTelefonoCel(String telefonoCel) {
    this.telefonoCel = telefonoCel;
  }

  /**
   * @return the telefonoFijo
   */
  public String getTelefonoFijo() {
    return telefonoFijo;
  }

  /**
   * @param telefonoFijo the telefonoFijo to set
   */
  public void setTelefonoFijo(String telefonoFijo) {
    this.telefonoFijo = telefonoFijo;
  }

  /**
   * @return the edad
   */
  public int getEdad() {
    return edad;
  }

  /**
   * @param edad the edad to set
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

  /**
   * @return the fechaNacimiento
   */
  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  /**
   * @param fechaNacimiento the fechaNacimiento to set
   */
  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  
  
  
  
}
