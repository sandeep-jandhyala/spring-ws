/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data;

/**
 *
 * @author jan_s
 */
public class Complaint {
    
    Long ComplaintId;
    
    String complaintDesc;
    
    String companyName;
    
    
    

    public Long getComplaintId() {
        return ComplaintId;
    }

    public String getComplaintDesc() {
        return complaintDesc;
    }

    public void setComplaintDesc(String complaintDesc) {
        this.complaintDesc = complaintDesc;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
    
}
