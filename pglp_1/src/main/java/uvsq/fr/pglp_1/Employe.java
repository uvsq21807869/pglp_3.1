package uvsq.fr.pglp_1;

abstract class Employe {
	
		protected final String nom;
		protected final String adresse;
		
		public Employe(String nom,String adresse)
		{
			this.nom=nom;
			this.adresse=adresse;
		}
	}
