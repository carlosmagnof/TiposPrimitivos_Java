/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author magui
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanetaPreta c1 = new CanetaPreta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
    }
    
}
