package com.learn.springBootRestAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springBootRestAPI.entities.CloudVendor;
import com.learn.springBootRestAPI.service.CloudVendorService;

//@RestController
@Controller
//@RequestMapping()
public class RestAPIController 
{
	CloudVendor cloudvendor;
	
	CloudVendorService cloudser;
	
	public RestAPIController(CloudVendorService cloudser) {
		super();
		this.cloudser = cloudser;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getVendorDetails(@PathVariable("vendorId") int vendorId)
	{
		return cloudser.getVendorDetails(vendorId);
	}
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendors()
	{
		return cloudser.getAllCloudVendors();
	}
//	@PostMapping
//	public String createVendor(@RequestBody CloudVendor cloudvendor)
//	{
//		cloudser.createVendor(cloudvendor);
//		return "cloud vendor created successfully"; 
//	}
	
	@PostMapping("register")
	public String createVendor(@ModelAttribute CloudVendor cloudvendor)
	{
		cloudser.createVendor(cloudvendor);
		return "registersuccess"; 
	}
	
	@PutMapping
	public String updateVendor(@RequestBody CloudVendor cloudvendor)
	{
		cloudser.updateVendor(cloudvendor);
		return "cloud vendor updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteVendor(@PathVariable("vendorId") int vendorId)
	{
		cloudser.deleteVendor(vendorId);
		return "cloud vendor deleted successfully";
	}
}
