package com.internousdev.webproj2.dao;
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj2.util.DBConnector;

public class HelloStrutsDAO {

	public boolean select(){
		boolean ret=false;
		DBConnector db = new DBConnector();
		Connection conn = db.getConnection();
		String sql = "select * from inquiry";

			try{
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					ret = true;
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			try{
				conn.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		return ret;
	}
}