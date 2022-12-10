/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Model;
import javax.swing.table.DefaultTableModel;
import services.Thcvsoap;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class Control {
    private Model m = new Model();
    
    public Thcvsoap dataFromSOAPServices() {
        services.DisplayWebService_Service service = new services.DisplayWebService_Service();
        services.DisplayWebService port = service.getDisplayWebServicePort();
        return port.findData(1);
    }
    public DefaultTableModel showData(DefaultTableModel model) {
        return m.showData(model, dataFromSOAPServices());
    }
}
