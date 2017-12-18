package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dao.VolDao;
import entities.Vol;
import utils.TypeAvion;

public class GestionDesVols {
	private static Vol vol;

	public static void creationDUnVol(Scanner sc) {

		vol = new Vol();
		String choix;

		System.out.println("Numéro de vol : ");
		choix = sc.next();
		vol.setNumeroDeVol(choix);

		System.out.println("Type d'avion : ");
		System.out.println("1) A330");
		System.out.println("2) A340");
		System.out.println("3) A340");
		System.out.println("4) B747");
		int choixI = sc.nextInt();
		menuTypeDeVol(choix);

		System.out.println("Nombre de place");
		choixI = sc.nextInt();
		vol.setNombreDePlace(choixI);

		System.out.println("Ville de départ");
		choix = sc.next();
		vol.setVilleDeDepart(choix);

		System.out.println("Ville d'arrivée");
		choix = sc.next();
		vol.setVilleDArrivee(choix);

		System.out.println("Date de départ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = sc.next();
		vol.setDateDepart(LocalDate.parse(date, formatter));

		VolDao.creationDeVol(vol);
	}

	private static void menuTypeDeVol(String choix) {

		TypeAvion type;
		switch (choix) {
		case "1":
			type = TypeAvion.A330;
			break;
		case "2":
			type = TypeAvion.A340;
			break;
		case "3":
			type = TypeAvion.A380;
			break;
		case "4":
			type = TypeAvion.B747;
		default:
			type = TypeAvion.A330;
		}
		vol.setTypeAvion(type);
	}

	public static void listeVols() {

		List<Vol> listeVols = VolDao.listeDesVols();
		System.out.println("Numéro | Type | Place | Départ | Arrivé | Date");

		for (Vol vol : listeVols) {
			System.out.println(vol.getNumeroDeVol() + "       | " + vol.getTypeAvion() + " | " 
					+ vol.getNombreDePlace() + " | " + vol.getVilleDeDepart() + " | " +
					vol.getVilleDArrivee() + " | " + vol.getDateDepart()
			);
		}
	}

	public static void rechercheAvion(Integer id) {
		
	}
	// TODO Recherche un avion par ville départ
}
