/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class ThcvsoapHandler {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DDC_Soap_ServicesPU");
    public String insertData(Thcvsoap thcv) {
        EntityManager em = emf.createEntityManager();
        String status = "start";
        try {
            em.getTransaction().begin();    
            em.persist(thcv);
            em.getTransaction().commit();
            status = "Insert Complete !";
        } catch (Exception e) {
            status = "Insert Fail ! : "+e;
            em.getTransaction().rollback();
        } finally {
            em.close();
            return status;
        }
    }
    
    public String removeData(int x) {
        EntityManager em = emf.createEntityManager();
        String status = "start";
        Thcvsoap thcv = em.find(Thcvsoap.class, x);
        try {
            em.getTransaction().begin();    
            em.remove(thcv);
            em.getTransaction().commit();
            status = "Remove Complete !";
        } catch (Exception e) {
            status = "Remove Fail ! : "+e;
            em.getTransaction().rollback();
        } finally {
            em.close();
            return status;
        }
    }
}