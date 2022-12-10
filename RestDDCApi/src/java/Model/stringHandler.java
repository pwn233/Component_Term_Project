/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class stringHandler {
    private String[] dummy;
    public ThcvsoapRest splitData(ThcvsoapRest thcvsp, String inputLine) {
        String[] y = inputLine.substring(2, inputLine.length()-2).split(",");
        thcvsp.setId(1);
        for(String x : y){
            dummy = x.split(":", 2);
            dummy[0] = dummy[0].substring(1, dummy[0].length()-1);
            if(dummy[0].equals("year")) thcvsp.setYears(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("weeknum")) thcvsp.setWeeknum(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("new_case")) thcvsp.setNewCase(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("total_case")) thcvsp.setTotalCase(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("new_case_excludeabroad")) thcvsp.setNewCaseExcludeabroad(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("total_case_excludeabroad")) thcvsp.setTotalCaseExcludeabroad(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("new_recovered")) thcvsp.setNewRecovered(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("total_recovered")) thcvsp.setTotalRecovered(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("new_death")) thcvsp.setNewDeath(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("total_death")) thcvsp.setTotalDeath(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("case_foreign")) thcvsp.setCaseForeign(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("case_prison")) thcvsp.setCasePrison(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("case_walkin")) thcvsp.setCaseWalkin(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("case_new_prev")) thcvsp.setCaseNewPrev(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("case_new_diff")) thcvsp.setCaseNewDiff(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("death_new_prev")) thcvsp.setDeathNewPrev(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("death_new_diff")) thcvsp.setDeathNewDiff(Integer.parseInt(dummy[1]));
            else if(dummy[0].equals("update_date")) {
                dummy[1] = dummy[1].substring(1, dummy[1].length()-1);
                thcvsp.setUpdateDate(dummy[1]);
            }
        }            
        return thcvsp;
    }
}
