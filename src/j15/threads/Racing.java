/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j15.threads;

/**
 *
 * @author Renata
 */
public class Racing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilot hamilton = new Pilot();
        Thread hamiltonThread = new Thread(hamilton);
        hamiltonThread.setName("Hamilton");
        
        Pilot vettel = new Pilot();
        Thread vettelThread = new Thread(vettel);
        vettelThread.setName("Vettel");
        
        Pilot barrichelo = new Pilot();
        Thread barricheloThread = new Thread(barrichelo);
        barricheloThread.setName("Barrichelo");
        
        Pilot massa = new Pilot();
        Thread massaThread = new Thread(massa);
        massaThread.setName("Massa");
        
        hamiltonThread.start();
        vettelThread.start();
        barricheloThread.start();
        massaThread.start();
    }
    
}
