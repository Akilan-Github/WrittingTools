package com.example.writtingtools.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.writtingtools.entity.Pen;
import com.example.writtingtools.repository.PenRepository;

@Repository
public class PenDao {
	@Autowired
	PenRepository pr;

	public String postPen(List<Pen> a) {
		pr.saveAll(a);
		// TODO Auto-generated method stub
		return "posted Sucessfully";
	}

	public List<Pen> getPen() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	public String deletePen(int a) {
		pr.deleteById(a);
		// TODO Auto-generated method stub
		return "deleted";
	}

	public String postOnePen(Pen a) {
		pr.save(a);
		// TODO Auto-generated method stub
		return "updated";
	}

}
