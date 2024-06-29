package com.learn.springBootRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springBootRestAPI.entities.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer>
{

}
