package leaveapp;
import java.io.Serializable;

public class Employee implements Serializable {

	private int empID;
	private String name;
	private int leaves;
	private String reason;

	Employee() 
        {
	};

	Employee(int empID,String name, int leaves, String reason) {
		this.empID= empID;
		this.name = name;
		this.leaves = leaves;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "\nID:" + empID + "\nName:" + name + "\nLeaves Applied " + age + "\nReason: " + reason;
	}
}
