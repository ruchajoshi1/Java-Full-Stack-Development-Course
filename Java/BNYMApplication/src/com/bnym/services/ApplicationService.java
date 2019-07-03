package com.bnym.services;

import java.util.List;

import com.bnym.entity.Applicant;

public interface ApplicationService {
	public List<Applicant> getAllApplications();
	public Applicant getApplicationById(Long id);
	public boolean saveApplication(Applicant applicant);
	public boolean deleteApplicationById(Long id);
}
