package com.bnym.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.entity.Applicant;
import com.bnym.repository.ApplicantRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	private ApplicantRepository repository;
	
	/*
	 * public ApplicationServiceImpl() { // TODO Auto-generated constructor stub }
	 * 
	 * @Autowired public ApplicationServiceImpl(ApplicantRepository repository) {
	 * super(); this.repository = repository;
	 * 
	 * }
	 */

	@Override
	public List<Applicant> getAllApplications() {
		// TODO Auto-generated method stub
		List<Applicant> list = new ArrayList<Applicant>();
		for(Applicant applicant :repository.findAll()) {
			list.add(applicant);
		}
		
		return list;
	}

	@Override
	public Applicant getApplicationById(Long id) {
		Applicant applicant = repository.findById(id).get();
		return applicant;
	}

	@Override
	public boolean saveApplication(Applicant applicant) {
		// TODO Auto-generated method stub
		try {
			repository.save(applicant);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteApplicationById(Long id) {
		try {
			repository.deleteById(id);;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
