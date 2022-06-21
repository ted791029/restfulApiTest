package com.api.restfulApiTest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.restfulApiTest.Models.CptTitle;
import com.api.restfulApiTest.Services.CptTitleService;

@Controller
@RequestMapping("/api/cptTitles")
public class CptTitleController{
	
	@Autowired
	private CptTitleService cptTitleService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CptTitle>> all(
			@RequestParam(value="bu_id")String bu_id,
			@RequestParam(value="report_id")Integer report_id,
			@RequestParam(value="language_id")String language_id
		) {
		CptTitle cptTitleExample = new CptTitle();
		cptTitleExample.setBu_id(bu_id);
		cptTitleExample.setReport_id(report_id);
		cptTitleExample.setLanguage_id(language_id);
		List<CptTitle> orders = cptTitleService.findAll(cptTitleExample);
		return ResponseEntity.status(HttpStatus.OK).body(orders);
	}

}
