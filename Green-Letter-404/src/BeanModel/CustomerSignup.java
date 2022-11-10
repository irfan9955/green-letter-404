package BeanModel;

public class CustomerSignup {
	
	private String name;
	private String mobNo;
	private String email;
	private String password;
	
	
	public CustomerSignup(String name, String mobNo, String email, String password) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.email = email;
		this.password = password;
	}
	
	
	public CustomerSignup() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobNo() {
		return mobNo;
	}


	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
