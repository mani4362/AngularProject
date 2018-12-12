package com.clonetab.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clonetab.rest.model.PasswordWalletModel;
import com.clonetab.rest.service.PwdWalletService;
import com.clonetab.rest.vo.PasswordWalletVo;

@RestController
public class PwdWalletController 
{
	
	@Autowired
	PwdWalletService pwdWalletService;
	/*@RequestMapping(value = "/savePasswordWallet", method = RequestMethod.GET)
	public ResponseEntity<PasswordWalletVo> savePasswordWallet(@RequestParam(value="targetName",required=false)String targetName,
															   @RequestParam(value="passwordType",required=false)String passwordType,
															   @RequestParam(value="userName",required=false)String userName,
															   @RequestParam(value="password",required=false)String password,
															   @RequestParam(value="confirmPassord",required=false)String confirmPassord,
															   @RequestParam(value="hidePassword",required=false)boolean hidePassword,
															   @RequestParam(value="private",required=false)boolean isPrivate) 
	{
		System.out.println("Target Name   :"+targetName);
		System.out.println("Password Type :"+passwordType);
		System.out.println("User Name :"+userName);
		System.out.println("Password :"+password);
		System.out.println("Confirm Password :"+confirmPassord);
		System.out.println("Hide Password :"+hidePassword);
		System.out.println("Is Private :"+isPrivate);
		
		PasswordWalletVo passwordWalletVo = new PasswordWalletVo();
		passwordWalletVo.setPasswordType(passwordType);
		passwordWalletVo.setTargetName(targetName);
		passwordWalletVo.setUserName(userName);
		passwordWalletVo.setPassword(password);
		passwordWalletVo.setConfirmPassord(confirmPassord);
		passwordWalletVo.setHidePassword(hidePassword);
		passwordWalletVo.setPrivate(isPrivate);
		
		
		
		PwdWalletDAO pwdWalletDAO  = new PwdWalletDAO();
		int result = pwdWalletDAO.savePasswordWallet(passwordWalletVo);
		System.out.println("$$$ No.Of Rows Inserted is "+result);
		
		return new ResponseEntity<PasswordWalletVo>(passwordWalletVo, HttpStatus.OK);
	}*/
	/*@CrossOrigin(origins="*",allowedHeaders="*")
	@RequestMapping(value = "/savePwdWallet", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PasswordWalletVo> savePwddWallet(@RequestBody(required = true) PasswordWalletVo passwordWalletVo)
	{
		int result  = 0;
		System.out.println("Object of Password wallet Vo is "+passwordWalletVo);
		System.out.println("This is updated password wallet::::::");
		if(passwordWalletVo != null)
		{
			//System.out.println("passwordId"+passwordWalletVo.getPasswordId());
			System.out.println("passwordType :"+passwordWalletVo.getPasswordType());
			System.out.println("targetName :"+passwordWalletVo.getTargetName());
			System.out.println("userName :"+passwordWalletVo.getUserName());
			System.out.println("password :"+passwordWalletVo.getPassword());
			System.out.println("confirmPassord :"+passwordWalletVo.getConfirmPassword());
			System.out.println("hidePassword :"+passwordWalletVo.isHidePassword());
			System.out.println("isPrivate :"+passwordWalletVo.isPrivate());
			
			PasswordWalletModel passwordWalletModel = new PasswordWalletModel();
			
			BeanUtils.copyProperties(passwordWalletVo, passwordWalletModel);
			pwdWalletService.savePwdWallet(passwordWalletModel);
			result++;
		}
		System.out.println("$$$ No.Of Rows Inserted is "+result);
		
		
		
		return new ResponseEntity<PasswordWalletVo>(passwordWalletVo,HttpStatus.OK);
	}*/
	
	@CrossOrigin(origins="*",allowedHeaders="*")
	@RequestMapping(value = "/savePwdWallet", method = RequestMethod.POST)
	public List<PasswordWalletVo> savePwddWallet(@RequestBody(required = true) PasswordWalletVo passwordWalletVo)
	{
		int result  = 0;
		System.out.println("Object of Password wallet Vo is "+passwordWalletVo);
		System.out.println("This is updated password wallet::::::");
		if(passwordWalletVo != null)
		{
			//System.out.println("passwordId"+passwordWalletVo.getPasswordId());
			System.out.println("passwordType :"+passwordWalletVo.getPasswordType());
			System.out.println("targetName :"+passwordWalletVo.getTargetName());
			System.out.println("userName :"+passwordWalletVo.getUserName());
			System.out.println("password :"+passwordWalletVo.getPassword());
			System.out.println("confirmPassord :"+passwordWalletVo.getConfirmPassword());
			System.out.println("hidePassword :"+passwordWalletVo.isHidePassword());
			System.out.println("isPrivate :"+passwordWalletVo.isPrivate());
			
			PasswordWalletModel passwordWalletModel = new PasswordWalletModel();
			
			BeanUtils.copyProperties(passwordWalletVo, passwordWalletModel);
			pwdWalletService.savePwdWallet(passwordWalletModel);
			result++;
		}
		System.out.println("Number of rows inserted:"+result);
		return pwdWalletService.loadAllPasswordWallets();
	}
	@RequestMapping(value = "/test", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PasswordWalletVo> testWallet() {
		
		PasswordWalletModel passwordWalletModel = new PasswordWalletModel();
		passwordWalletModel.setPasswordType("DB");
		passwordWalletModel.setTargetName("OBITST");
		passwordWalletModel.setUserName("ctadmin");
		passwordWalletModel.setPassword("ctadmin");
		//passwordWalletModel.setHidePassword("Y");
		passwordWalletModel.setIsPrivate("Y");
		passwordWalletModel.setCreatedBy("CTADMIN");
		passwordWalletModel.setCreatedOn(new Date());
		
		//pwdWalletService.savePwdWallet(passwordWalletModel);
		System.out.println("Successsssssssssssssssssssssssssss");
		PasswordWalletVo passwordWalletVo = new PasswordWalletVo();
		
		return new ResponseEntity<PasswordWalletVo>(passwordWalletVo, HttpStatus.OK);
	}
	@CrossOrigin(origins="*",allowedHeaders="*")
	@RequestMapping(value = "/loadAllPwdWallets", method = RequestMethod.GET)
	public List<PasswordWalletVo> loadAllPasswordWallets() {
		System.out.println("Inside Load option...");
		System.out.println("Git push test");
		pwdWalletService.loadAllPasswordWallets();
		return pwdWalletService.loadAllPasswordWallets();
	}
}
