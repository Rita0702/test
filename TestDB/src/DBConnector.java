import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";

	private static String url =
	"jdbc:mysql://localhost/testdb7?autoReconnect=true&useSSL=false";
	//？以降はオプションなので必須ではない

	private static String user = "root";
	private static String password = "mysql";

		public Connection getConnection(){
			//接続状態にする
			Connection con = null;
			//初期化する

			try{
				Class.forName(driverName);
				con = DriverManager.getConnection(url,user,password);
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			//try～catchは例外処理の構文
			//try内はエラーの起こりそうな処理内容、catchはエラー時の処理内容

			return con;
		}
}
