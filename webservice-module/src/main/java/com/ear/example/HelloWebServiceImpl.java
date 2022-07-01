package com.ear.example;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public String ping() {
        return "pong";
    }
    
}
