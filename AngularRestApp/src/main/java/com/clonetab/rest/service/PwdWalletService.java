package com.clonetab.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clonetab.rest.dao.PwdWalletDAO;
import com.clonetab.rest.model.PasswordWalletModel;
import com.clonetab.rest.vo.PasswordWalletVo;

@Service
public class PwdWalletService {
	
	@Autowired
	PwdWalletDAO pwdWalletDAO;
	
	public void savePwdWallet(PasswordWalletModel passwordWalletModel) {
		pwdWalletDAO.savePwdWallet(passwordWalletModel);
	}
	
	public List<PasswordWalletVo> loadAllPasswordWallets() {
		
		List<PasswordWalletVo> passwordWalletVoList        = new ArrayList<PasswordWalletVo>();
		List<PasswordWalletModel> passwordWalletModelsList = pwdWalletDAO.loadAllPasswordWallets();
		
		for(PasswordWalletModel passwordWalletModel : passwordWalletModelsList) {
			PasswordWalletVo passwordWalletVo     = new PasswordWalletVo();
			BeanUtils.copyProperties(passwordWalletModel, passwordWalletVo);
			passwordWalletVoList.add(passwordWalletVo);
		}
		return passwordWalletVoList;
	}

}
