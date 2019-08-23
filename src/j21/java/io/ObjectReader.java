package j21.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectReader {

	public static void main(String[] args) {

		try {
			FileInputStream f = new FileInputStream(new File("src/mgp11/myObjects.txt"));
			ObjectInputStream i = new ObjectInputStream(f);

			// Read objects
			Person p1 = (Person) i.readObject();
			Person p2 = (Person) i.readObject();

			System.out.println(p1);
			System.out.println(p2.toString());

			i.close();
			f.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}