package leaveapp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Manager {

	public static void main(String[] args) {

		Employee e1 = new Employee("Raj", 2, "Sick Leave");    //This data can be made dynamic to accept user data
		Employee e2 = new Employee("Mohan", 2, "For Attending Wedding"); //Employee refers to Object class

		try {
			FileOutputStream f = new FileOutputStream(new File("myData.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(e1);
			o.writeObject(e2);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myData.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			Employee emp1 = (Employee) oi.readObject();
			Employee emp2 = (Employee) oi.readObject();

			System.out.println(emp1.toString());
			System.out.println(emp2.toString());

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}