
public class Ville {
	// Stocke le nom de notre ville
	String nomVille;
	// Stocke le nom du pays de notre ville
	String nomPays;
	// Stocke le nombre d'habitants de notre ville
	int nbreHabitants;

	// Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}
}