import java.util.ArrayList;



public class Utilisateur extends Personne{
	
	String login,mot_de_passe,service;
	public Utilisateur() {}
	public Utilisateur( String Matricule,String Nom,String Prenom,String Email,int Telephone,double Salaire,String Login,String Mot_de_passe,String Service) {
		super (Matricule,Nom,Prenom,Email,Telephone,Salaire);
		this.login = Login;
		this.mot_de_passe = Mot_de_passe;
		this.service = Service;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	//la méthode affiche()
	@Override
	public String toString() {
		return "[" + super.toString() + "\n \t LOGIN        : " + this.login + "\n \t Mot De Passe : " + this.mot_de_passe + "\n \t Service      : " + this.service + "]";
	}
	
	//la méthode calculerSalaire () 
	public void calculerSalaire (ArrayList<Utilisateur> ListUtilisateur,String Matricule) {
		for (int i = 0;i < ListUtilisateur.size(); i++) {
			if (ListUtilisateur.get(i).getMatricule() == Matricule) {
				if(ListUtilisateur.get(i).getService() == "MN") {
					double Salaire = ListUtilisateur.get(i).getSalaire();
					double augmentation;
					augmentation = (Salaire*8)/100 ;
					ListUtilisateur.get(i).setSalaire(augmentation + Salaire);
					System.out.println("Slaire initial : " + Salaire + "/n l'augmentation : " + augmentation + "/n Nouveau Slaire : " + (augmentation + Salaire) );
				}else if(ListUtilisateur.get(i).getService() == "DG") {
					double Salaire = ListUtilisateur.get(i).getSalaire();
					double augmentation;
					augmentation = (Salaire*15)/100 ;
					ListUtilisateur.get(i).setSalaire(augmentation + Salaire);
					System.out.println("Slaire initial : " + Salaire + "/n l'augmentation : " + augmentation + "/n Nouveau Slaire : " + (augmentation + Salaire) );
				}
			}
		}
	}
	
	
	//creation des utilisateurs
	public static void AjouterUtilisateurs(Utilisateur utilisateur,ArrayList<Utilisateur> utilisatr) {
		
		try {
			utilisatr.add(utilisateur);
			System.out.println("\n ajoute Utilisateur avec succes");
		}catch (Exception e) {
		      System.out.println(e);
		}
	}
	
	//filtrage des utilisateurs
	public void FiltrageListManager(ArrayList<Utilisateur> ListUtilisateur) {
		int cnt = 0;
		for(int j=0;j<ListUtilisateur.size();j++) {
			if(ListUtilisateur.get(j).getService() == "MN") {
				System.out.println(" \n \t ---------------- \n \t Matricule    : " + ListUtilisateur.get(j).getMatricule() + "\n \t NOM          : " + ListUtilisateur.get(j).getNom() + "\n \t PRENOM       : " + ListUtilisateur.get(j).getPrenom() + "\n \t EMAIL        : "  + ListUtilisateur.get(j).getEmail() + "\n \t TELEPHONE    : "  + ListUtilisateur.get(j).getTelephone() + "\n \t SALAIRE      : "  + ListUtilisateur.get(j).getSalaire() + "\n \t LOGIN        : "  + ListUtilisateur.get(j).getLogin() + "\n \t Mot De Passe : "  + ListUtilisateur.get(j).getMot_de_passe() + "\n \t Service      : "  + ListUtilisateur.get(j).getService()  );
				cnt ++;
			}
		}
		if(cnt == 0) {
			System.out.println(" \n \t HAHAHAHAHA PAS DES MANAGERES (^_^)! ");

		}
		
	}
	

}
