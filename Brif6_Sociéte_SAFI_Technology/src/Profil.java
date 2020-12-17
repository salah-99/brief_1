import java.util.ArrayList;


public class Profil {
	
	private int count;
	private int id;

	String code,libelle;
	public Profil(){}
	public Profil(String Code,String Libelle) {
		this.id=count++;
		this.code = Code;
		this.libelle = Libelle;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	//la méthode affiche()
	@Override
	public String toString() {
		return "[" + this.id + "," + this.code + "," + this.libelle + "]";
	}
	
	//creation des profile
	public static void AjouterProfil(Profil profil,ArrayList<Profil> prfil,String code) {
		int cnt = 0;
		for (int j = 0; j < prfil.size(); j++) {
			if (code == prfil.get(j).getCode()) {
				cnt++;
			}
		}
		if(cnt ==0) {
			prfil.add(profil);
			System.out.println("\n ajoute profil avec succes");
		}else {
			System.out.println("\n profil deja exist");
		}
	}
}
