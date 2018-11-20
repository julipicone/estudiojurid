/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiojuridico;

/**
 *
 * @author Julieta
 */
public class Abogado extends Persona{
 
   
  private boolean matriculaProv;
  private boolean matriculaFed;
  private boolean matriculaCaba;
  
  
  
  /**
   * @return the matriculaProv
   */
  public boolean isMatriculaProv() {
    return matriculaProv;
  }

  /**
   * @param matriculaProv the matriculaProv to set
   */
  public void setMatriculaProv(boolean matriculaProv) {
    this.matriculaProv = matriculaProv;
  }

  /**
   * @return the matriculaFed
   */
  public boolean isMatriculaFed() {
    return matriculaFed;
  }

  /**
   * @param matriculaFed the matriculaFed to set
   */
  public void setMatriculaFed(boolean matriculaFed) {
    this.matriculaFed = matriculaFed;
  }

  /**
   * @return the matriculaCaba
   */
  public boolean isMatriculaCaba() {
    return matriculaCaba;
  }

  /**
   * @param matriculaCaba the matriculaCaba to set
   */
  public void setMatriculaCaba(boolean matriculaCaba) {
    this.matriculaCaba = matriculaCaba;
  }
 
  
  
}
