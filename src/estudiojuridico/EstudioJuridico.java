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
public class EstudioJuridico {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Cliente cliente1 = new Cliente();
    cliente1.setApellido("gomez");
    cliente1.setNombre("Ana");
    cliente1.setDni("22345432");
    
    cliente1.mostrarDatos();
    cliente1.setSaldoAdeudado(1000);
    cliente1.actualizarDeuda(300);
    cliente1.deuda();
    
  }
  
}
