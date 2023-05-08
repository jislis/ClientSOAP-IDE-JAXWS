package ch.hearc.ig.asi.clientws.service;

import ch.hearc.ig.asi.clientws.business.Acte;
import ch.hearc.ig.asi.clientws.business.IDEFinder;
import ch.hearc.ig.asi.clientws.integration.IDEValidation;

public class NotarialService {

    public String verification(Acte acte){
        String desc = acte.getDesc();

        String ideInDesc = new IDEFinder(desc).find();

        String result = IDEValidation.validate(ideInDesc);
        return result;
    }
}
