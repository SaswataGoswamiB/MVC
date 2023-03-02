package springmvc.model;

public class User {

	
	private String email;
	
	private String name;
	
	private  String passowrd;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String name, String passowrd) {
		super();
		this.email = email;
		this.name = name;
		this.passowrd = passowrd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", passowrd=" + passowrd + "]";
	}
	
	
}
