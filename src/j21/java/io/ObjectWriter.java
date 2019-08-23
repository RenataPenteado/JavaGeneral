package j21.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void main(String[] args) {

		Person p1 = new Person("John", 30, "Male");
		Person p2 = new Person("Rachel", 25, "Female");

				
		File file = new File("src/mgpXXX/myObjects.txt");
		FileOutputStream f;
		
		try {
			f = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException CAUGHT!!");
		}
		
		
		try {
			f = new FileOutputStream(new File("src/mgp11/myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(p1);
			o.writeObject(p2);

			o.close();
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("IOException CAPTURADO!!");	
		} catch (IOException e) {
			System.out.println("IOException CAPTURADO!!");
		}

	}

}