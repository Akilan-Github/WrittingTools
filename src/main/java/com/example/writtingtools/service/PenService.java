package com.example.writtingtools.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.writtingtools.dao.PenDao;
import com.example.writtingtools.entity.Pen;
import com.example.writtingtools.exception.InkLevelPercentageException;

@Service
public class PenService {
	@Autowired
	PenDao pd;

	public String postPen(List<Pen> a) {
		// TODO Auto-generated method stub
		return pd.postPen(a);
	}

	public List<Pen> getPen() {
		// TODO Auto-generated method stub
		return pd.getPen();
	}

	public String deletePen(int a) {
		// TODO Auto-generated method stub
		return pd.deletePen(a);
	}

	public String postOnePen(Pen a) throws InkLevelPercentageException {
		if(a.getInklevel()<30) {
			throw new InkLevelPercentageException("Ink level is low");
		}
		// TODO Auto-generated method stub
		return pd.postOnePen(a);
	}

}
