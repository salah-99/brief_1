
public class Personne {
	
	private String matricule,nom,prenom,email;
	private int telephone;
	private double salaire;
	public Personne() {}
	public Personne(String Matricule,String Nom,String Prenom,String Email,int Telephone,double Salaire) {
		
		this.matricule = Matricule;
		this.nom = Nom;
		this.prenom = Prenom;
		this.email = Email;
		this.telephone = Telephone;
		this.salaire = Salaire;
		
	}
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	//la méthode affiche()
	@Override
	public String toString() {
		return  "\n \t ---------------- \n \t Matricule    : " + this.matricule + "\n \t NOM          : " + this.nom + "\n \t PRENOM       : " + this.prenom + "\n \t EMAIL        : " + this.email + "\n \t TELEPHONE    : " + this.telephone + "\n \t SALAIRE      : " + this.salaire ;
	}
	

}
