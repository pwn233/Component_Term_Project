/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Thcvsoap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@WebService(serviceName = "DisplayWebService")
public class DisplayWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DDCSOAPDisplayPU");

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
    @WebMethod(operationName = "findData")
    public Thcvsoap findData(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        EntityManager em = emf.createEntityManager();
        Thcvsoap thcv = em.find(Thcvsoap.class, id);
        return thcv;
    }
    
}
