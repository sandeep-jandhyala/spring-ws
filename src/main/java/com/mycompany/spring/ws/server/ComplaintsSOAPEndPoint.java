/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.ws.server;

//import com.mycompany.xsd.ComplaintRequest;
import com.mycompany.xsd.ComplaintRequest;
import com.mycompany.xsd.ComplaintResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author jan_s
 */
@Endpoint
public class ComplaintsSOAPEndPoint {

    @PayloadRoot(localPart = "ComplaintRequest", namespace = "http://localhost:8084/complaints/ComplaintService/schemas")
    @ResponsePayload
    public ComplaintResponse registerComplaint(@RequestPayload ComplaintRequest request) {
        ComplaintResponse resp = new ComplaintResponse();
        resp.setStatus("Success");
        return resp;

    }

}
