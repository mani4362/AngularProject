package com.clonetab.rest.util;

import java.sql.SQLException;

import com.clonetab.rest.dao.PwdWalletDAO;
import com.clonetab.rest.vo.PasswordWalletVo;


public class Test
{

	public static void main(String[] args) throws SQLException 
	{
		//JDBCConnection.getInstance().getConnection();
		
		PwdWalletDAO  dao = new PwdWalletDAO();
		PasswordWalletVo  vo = new PasswordWalletVo();
		vo.setPasswordType("Sai");
		vo.setTargetName("E1226122");
		vo.setUserName("ctadmin");
		vo.setPassword("clontab");
		vo.setConfirmPassword("clontab");
		vo.setHidePassword(true);
		vo.setPrivate(false);
		dao.savePasswordWallet(vo);
		
	}

}
