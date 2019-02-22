package com.loic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Bonjour dans MagiWorld !!!");
        System.out.println("Jeu pour deux joueurs : Créer votre personnage et combattez en duel !!!\n");

        System.out.println("Création du Joueur1\n");
        Personnage joueur1 = PersonnageFabrique.personnageConstruct();

        System.out.println("Création du Joueur2\n");
        Personnage joueur2 = PersonnageFabrique.personnageConstruct();

        Jeu jeu = new Jeu();
        jeu.choixAttaque(joueur1, joueur2);
    }


    }
}
