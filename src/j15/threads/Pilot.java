/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j15.threads;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renata
 */
public class Pilot implements Runnable {

    @Override
    public void run() {
        int rand;
        Timestamp beforeStartRacing = new Timestamp(System.currentTimeMillis());

        try {

            for (int i = 0; i < 5; i++) {

                rand = (int) (Math.random() * 2) + 1;
                Thread.sleep(rand * 1000);

            }
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Pilot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Timestamp afterFinishRacing = new Timestamp(System.currentTimeMillis());
        long pilotsTime = afterFinishRacing.getTime() - beforeStartRacing.getTime();
        
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(pilotsTime),
            TimeUnit.MILLISECONDS.toMinutes(pilotsTime) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(pilotsTime)),
            TimeUnit.MILLISECONDS.toSeconds(pilotsTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(pilotsTime)));
        
        System.out.println(Thread.currentThread().getName() + " arrived !! time " + hms);
    }

}
