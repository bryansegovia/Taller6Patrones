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
public class Asistente implements Handler{
    
    private Handler siguiente= null;
    
    public Asistente(Handler sig){
        siguiente= sig;
    }

    @Override
    public void aprobacionCambio() {
       
    }
    
    public void garantia(){
        
    }
    
}
