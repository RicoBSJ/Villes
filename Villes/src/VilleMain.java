
public class VilleMain {

	public static void main(String[] args) {

		Ville v = new Ville();
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

		Ville v1 = new Ville("Marseille", 1236, "France");
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

		Ville v2 = new Ville("Rio", 321654, "Brï¿½sil");
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

		System.out.println("\n v = " + v.getNom() + " ville de  " + v.getNombreHabitants() + " habitants se situant en "
				+ v.getNomPays());
		System.out.println(" v1 = " + v1.getNom() + " ville de  " + v1.getNombreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		System.out.println(" v2 = " + v2.getNom() + " ville de  " + v2.getNombreHabitants()
				+ " habitants se situant en " + v2.getNomPays() + "\n");

		/*
		 * Nous allons interchanger les Villes v1 et v2 tout Ã§a par l'intermÃ©diaire
		 * d'un autre objet Ville.
		 */
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;

		System.out.println(" v1 = " + v1.getNom() + " ville de  " + v1.getNombreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		System.out.println(" v2 = " + v2.getNom() + " ville de  " + v2.getNombreHabitants()
				+ " habitants se situant en " + v2.getNomPays());

		/*
		 * Nous allons maintenant interchanger leurs noms cette fois par le biais de
		 * leurs mutateurs.
		 */
		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");

		System.out.println(" v1 = " + v1.getNom() + " ville de  " + v1.getNombreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		System.out.println(" v2 = " + v2.getNom() + " ville de  " + v2.getNombreHabitants()
				+ " habitants se situant en " + v2.getNomPays());

		System.out.println("\n" + v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi() + "\n");
		System.out.println(v1.comparer(v2) + "\n");

		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi() + "\n");

		Capitale cap2 = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println(cap2.decrisToi() + "\n");
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		        
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    Ville V = new Ville(tab[i], tab2[i], "france");
		    tableau[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Ville V : tableau){
		  System.out.println(V.decrisToi()+"\n");
		}
	}
}