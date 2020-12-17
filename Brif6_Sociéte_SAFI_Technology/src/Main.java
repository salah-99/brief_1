import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Utilisateur> ListUtilisateur = new ArrayList<Utilisateur>();
		ArrayList<Profil> ListProfil = new ArrayList<Profil>();
		
		Utilisateur utilisateur = new Utilisateur();
		Profil profil = new Profil();
		
		String code,libelle,matricule,nom,prenom,email,login,mot_de_passe,service;
		int id,telephone;
		double salaire;
		
		code ="";
		libelle ="";
		matricule ="";
		nom ="";
		prenom ="";
		email ="";
		login ="";
		mot_de_passe ="";
		service ="";
		
		while (true) {
			System.out.println(" Créer des utilisateurs    : 1 \n Afficher les utilisateurs : 2 \n La liste managers         : 3");
			String method = scan.next();
			String choix = "";
			//String choix = "";
			switch (method) {
				case "1":
					System.out.println("Matricule de utilisateurs");
					matricule = scan.next();
					System.out.println("Nom de utilisateurs");
					nom = scan.next();
					System.out.println("Prenom de utilisateurs");
					prenom = scan.next();
					System.out.println("Email de utilisateurs");
					email = scan.next();
					System.out.println("Téléphone de utilisateurs");
					telephone = scan.nextInt();
					System.out.println("Salaire de utilisateurs");
					salaire = scan.nextInt();
					System.out.println("Login de utilisateurs");
					login = scan.next();
					System.out.println("Mot de passe de utilisateurs");
					mot_de_passe = scan.next();
					System.out.println("service : \n "
							+ "\t --> Chef de projet                    : 1 \n "
							+ "\t --> Manager                           : 2 \n "
							+ "\t --> Directeur de projet               : 3 \n "
							+ "\t --> Directeur des ressources humaines : 4 \n "
							+ "\t --> Directeur général                 : 5");
					String method2 = scan.next();

					switch (method2) {
						case "1":
							//1
							code = "CP";
							libelle = "Chef de projet";
							Add_Profil_And_User( code, libelle, ListProfil, ListUtilisateur, matricule, nom, prenom, email, telephone, salaire, login, mot_de_passe);
							break;
						case "2" :
							//2
							code = "MN";
							libelle = "Manager";
							Add_Profil_And_User( code, libelle, ListProfil, ListUtilisateur, matricule, nom, prenom, email, telephone, salaire, login, mot_de_passe);
							break;
						case "3":
							//3
							code = "DP";
							libelle = "Directeur de projet";
							Add_Profil_And_User( code, libelle, ListProfil, ListUtilisateur, matricule, nom, prenom, email, telephone, salaire, login, mot_de_passe);
							break;
						case "4" :
							//4
							code = "DRH";
							libelle = "Directeur des ressources humaines";
							Add_Profil_And_User( code, libelle, ListProfil, ListUtilisateur, matricule, nom, prenom, email, telephone, salaire, login, mot_de_passe);
							break;
						case "5":
							//3
							code = "DG";
							libelle = "Directeur général";
							Add_Profil_And_User( code, libelle, ListProfil, ListUtilisateur, matricule, nom, prenom, email, telephone, salaire, login, mot_de_passe);
							break;
							
						default:
					}
					break;
				case "2" :
					//Afficher des utilisateurs
					if (ListUtilisateur.size() > 0) {
						System.out.println("les Utilisateur  : \n " + ListUtilisateur);
					}else {
						System.out.println("Liste des Utilisateur  Vide ! \n");
					}
					break;
				case "3" :
					//Filtrage des Manager
					if (ListUtilisateur.size() > 0) {
						utilisateur.FiltrageListManager(ListUtilisateur);
					}else {
						System.out.println("Liste des Utilisateur  Vide ! \n");
					}
					break;
				default:		
			}
		}

	}
	
	public static void Add_Profil_And_User(String code,String libelle,ArrayList<Profil> ListProfil,ArrayList<Utilisateur> ListUtilisateur,String matricule,String nom,String prenom,String email,int telephone,double salaire,String login,String mot_de_passe) {
		Profil profil = new Profil(code,libelle);
		profil.AjouterProfil(profil, ListProfil, code);
		Utilisateur utilisateur = new Utilisateur(matricule,nom,prenom,email,telephone,salaire,login,mot_de_passe,code);
		utilisateur.AjouterUtilisateurs(utilisateur, ListUtilisateur);
		utilisateur.calculerSalaire(ListUtilisateur,matricule);
	}

}
