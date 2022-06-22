package com.api.restfulApiTest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.restfulApiTest.Models.Lable;
import com.api.restfulApiTest.Services.LableService;

@Controller
@RequestMapping("/api/lables")
public class LableController{
	
	@Autowired
	private LableService lableService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Lable>> all(
			@RequestParam(value="report_id")Integer report_id,
			@RequestParam(value="language_id")String language_id
		) {
		Lable lableExample = new Lable();
		lableExample.setReport_id(report_id);
		lableExample.setLanguage_id(language_id);
		List<Lable> lables = lableService.findAll(lableExample);
		return ResponseEntity.status(HttpStatus.OK).body(lables);
	}

}
