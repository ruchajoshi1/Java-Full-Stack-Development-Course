package com.bnym.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnym.entity.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Long>{
	//exact match
	List<Applicant> findByaNameAndAAddressCity(String name, String city);
	//case in-sensitive
	List<Applicant> findByaNameIgnoreCaseAndAAddressCityIgnoreCase(String name, String city);
	//List<Applicant> findByaDOB();
}
