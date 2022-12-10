/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverForTester;

import Controller.Control;
import Model.Thcvsoap;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
public class Driver {

    public static void main(String[] args) {
        Control c = new Control();
        System.out.println("Status : "+c.insertToDatabase());
        //System.out.println("Status : "+c.removeFromDatabase());
    }
    
    
}
