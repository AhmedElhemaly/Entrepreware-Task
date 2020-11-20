package com.hemaly.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hemaly.demo.model.Numbers;
import com.hemaly.demo.repository.NumberRepository;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping(path="/api/v1/validate",produces = {"application/json"})
@CrossOrigin(origins = "http://localhost:4200") 
public class NumberController {
	@Autowired
	private NumberRepository repo;
	@GetMapping("/{number}")
	public Numbers getResponse(@PathVariable String number)
	{
	    final String uri = "http://apilayer.net/api/validate?access_key=12f942c40ffee7979a665fdb28cd26ae&number="+number;
	    RestTemplate restTemplate = new RestTemplate();
	    JSONObject result = restTemplate.getForObject(uri, JSONObject.class);
	    Numbers num = new Numbers();
	    num.setValid((Boolean)result.get("valid"));
	    num.setNumber((String)result.get("number"));
	    num.setLocal_format((String)result.get("local_format"));
	    num.setInternational_format((String)result.get("international_format"));
	    num.setCountry_prefix((String)result.get("country_prefix"));
	    num.setCountry_code((String)result.get("country_code"));
	    num.setCountry_name((String)result.get("country_name"));
	    num.setLocation((String)result.get("location"));
	    num.setCarrier((String)result.get("carrier"));
	    num.setLine_type((String)result.get("line_type"));
	    repo.save(num);
	    System.out.println(num);
	    return num;
	}
	@GetMapping("/history")
	public List<Numbers> getAll()
	{
		return repo.findAll();
	}
}
