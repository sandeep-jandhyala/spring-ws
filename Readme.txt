This project has a webservice endpoint in both SOAP and REST 

SOAP

http://localhost:8084/complaints-ws/soap/ComplaintsWebService.wsdl  

http://localhost:8084/complaints-ws/soap/ComplaintRequest.xsd

Sample Request

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://localhost:8084/complaints/ComplaintService/schemas">
   <soapenv:Header/>
   <soapenv:Body>
      <sch:ComplaintRequest>
         <sch:company>hello</sch:company>
         <sch:description>badguy</sch:description>
      </sch:ComplaintRequest>
   </soapenv:Body>
</soapenv:Envelope>

REST

http://localhost:8084/complaints-ws/rest/complaints/123
