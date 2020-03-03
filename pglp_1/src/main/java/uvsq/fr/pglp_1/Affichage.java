package uvsq.fr.pglp_1;

public class Affichage extends Employe {
	public Affichage(String nom, String adresse) {
		super(nom, adresse);
	}
	
	public Affichage() {
		super(null,null);
	}

	public void afficheCoordonnees() {System.out.println(nom+"."+adresse);}

	
}

