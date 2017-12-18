package controller;

import java.util.Scanner;


public class Menu {

	public static void lancementDuMenu(Scanner sc) {
	
		System.out.println("1) Gestion des vols");
		System.out.println("2) Gestion des réservation");
		System.out.println("3) Quitte");
		System.out.println("Veuillez saisir le numéro suivant votre choix");
		String test =sc.next();
		
		if (test.equals( "1")) {
			gestionDesVols(sc);
		}
		else if (test.equals( "2")) {
		}
		
		else if (test.equals( "3")) {

			System.out.println("A une prochaine");
			System.exit(1);
		}
		else {
			System.out.println("Ne correspond pas à aucune des propositions");
		}
	}
	
	public static void gestionDesVols(Scanner sc) {
		
		System.out.println("Gestion des vols");
		System.out.println("1) Création d'un vol");
		System.out.println("2) Liste des vols");
		System.out.println("3) Recherche un avion par numéro");
		System.out.println("4) Recherche un avion par ville de départ et d'arrivée");
		String test =sc.next();
		
		if (test.equals("1")) {
			GestionDesVols.creationDUnVol(sc);
		} 
		else if (test.equals("2")) {
			GestionDesVols.listeVols();
		} 
		else if (test.equals("3")) {

		} 
		else if (test.equals("4")) {

		} else {
			System.out.println("Ne correspond pas à aucune des propositions");
		}
	}

	public static void gestionDesReservations(Scanner sc) {

		System.out.println("Gestion des reservations");
		System.out.println("1) Créer une reservation");
		System.out.println("2) Voir les réservations d'un vol");
		System.out.println("3) Annuler une reservation");
		System.out.println("4) Voir toutes les réservation d'une personne");
		int test =sc.nextInt();
		
		if (test  == 1) {

		} else if (test  == 2) {

		} else if (test  == 3) {

		} else if (test  == 4) {

		} else {
			System.out.println("Ne correspond pas à aucune des propositions");
		}

	}	

}
