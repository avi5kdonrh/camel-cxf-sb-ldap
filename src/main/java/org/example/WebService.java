package org.example;

import javax.jws.WebMethod;

@javax.jws.WebService
public class WebService {
    @WebMethod
    public String get() {
        System.out.println(">> In");
        return "Success";
    }
}
