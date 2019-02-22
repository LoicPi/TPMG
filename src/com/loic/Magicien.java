package com.loic;

public class Magicien extends Personnage {


    /**
     * Constructeur de Personnage définit avec son nom son niveau sa force son agilité et son intellifence
     *
     * @param name         renvoi le nom du personnage
     * @param niveau       renvoi le niveau du personnage
     * @param force        renvoi la force du personnage
     * @param agilite      renvoi l'agilité du personnage
     * @param intelligence renvoi l'intelligence du personnage
     */
    public Magicien(String name, int niveau, int force, int agilite, int intelligence) {
        super(name, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage j2) {
        System.out.println(getName() + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages.");
        System.out.println(j2.getName() + " perd " + getIntelligence() + " points de vie.");
        j2.setVie(j2.getVie()-getIntelligence());
        if(j2.getVie() <= 0){
            System.out.println(j2.getName() + " est mort");
        }
    }

    @Override
    public void attaqueSpeciale(Personnage j2) {
        int vieGain = getIntelligence()*2;
        int newVie = getVie()+(getIntelligence()*2);
        int vieMax = getNiveau()*5;

        if( newVie <= vieMax){
            System.out.println(getName() + " utilise Soin et gagne " + (vieGain) + " de vitalité.");
            setVie(newVie);
        } else {
            System.out.println(getName() + " utilise Soin et gagne " + (vieGain - (newVie - vieMax)) + " de vitalité.");
            setVie(vieMax);
        }
    }
}
