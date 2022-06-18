package dbcontext;



import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	private static Connection dbConnection = null;

	public static Connection getConnection() {
		if (dbConnection != null) {
			return dbConnection;
		} else {
			try {
				
				
					

					DatabaseInfor dataBaseInfor = new DatabaseInfor();
					String driver = dataBaseInfor.getDriver();
					String connectionUrl = dataBaseInfor.getConectionUrl();
					String userName = dataBaseInfor.getUserName();
					String password = dataBaseInfor.getPassword();

					Class.forName(driver);
					dbConnection = DriverManager.getConnection(connectionUrl,
							userName, password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dbConnection;
		}
	}
}
