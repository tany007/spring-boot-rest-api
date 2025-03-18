package com.example.demo.service;


import com.example.demo.exception.CloudVendorNotFoundException;
import com.example.demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId) throws CloudVendorNotFoundException;
    public List<CloudVendor> getAllVendors();

}
