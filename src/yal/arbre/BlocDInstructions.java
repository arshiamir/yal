package yal.arbre;

import java.util.ArrayList;

/**
 * 21 novembre 2018
 *
 * @author brigitte wrobel-dautcourt
 */

public class BlocDInstructions extends ArbreAbstrait {
    
    protected ArrayList<ArbreAbstrait> programme ;

    public BlocDInstructions(int n) {
        super(n) ;
        programme = new ArrayList<>() ;
    }
    
    public void ajouter(ArbreAbstrait a) {
        programme.add(a) ;
    }
    
    @Override
    public String toString() {
        return programme.toString() ;
    }

    @Override
    public void verifier() {
        
    }
    
    @Override
    public String toMIPS() {

        String stringMIPS = "#BlocDInstructions:";
        for (ArbreAbstrait arbre : programme){
            stringMIPS.concat(arbre.toMIPS());
        }
        return stringMIPS;
        //throw new UnsupportedOperationException("Not supported yet.");

    }

}
