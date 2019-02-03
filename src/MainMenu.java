import java.util.Scanner;

public class MainMenu{
	Scanner keyboardInput = new Scanner(System.in);
	String choice;
	public void menu() {
	GetData obj = new GetData();
	obj.getData();
	do{System.out.println("Would you like to add more employees enter Y|y for yes or enter N|n to display the added employees: ");
	choice = keyboardInput.nextLine();
	switch(choice) {
	case "Y":
	case "y":
		obj.getData();
		break;
	case "N":
	case "n":
		System.out.println("First Name\tLast Name\tMoble Number\t\tEmail\t\t\t\tAddress");
		obj.showData();
		break;
		}}while(choice!="Y" |choice!="y");
	}
}
