package com.learn.springBootRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.springBootRestAPI.entities.CloudVendor;
import com.learn.springBootRestAPI.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImplementation implements CloudVendorService
{
	//Bussiness logics
	CloudVendorRepository cloudRepo;

	public CloudVendorServiceImplementation(CloudVendorRepository cloudRepo) {
		super();
		this.cloudRepo = cloudRepo;
	}

	@Override
	public CloudVendor getVendorDetails(int vendorId) {
		return cloudRepo.findById(vendorId).get();
		
	}

	@Override
	public String createVendor(CloudVendor cloudvendor) {
		cloudRepo.save(cloudvendor);
		return "created";
	}

	@Override
	public String updateVendor(CloudVendor cloudvendor) {
		cloudRepo.save(cloudvendor);
		return "updated";
	}

	@Override
	public String deleteVendor(int vendorId) {
		cloudRepo.deleteById(vendorId);
		return "deleted";
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudRepo.findAll();
		
	}

}
