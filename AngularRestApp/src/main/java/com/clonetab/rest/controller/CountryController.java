package com.clonetab.rest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clonetab.rest.vo.SourceInstanceVO;

//@CrossOrigin("*")
@RestController
public class CountryController
{
	
	/*@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public List<Country> getCountries(@RequestParam(value="email",required=false)String email)
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();
		CountryDAO countryDAO = new CountryDAO();
		SourceInstanceVO sourceInstanceVO = new SourceInstanceVO();
		
		System.out.println("Email from   service:::::"+email);
		
		sourceInstanceVO.setSrcId(100 + (int)(Math.random() * 900));
		sourceInstanceVO.setServiceName("E12255Y");
		sourceInstanceVO.setHostName("E12255Y");
		sourceInstanceVO.setSysUserName("System");
		
		countryDAO.saveDataFromUI(sourceInstanceVO);
		
		return listOfCountries;
	}*/
	
	@RequestMapping(value = "/saveSourceInstance", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SourceInstanceVO> saveSourceInstance(SourceInstanceVO sourceInstanceVO)
	{
		//CountryDAO countryDAO = new CountryDAO();
		
		//sourceInstanceVO.setSrcId(100 + (int)(Math.random() * 900));
		//sourceInstanceVO.setServiceName("E12255Y");
		//sourceInstanceVO.setHostName("E12255Y");
		//sourceInstanceVO.setSysUserName("System");
		
		//countryDAO.saveDataFromUI(sourceInstanceVO);
		
		return new ResponseEntity<SourceInstanceVO>(sourceInstanceVO, HttpStatus.OK);
	}

	
}
