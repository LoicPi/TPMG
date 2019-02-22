package com.loic;

import java.util.Scanner;

public class Jeu {

    /**
     * Méthode permettant le déroulement du jeu tour par tour en prenant comme paramètres 2 joueurs
     * @param j1
     * @param j2
     */
    public void choixAttaque(Personnage j1, Personnage j2) {

        Scanner sc = new Scanner(System.in);

        /**
         * Initialisation des variables
         */
        int i = 1;
        int ch = 0;

        /**
         * Variable boolean utilisé pour faire des vérifications
         * choixOk = vérifie que le choix d'attaque est bien 1 ou 2
         * verifInt = vérifie que la donnée rentrée est bien un entier
         */
        boolean choixOk = false;
        boolean verifInt = false;

        /**
         * Boucle mise en place pour le tour par tour et la sortie ne se fait que si un joueur a sa vie en dessous ou égal à O.
         */
        while (j1.getVie() > 0 && j2.getVie() > 0) {
            if (i % 2 != 0) {

                /**
                 * Boucle pour bien s'assurer que le choix se fait sur le nombre 1 ou 2
                 * Mise en place d'un boolean pour sortir de la boucle
                 */
                do {
                    System.out.println("\n" + j1.getName() + " (" + j1.getVie() + ") veuillez choisir votre action (1: Attaque basique, 2: Attaque Spéciale)");
                    verifInt = sc.hasNextInt();
                    if (verifInt) {
                        ch = sc.nextInt();
                        if (ch < 1 || ch > 2) {
                            System.out.println("Merci de saisir une attaque existante : 1 ou 2");
                            choixOk = false;
                        } else {
                            choixOk = true;
                        }
                    } else {
                        System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                        sc.nextLine();
                    }
                } while (!choixOk);

                switch (ch) {
                    case 1:
                        j1.attaqueBasique(j2);
                        break;

                    case 2:
                        j1.attaqueSpeciale(j2);
                        break;
                }
            } else {

                do {
                    System.out.println("\n" + j2.getName() + " (" + j2.getVie() + ") veuillez choisir votre action (1: Attaque basique, 2: Attaque Spéciale)");
                    verifInt = sc.hasNextInt();
                    if (verifInt) {
                        ch = sc.nextInt();
                        if (ch < 1 || ch > 2) {
                            System.out.println("Merci de saisir une attaque existante : 1 ou 2");
                            choixOk = false;
                        } else {
                            choixOk = true;
                        }
                    } else {
                        System.out.println("Vous avez choisi un caractère différent d'un nombre !");
                        sc.nextLine();
                    }
                } while (!choixOk);

                switch (ch) {
                    case 1:
                        j2.attaqueBasique(j1);
                        break;

                    case 2:
                        j2.attaqueSpeciale(j1);
                        break;
                }
            }
            i++;
        }
        if (j1.getVie() <= 0 && j2.getVie() >= 0) {
            System.out.println(j1.getName() + " a perdu.");
        }
        if (j1.getVie() >= 0 && j2.getVie() <= 0) {
            System.out.println(j2.getName() + " a perdu. ");
        }
        if (j1.getVie() <= 0 && j2.getVie() <= 0) {
            System.out.println(j1.getName() + " et " + j2.getName() + " se sont entretuer.");
        }
    }

}
