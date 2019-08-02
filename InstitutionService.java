package com.app.Institition.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Institution.dao.InstitutionDao;
import com.app.Institution.entity.InstitutionEntity;

@Service
public class InstitutionService {

	@Autowired
	private InstitutionDao institutionDao;

	public void addemployee(InstitutionEntity e) {
		institutionDao.save(e);

	}

}
