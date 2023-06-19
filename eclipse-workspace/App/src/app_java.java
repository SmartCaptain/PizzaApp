import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class app_java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/db_1","root","Priti@123");
			Statement stmnt = con.createStatement();
		ResultSet result= stmnt.executeQuery("select* from registration");
		System.out.println(result.next());
		while(result.next()) {
			System.out.print(result.getString(1));
			System.out.print(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
		}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
