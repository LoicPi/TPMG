package com.loic;

/**
 * <b>Personnage est une classe abstraite permettant de définir un personnage.</b>
 * <p>
 *     Un personnage  est caractérisé par les informations suivantes :
 *     <ul>
 *         <li>Un nom, un niveau, une force, une agilité, une intelligence définit par le joueur</li>
 *     </ul>
 * </p>
 * <p>
 *     De plus un personnage ne peut être crée et est la classe mère des classes Guerrier, Rodeur, Magicien.
 * </p>
 *
 * @author Loic
 * @version 1.0
 */

public abstract class Personnage {

    /**
     * Le nom du personnage
     */
    private String name;

    /**
     * Les caractéristiques du personnage (niveau, force, agilité, intelligence).
     * La vie est caractérisé par le niveau du personnage.
     */
    private int niveau, force, agilite, intelligence, vie;

    /**
     * Constructeur de Personnage définit avec son nom son niveau sa force son agilité et son intellifence
     * @param name renvoi le nom du personnage
     * @param niveau renvoi le niveau du personnage
     * @param force renvoi la force du personnage
     * @param agilite renvoi l'agilité du personnage
     * @param intelligence renvoi l'intelligence du personnage
     */

    public Personnage(String name, int niveau, int force, int agilite, int intelligence) {
        this.name = name;
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.vie = this.niveau*5;
    }

    /**
     * Création d'une méthode attaque basique pour un personnage
     */
    public void attaqueBasique(Personnage j2){

    }


    /**
     * Création d'une méthode attaque spéciale pour un personnage
     */
    public void attaqueSpeciale (Personnage j2){

    }

    /**
     * Création des différents getters et setters pour les variables de la classe
     * @return les différentes caractéristiques du personnage pour les getters
     * @return met à jour les caractéristiques du personnage pour les setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
