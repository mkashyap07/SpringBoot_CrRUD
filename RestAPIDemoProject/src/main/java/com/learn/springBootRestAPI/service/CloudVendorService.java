package com.learn.springBootRestAPI.service;

import java.util.List;

import com.learn.springBootRestAPI.entities.CloudVendor;

public interface CloudVendorService 
{
	public CloudVendor getVendorDetails(int vendorId);
	public String createVendor(CloudVendor cloudvendor);
	public String updateVendor(CloudVendor cloudvendor);
	public String deleteVendor(int vendorId);
	public List<CloudVendor> getAllCloudVendors();
}
