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
public class Cliente extends Persona {

  
  
  private int presupuesto;
  private int saldoPago;
  private int saldoAdeudado;
  private int pago;
  
  
  //contructor
  
  
  //metodos
  

 public void deuda(){
   System.out.println("La deuda actual es: "+ getSaldoAdeudado());
 }
 public int actualizarDeuda(int pago){
    saldoAdeudado= getSaldoAdeudado()-pago;
    return saldoAdeudado;
    
  } 
  
  /**
   * @return the pago
   */
  public int getPago() {
    return pago;
  }

  /**
   * @param pago the pago to set
   */
  public void setPago(int pago) {
    this.pago = pago;
  }
  /**
   * @return the presupuesto
   */
  public int getPresupuesto() {
    return presupuesto;
  }

  /**
   * @param presupuesto the presupuesto to set
   */
  public void setPresupuesto(int presupuesto) {
    this.presupuesto = presupuesto;
  }

  /**
   * @return the saldoPago
   */
  public int getSaldoPago() {
    return saldoPago;
  }

  /**
   * @param saldoPago the saldoPago to set
   */
  public void setSaldoPago(int saldoPago) {
    this.saldoPago = saldoPago;
  }

  /**
   * @return the saldoAdeudado
   */
  public int getSaldoAdeudado() {
    return saldoAdeudado;
  }

  /**
   * @param saldoAdeudado the saldoAdeudado to set
   */
  public void setSaldoAdeudado(int saldoAdeudado) {
    this.saldoAdeudado = saldoAdeudado;
  }
  
  
  
}
