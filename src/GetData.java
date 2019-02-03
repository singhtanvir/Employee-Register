import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;

public class GetData extends EmployeeRegister{
	Collection employee = new ArrayList();
	String choice;
	int emp, i;
	Scanner keyboardInput = new Scanner(System.in);
	public void getData() {

		System.out.println("Enter the number of employees you would like to register: ");
		emp = keyboardInput.nextInt();
		for(i=1;i<=emp;i++) {
			System.out.format("Enter employee %d details: ",i);
			System.out.println("Enter First Name: ");
			SetFirstName(keyboardInput.next());
			employee.add(GetFirstName());
			
			System.out.println("Enter Last Name: ");
			SetLastName(keyboardInput.next());
			employee.add(GetLastName());
			
			System.out.println("Enter Mobile: ");
			SetMobile(keyboardInput.next());
			employee.add(GetMobile());
			
			System.out.println("Enter e-mail: ");
			SetEmail(keyboardInput.next());
			employee.add(GetEmail());
			
			System.out.println("Enter Address: ");
			SetAddress(keyboardInput.next());
			employee.add(GetAddress());
			
		}
	}
	public void showData() {
		Iterator it = employee.iterator();
		while(it.hasNext()) {
		
		System.out.println(it.next()+"\t\t"+it.next()+"\t\t"+it.next()+"\t  "+it.next()+"\t\t\t"+it.next());
		}
	}
	
}
