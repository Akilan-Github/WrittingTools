package com.example.writtingtools.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.writtingtools.entity.Pen;
import com.example.writtingtools.exception.InkLevelPercentageException;
import com.example.writtingtools.service.PenService;

@RestController
public class PenController {
	static Logger log = Logger.getLogger(PenController.class);
	@Autowired
	PenService ps;
	@PostMapping(value="postpen")
	public String postPen(@RequestBody List<Pen> a) {
		PropertyConfigurator.configure("pen.properties");
		log.info(ps.postPen(a));
		return ps.postPen(a);
	}
	@GetMapping(value="getpen")
	public List<Pen> getPen(){
		PropertyConfigurator.configure("pen.properties");
		log.info(ps.getPen());
		return ps.getPen();
	}
	@GetMapping(value="/deletepen/{a}")
	public String deletePen(@PathVariable int a) {
		PropertyConfigurator.configure("pen.properties");
		log.info(ps.deletePen(a));
		return ps.deletePen(a);
		
	}
	@PostMapping(value="postonepen")
	public String postOnePen(@RequestBody Pen a) throws InkLevelPercentageException {
		PropertyConfigurator.configure("pen.properties");
		log.info(ps.postOnePen(a));
		
		return ps.postOnePen(a);
	}
	

}
