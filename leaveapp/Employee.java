package leaveapp;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int leaves;
	private String reason;

	Employee() 
        {
	};

	Employee(String name, int leaves, String reason) {
		this.name = name;
		this.leaves = leaves;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nLeaves Applied " + age + "\nReason: " + reason;
	}
}