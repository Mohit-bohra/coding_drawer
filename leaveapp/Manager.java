package leaveapp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import leaveapp.Employee;

public class Manager implements Serializable{
 Employee emp = new Employee();
    void newEmp(int empid) {
        try {
            FileInputStream fileIn = new FileInputStream("myData.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Employee> allEmployees = (ArrayList<Employee>) in.readObject();

            for(int i = 0; i < allEmployees.size(); i++){
                emp = allEmployees.get(i);
                emp.viewLeaveSummary();
                out.println("  "+ emp.getEmpID() +" ");
                if(emp.getEmpID() == empid)
                  return 1;
                    break;
            }
            in.close();
            fileIn.close();
        }
        catch (ClassNotFoundException e) {
            out.println("Employee Not Found");
            return 0;   
        }
        catch (Exception e) {
            out.println("Data Stream Error");
            return 0; 

} 
       void delEmp() {
        try {
            FileInputStream fileIn = new FileInputStream("myData.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Employee> allEmployees = (ArrayList<Employee>) in.readObject();
            Employee newEmp;
            for(int i = 0; i < allEmployees.size(); i++){
                newEmp = allEmployees.get(i);
                if(newEmp.getEmpNo() == emp.getEmpNo()) {
                    allEmployees.remove(i);
                    allEmployees.add(i, emp);

                    FileOutputStream fileOut = new FileOutputStream("myData.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(allEmployees);
                    out.close();
                    fileOut.close();
                    break;
                }
            }
            in.close();
            fileIn.close();
        }
        catch (ClassNotFoundException e) {
            out.println("Employee Not Found");
            
        }
        catch (Exception e) {
            out.println("Data Stream Error");
            
        }
    }


}                 