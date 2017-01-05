
public class Client {
	
	private String nom;
	private double montantAchat;
	
		
	public Client(String nom, double montantAchat) {
		super();
		this.nom = nom;
		this.montantAchat = montantAchat;
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
