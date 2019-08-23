package j10.numbers.handlers;

import java.util.*;
import static java.lang.System.out;

public class FullMoons
{
    static int QTD_MILLS_OF_ONE_DAY = 1000 * 60 * 60 * 24;
    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance();
    	c.setTimeInMillis(0);
    	out.println(String.format("Mark zero %tc", c));
    	out.println(String.format("milisecounds of mark zero %d%n", c.getTimeInMillis()));
    	c.add(Calendar.DAY_OF_MONTH, 1);
    	out.println(String.format("Second day %tc", c));
    	out.print(String.format("milisecounds of second day %d%n", c.getTimeInMillis()));
    	out.print("QTD_MILLS_IN_ONE_DAY = " + QTD_MILLS_OF_ONE_DAY);
    	out.println("\n");
    	c.set(2004, 0, 7, 15, 40);
    	out.println(String.format("Reference full moon %tc", c));
    	out.println(String.format("milisecounds of reference full moon %d%n", c.getTimeInMillis()));
        long fullMoon = c.getTimeInMillis();
        for (int x = 0; x < 3; x++) {
        	fullMoon += (QTD_MILLS_OF_ONE_DAY * 29.52);
            c.setTimeInMillis(fullMoon);
            out.println(String.format("full moon on %tc", c));
        }
        
    }
}
