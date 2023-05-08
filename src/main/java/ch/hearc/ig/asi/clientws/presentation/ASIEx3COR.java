/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.asi.clientws.presentation;

import ch.hearc.ig.asi.clientws.integration.IDEValidation;

/**
 *
 * @author maximili.jeannere
 */
public class ASIEx3COR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alternative sans GUI        
        String result = IDEValidation.validate("CHE-102.429.188");
        System.out.println(result);
    }
    
}
