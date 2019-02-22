package com.loic;

import java.util.Scanner;

public class PersonnageFabrique {

    /**
     * Méthode permettant l'envoi des questions pour la construction du joueur en lui affiliant la classe choisit.
     * @return Joueur de type Guerrrier, Rodeur, Magicien
     */

    public static Personnage personnageConstruct() {

        Scanner sc = new Scanner(System.in);

        /**
         * Variable boolean utilisé pour faire des vérifications
         * chExiste = vérifie que le choix de la classe est bien compris entre 1 et 3 (inclus)
         * verifInt = vérifie que la donnée rentrée est bien un entier
         * nivOk = vérifie que le niveau renseigné est bien compris entre 1 et 100 (inclus)
         * controleFai = vérifie que la condition force+agilite+intelligence=niveau
         */
        boolean chExiste = false;
        boolean verifInt = false;
        boolean nivOk = false;
        boolean controleFai = false;

        /**
         * Définition du personnage Joueur avec des caractéristiques nulle
         */
        Personnage Joueur = null;

        /**
         * Initialisation des variables
         */
        int niveau = 0;
        int force = 0;
        int agilite = 0;
        int intelligence = 0;
        int choix = 0;

        /**
         * Boucle permettant de contrôler que la classe est choisit sur les 3 proposées.
         * Mise en place d'un boolean pour sortir de la boucle.
         */
        do {
            System.out.println("Quel type de classe choisissez vous ? (1: Guerrier, 2: Rodeur, 3: Magicien)");
            verifInt = sc.hasNextInt();
            if (verifInt) {
                choix = sc.nextInt();
                if (choix < 1 || choix > 3) {
                    System.out.println("Merci de saisir une classe existante : 1, 2 ou 3");
                } else {
                    chExiste = true;
                }
            } else {
                System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                sc.nextLine();
            }
        } while (!chExiste || !verifInt);

        System.out.println("Quel est le nom de votre personnage ?");
        sc.nextLine();
        String name = sc.nextLine();

        /**
         * Boucle permettant de contrôler que le niveau choisit est bien compris entre 0 et 100.
         * Mise en place d'un boolean pour sortir de la boucle.
         */
        do {
            System.out.println("Niveau du personnage ?");
            verifInt = sc.hasNextInt();
            if (verifInt) {
                niveau = sc.nextInt();
                if (niveau <= 0 || niveau > 100) {
                    System.out.println("Merci de choisir un niveau compris entre 1 et 100");
                    nivOk = false;
                } else {
                    nivOk = true;
                }
            } else {
                System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                sc.nextLine();
            }
        } while (!nivOk || !verifInt);

        /**
         * Boucle permettant de contrôler que la force + l'agilité + l'intelligence est égal
         * Boucle dans la boucle pour chacun des paramètres permettant de contrôler que l'on rentre bien un entier.
         * au niveau choisit précédemment.
         * Mise en place d'un boolean pour sortir de la boucle.
         */
        do {
            do {
                System.out.println("Force du personnage ?");
                sc.nextLine();
                verifInt = sc.hasNextInt();
                if (verifInt) {
                    force = sc.nextInt();
                } else {
                    System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                }
            } while (!verifInt);
            do {
                System.out.println("Agilité du personnage ?");
                sc.nextLine();
                verifInt = sc.hasNextInt();
                if (verifInt) {
                    agilite = sc.nextInt();
                } else {
                    System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                }
            } while (!verifInt);
            do {
                System.out.println("Intelligence du personnage ?");
                sc.nextLine();
                verifInt = sc.hasNextInt();
                if (verifInt) {
                    intelligence = sc.nextInt();
                } else {
                    System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                }
            } while (!verifInt);
            if (force + agilite + intelligence != niveau) {
                System.out.println("Merci de choisir une force, une agilité, une intelligence de telle manière que la somme des trois soit égale à votre niveau.");
                controleFai = false;
            } else {
                controleFai = true;
            }
        } while (!controleFai);


        switch (choix) {
            case 1:
                Joueur = new Guerrier(name, niveau, force, agilite, intelligence);
                System.out.println("\nWoarg je suis le Guerrier " + Joueur.getName() + " de niveau " + Joueur.getNiveau() + " je possède " + Joueur.getVie() + " de vitalité, " + Joueur.getForce() + " de force, " + Joueur.getAgilite() + " d'agilité, " + Joueur.getIntelligence() + " d'intelligence.");
                break;

            case 2:
                Joueur = new Rodeur(name, niveau, force, agilite, intelligence);
                System.out.println("\nChutttt je suis le Rôdeur " + Joueur.getName() + " de niveau " + Joueur.getNiveau() + " je possède " + Joueur.getVie() + " de vitalité, " + Joueur.getForce() + " de force, " + Joueur.getAgilite() + " d'agilité, " + Joueur.getIntelligence() + " d'intelligence.");
                break;

            case 3:
                Joueur = new Magicien(name, niveau, force, agilite, intelligence);
                System.out.println("\nShazam je suis le Magicien " + Joueur.getName() + " de niveau " + Joueur.getNiveau() + " je possède " + Joueur.getVie() + " de vitalité, " + Joueur.getForce() + " de force, " + Joueur.getAgilite() + " d'agilité, " + Joueur.getIntelligence() + " d'intelligence !");
                break;
        }
        return Joueur;
    }



}
