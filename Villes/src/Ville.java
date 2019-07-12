import java.util.Objects;

public class Ville {

	// Variables publiques qui comptent les instances
	public static int nbreInstances = 0;

	// Variable priv�e qui comptera aussi les instances
	protected static int nbreInstancesBis = 0;

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	public Ville() {
		// On incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
	}

	public Ville(String pNom, int pNbre, String pPays) {
		// On incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
	}

	public static int getNombreInstancesBis() {
		return nbreInstancesBis;
	}

	// Retourne le nom de la ville
	public String getNom() {
		return nomVille;
	}

	// Retourne le nom du pays
	public String getNomPays() {
		return nomPays;
	}

	// Retourne le nombre d'habitants
	public int getNombreHabitants() {
		return nbreHabitants;
	}

	// Retourne la catégorie de la ville
	public char getCategorie() {
		return categorie;
	}

	// Définit le nom de la ville
	public void setNom(String pNom) {
		nomVille = pNom;
	}

	// Définit le nom du pays
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}

	// Définit le nombre d'habitants
	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
		this.setCategorie();
	}

	// Définit la catégorie de la ville
	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de catégorie : " + this.categorie;
	}

	// Retourne une chaîne de caractères selon le résultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNombreHabitants() > this.nbreHabitants)
			str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();

		return str;
	}

	public int hashCode2() {
		return Objects.hash(categorie, nbreHabitants, nomPays, nomVille);
	}

	public int hashCode() {
		// On d�finit un multiplication impair, de pr�f�rence un nombre premier
		// Ceci afin de garantir l'unicit� du r�sultat final
		final int prime = 31;
		// On d�finit un r�sultat qui sera renvoy� au final
		int result = 1;
		// On ajoute en eux la multiplication des attributs et du multiplicateur
		result = prime * result + categorie;
		result = prime * result + nbreHabitants;
		// Lorsque vous devez g�rer des hashcodes avec des objets dans le mode de calcul
		// Vous devez v�rifier si l'objet n'est pas null, sinon vous aurez une erreur
		result = prime * result + ((nomPays == null) ? 0 : nomPays.hashCode());
		result = prime * result + ((nomVille == null) ? 0 : nomVille.hashCode());
		return result;
	}

	public boolean equals1(Object obj) {
		// On v�rifie si les r�f�rences d'objets sont identiques
		if (this == obj)
			return true;

		// On s'assure que les objets sont du m�me type, ici de type Ville
		if (getClass() != obj.getClass())
			return false;

		// Maintenant, on compare les attributs de nos objets
		Ville other = (Ville) obj;

		return Objects.equals(other.getCategorie(), this.getCategorie())
				&& Objects.equals(other.getNom(), this.getNom())
				&& Objects.equals(other.getNombreHabitants(), this.getNombreHabitants())
				&& Objects.equals(other.getNomPays(), this.getNomPays());
	}

	public boolean equals(Object obj) {
		// On v�rifie si les r�f�rences d'objets sont identiques
		if (this == obj)
			return true;

		// On v�rifie si l'objet pass� en param�tre est null
		if (obj == null)
			return false;

		// On s'assure que les objets sont du m�me type, ici de type Ville
		// La m�thode getClass retourne un objet Class qui repr�sente la classe de votre
		// objet
		// Nous verrons �a un peu plus tard...
		if (getClass() != obj.getClass())
			return false;

		// Maintenant, on compare les attributs de nos objets
		Ville other = (Ville) obj;
		if (categorie != other.categorie)
			return false;
		if (nbreHabitants != other.nbreHabitants)
			return false;
		if (nomPays == null) {
			if (other.nomPays != null)
				return false;
		} else if (!nomPays.equals(other.nomPays))
			return false;

		if (nomVille == null) {
			if (other.nomVille != null)
				return false;
		} else if (!nomVille.equals(other.nomVille))
			return false;

		return true;
	}
}