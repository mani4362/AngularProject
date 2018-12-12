package com.clonetab.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clonetab.rest.model.PasswordWalletModel;
import com.clonetab.rest.util.JDBCConnection;
import com.clonetab.rest.vo.PasswordWalletVo;

@Component
public class PwdWalletDAO extends BaseDAO
{
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public int savePasswordWallet(PasswordWalletVo passwordWalletVo)
	 {
		 Connection connection   = null;
		 PreparedStatement pstmt = null;
		 int result              = 0;
		 int pwdId               = 0; 
		 String sql     = "insert into CT_PASSWORD_WALLET (WALLET_ID,PASSWORD_TYPE,TARGET_NAME,USER_NAME,PASSWORD,CONFORM_PASSWORD,HIDE_PASSWORD,IS_PRIVATE) VALUES(?,?,?,?,?,?,?,?)";
		 
		 try 
		 {
			connection = getConnection();
			pstmt      = connection.prepareStatement(sql);
			
			//int pwdId = count.incrementAndGet();
			
			pwdId  = JDBCConnection.getInstance().getNextPwdWalletId("select max(WALLET_ID) from CT_PASSWORD_WALLET");
			
			pstmt.setInt(1, pwdId);
			pstmt.setString(2, passwordWalletVo.getPasswordType());
			pstmt.setString(3, passwordWalletVo.getTargetName());
			pstmt.setString(4, passwordWalletVo.getUserName());
			pstmt.setString(5, passwordWalletVo.getPassword());
			pstmt.setString(6, passwordWalletVo.getConfirmPassword());
			pstmt.setBoolean(7, passwordWalletVo.isHidePassword());
			pstmt.setBoolean(8, passwordWalletVo.isPrivate());

			result = pstmt.executeUpdate();
			
		 } catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		return result;	 
	 }
	 
	 /**
	  * The following method saves 
	  * @param passwordWalletModel
	  */
	 public void savePwdWallet(PasswordWalletModel passwordWalletModel) {
		 Session session  = sessionFactory.openSession();
		 Transaction tx   = session.beginTransaction();
		 session.save(passwordWalletModel);
		 tx.commit();
		 session.close();
	 }
	 
	 public void testWallet() {
		 System.out.println("DAO metho");
	 }
	
	 public List<PasswordWalletModel> loadAllPasswordWallets() {
		 Session session  = sessionFactory.openSession();
		 Transaction tx   = session.beginTransaction();
		 @SuppressWarnings("unchecked")
		List<PasswordWalletModel> pwdList  = (List<PasswordWalletModel>)session.createCriteria(PasswordWalletModel.class).list();
		 System.out.println("List Size:"+pwdList.size());
		 tx.commit();
		 session.close();
		 return pwdList;
	 }

}
