package dbcontext;



public class DatabaseInfor {
	private String driver;
	private String conectionUrl;
	private String userName;
	private String password;
	
	public DatabaseInfor() {
		this.driver = "com.mysql.cj.jdbc.Driver";		
		this.conectionUrl = "jdbc:mysql://localhost:3306/db_book?autoReconnect=true";
		this.userName = "root";
		this.password = "root";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getConectionUrl() {
		return conectionUrl;
	}

	public void setConectionUrl(String conectionUrl) {
		this.conectionUrl = conectionUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

