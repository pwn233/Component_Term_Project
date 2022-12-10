/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ThcvsoapRest;
import Model.stringHandler;
import Utils.DDCApiClient;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class Control {
    public ThcvsoapRest pullDataFromApi() {
        //DDCApiClient cac = new DDCApiClient();
        //String data_json_string_form = cac.findAll_JSON(String.class);    
        String data_json_string_form = "[{\"year\":2022,\"weeknum\":48,\"new_case\":4284,\"total_case\":4711528,\"new_case_excludeabroad\":4284,\"total_case_excludeabroad\":4686453,\"new_recovered\":0,\"total_recovered\":4647275,\"new_death\":105,\"total_death\":33285,\"case_foreign\":0,\"case_prison\":0,\"case_walkin\":4284,\"case_new_prev\":4540,\"case_new_diff\":-256,\"death_new_prev\":110,\"death_new_diff\":-5,\"update_date\":\"2022-12-05 07:30:48\"}]";
        ThcvsoapRest thcv = new ThcvsoapRest();
        stringHandler sh = new stringHandler();
        thcv = sh.splitData(thcv, data_json_string_form);
        return thcv;
    }
    
    public void checkData(ThcvsoapRest thcv) {
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
