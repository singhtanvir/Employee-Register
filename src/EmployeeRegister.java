
public class EmployeeRegister {
	String firstName, lastName, mobile, email, address, choice;
	public String GetFirstName() {
		return firstName;
	}
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String GetLastName() {
		return lastName;
	}
	public void SetLastName(String lastName) {
		this.lastName = lastName;
	}
	public String GetMobile() {
		return mobile;
	}
	public void SetMobile(String mobile) {
		this.mobile = mobile;
	}
	public String GetEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	public String GetAddress() {
		return address;
	}
	public void SetAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		MainMenu obj = new MainMenu();
		obj.menu();
	}
}
