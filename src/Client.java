
public class Client {
	
	private String nom;
	private double montantAchat;
	private String ville;
		
	public Client(String nom, double montantAchat, String ville) {
		super();
		this.nom = nom;
		this.montantAchat = montantAchat;
		this.ville = ville;
	}
		
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getMontantAchat() {
		return montantAchat;
	}
	public void setMontantAchat(double montantAchat) {
		this.montantAchat = montantAchat;
	}
	
	
	
}
