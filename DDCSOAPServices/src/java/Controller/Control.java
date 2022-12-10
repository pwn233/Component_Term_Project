/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Thcvsoap;
import Model.ThcvsoapHandler;
import services.ThcvsoapRest;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class Control {
    
    public String insertToDatabase() {
        Thcvsoap thcv = new Thcvsoap();
        thcv = setData(thcv, dataFromSoap());
        checkData(thcv);

        ThcvsoapHandler thcvH = new ThcvsoapHandler();
        String dummy = thcvH.insertData(thcv);

        return dummy;
    }
    
    public String removeFromDatabase() {
        ThcvsoapHandler thcvH = new ThcvsoapHandler();
        String dummy = thcvH.removeData(1);
        return dummy;
    }
    
    public static ThcvsoapRest dataFromSoap() {
        services.DDCWebServices_Service service = new services.DDCWebServices_Service();
        services.DDCWebServices port = service.getDDCWebServicesPort();
        return port.sendBeansData();
    }
    
    public static Thcvsoap setData(Thcvsoap thcv, ThcvsoapRest  thcvr){
        thcv.setYears(thcvr.getYears());
        thcv.setWeeknum(thcvr.getWeeknum());
        thcv.setId(thcvr.getId());
        thcv.setNewCase(thcvr.getNewCase());
        thcv.setTotalCase(thcvr.getTotalCase());
        thcv.setNewCaseExcludeabroad(thcvr.getNewCaseExcludeabroad());
        thcv.setTotalCaseExcludeabroad(thcvr.getTotalCaseExcludeabroad());
        thcv.setNewRecovered(thcvr.getNewRecovered());
        thcv.setTotalRecovered(thcvr.getTotalRecovered());
        thcv.setNewDeath(thcvr.getNewDeath());
        thcv.setTotalDeath(thcvr.getTotalDeath());
        thcv.setCaseForeign(thcvr.getCaseForeign());
        thcv.setCasePrison(thcvr.getCasePrison());
        thcv.setCaseWalkin(thcvr.getCaseWalkin());
        thcv.setCaseNewPrev(thcvr.getCaseNewPrev());
        thcv.setCaseNewDiff(thcvr.getCaseNewDiff());
        thcv.setDeathNewPrev(thcvr.getDeathNewPrev());
        thcv.setDeathNewDiff(thcvr.getDeathNewDiff());
        thcv.setUpdateDate(thcvr.getUpdateDate());
        return thcv;
    }
    
    public void checkData(Thcvsoap thcv) {
        System.out.println("ID : "+thcv.getId());
        System.out.println("YEARS : "+thcv.getYears());
        System.out.println("WEEKNUM : "+thcv.getWeeknum());
        System.out.println("NEW_CASE : "+thcv.getNewCase());
        System.out.println("TOTAL_CASE : "+thcv.getTotalCase());
        System.out.println("NEW_CASE_EXCLUDEABROAD : "+thcv.getNewCaseExcludeabroad());
        System.out.println("TOTAL_CASE_EXCLUDEABROAD : "+thcv.getTotalCaseExcludeabroad());
        System.out.println("NEW_RECOVERED : "+thcv.getNewRecovered());
        System.out.println("TOTAL_RECOVERED : "+thcv.getTotalRecovered());
        System.out.println("NEW_DEATH : "+thcv.getNewDeath());
        System.out.println("TOTAL_DEATH : "+thcv.getTotalDeath());
        System.out.println("CASE_FOREIGN : "+thcv.getCaseForeign());
        System.out.println("CASE_PRISON : "+thcv.getCasePrison());
        System.out.println("CASE_WALKIN : "+thcv.getCaseWalkin());
        System.out.println("CASE_NEW_PREV : "+thcv.getCaseNewPrev());
        System.out.println("CASE_NEW_DIFF : "+thcv.getCaseNewDiff());
        System.out.println("DEATH_NEW_PREV : "+thcv.getDeathNewPrev());
        System.out.println("DEATH_NEW_DIFF : "+thcv.getDeathNewDiff());
        System.out.println("UDPATE_DATE : "+thcv.getUpdateDate());
    }
}
