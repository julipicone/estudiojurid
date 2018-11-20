/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiojuridico;

import java.util.HashSet;
import java.util.Set;

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
    cliente1.setApellido("Gomez");
    cliente1.setNombre("Ana");
    cliente1.setDni("22345432");
    
    cliente1.mostrarDatos();
    cliente1.setSaldoAdeudado(1000);
    cliente1.actualizarDeuda(300);
    cliente1.deuda();
    //-----------
    
    Set <Cliente> clientesEstudio = new HashSet<Cliente>();
    clientesEstudio.add(cliente1);
    for (Cliente cliente : clientesEstudio) {
      System.out.println("Nombre: "+ cliente.getNombre()+ ". Apellido: "+ cliente.getApellido()+ ". Telefono: "+ 
              cliente.getTelefonoCel());
    }
    
  }
  
}
