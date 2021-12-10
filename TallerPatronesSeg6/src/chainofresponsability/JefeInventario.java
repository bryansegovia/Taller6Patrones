/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Segovia
 */
public class JefeInventario implements Handler{
    
    private Handler siguiente= null;
    
    public JefeInventario(Handler sig){
        siguiente= sig;
    }

    @Override
    public void aprobacionCambio() {
        
    }
    
    public void existenciaProducto(){
        
    }
    
}
