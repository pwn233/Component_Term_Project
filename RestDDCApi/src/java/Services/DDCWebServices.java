/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Controller.Control;
import Model.ThcvsoapRest;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@WebService(serviceName = "DDCWebServices")
public class DDCWebServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendBeansData")
    public ThcvsoapRest sendBeansData() {
        //TODO write your implementation code here:
        Control c = new Control();
        return c.pullDataFromApi();
    }
    
    
}
