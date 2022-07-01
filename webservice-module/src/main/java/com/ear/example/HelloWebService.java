package com.ear.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWebService {
    
    @WebMethod
    public String ping();
    
}
