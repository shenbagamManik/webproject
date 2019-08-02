package com.app.Institution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.Institution.entity.InstitutionEntity;

@Repository
public interface InstitutionDao extends JpaRepository<InstitutionEntity, Integer> {

}
