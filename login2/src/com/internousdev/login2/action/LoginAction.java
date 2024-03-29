package com.internousdev.login2.action;
import java.sql.SQLException;

import com.internousdev.login2.dao.LoginDAO;
import com.internousdev.login2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String nameJ;
	private String passwordJ;

	public String execute() throws SQLException{
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto=dao.select(nameJ,passwordJ);

		if(nameJ.equals(dto.getName2())){
			if(passwordJ.equals(dto.getPassword2())){
				ret = SUCCESS;
			}
		}
		return ret;
	}
	public String getNameJ(){
		return nameJ;
	}
	public void setNameJ(String name){
		this.nameJ = name;
	}
	public String getPasswordJ(){
		return passwordJ;
	}
	public void setPasswordJ(String password){
		this.passwordJ = password;
	}
}
