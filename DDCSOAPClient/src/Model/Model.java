/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.table.DefaultTableModel;
import services.Thcvsoap;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class Model {

    public DefaultTableModel showData(DefaultTableModel model, Thcvsoap t) {
        String id = String.valueOf(t.getId());
        String y = String.valueOf(t.getYears());
        String w = String.valueOf(t.getWeeknum());
        String nc = String.valueOf(t.getNewCase());
        String tc = String.valueOf(t.getTotalCase());
        String nce = String.valueOf(t.getNewCaseExcludeabroad());
        String tce = String.valueOf(t.getTotalCaseExcludeabroad());
        String nr = String.valueOf(t.getNewRecovered());
        String tr = String.valueOf(t.getTotalRecovered());
        String nd = String.valueOf(t.getNewDeath());
        String td = String.valueOf(t.getTotalDeath());
        String cf = String.valueOf(t.getCaseForeign());
        String cp = String.valueOf(t.getCasePrison());
        String cw = String.valueOf(t.getCaseWalkin());
        String cnp = String.valueOf(t.getCaseNewPrev());
        String cnd = String.valueOf(t.getCaseNewDiff());
        String dnp = String.valueOf(t.getDeathNewPrev());
        String dnd = String.valueOf(t.getDeathNewDiff());
        String ud = String.valueOf(t.getUpdateDate());
        String[] row = {id, y, w, nc, tc, nce, tce, nr, tr, nd ,td, cf, cp, cw ,cnp, cnd, dnp, dnd, ud};
        model.addRow(row);
        // critical variable name, beware of it!
        return model;
    }
}
