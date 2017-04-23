/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.ws.server;

import com.mycompany.data.Complaint;
import com.mycompany.xsd.ComplaintRequest;
import com.mycompany.xsd.ComplaintResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author jan_s
 */
@RestController

public class ComplaintsRestEndPoint {
    
    
    @RequestMapping(value="/complaints/{complaintId}",method = RequestMethod.GET, headers="Accept=application/json",produces="application/json")
    public Complaint getComplaintById(@PathVariable Long complaintId){
        System.out.println("Retrieving complaints by Id");
        Complaint c = new Complaint();
        c.setCompanyName("Google");
        c.setComplaintDesc("Not showing in search");
        // return new ResponseEntity<>(c,HttpStatus.FOUND);
        return c;
    }
}
