import java.util.ArrayList;
import java.util.Comparator;

public class Lambda {

	public static void main(String[] args) {
		
		Client c1 = new Client("toto", 1000);
		Client c2 = new Client("tutu", 10);
		Client c3 = new Client("martin", 100000);

		ArrayList<Client> listeClients = new ArrayList<>();
		listeClients.add(c1);
		listeClients.add(c2);
		listeClients.add(c3);
		
//		listeClients.sort(new Comparator<Client>() {
//			public int compare(Client cl1, Client cl2) {
//				// je compare en fonction des noms
//				//return cl1.getNom().compareTo(cl2.getNom());
//				// je compare en fonction des montants d'achat
//				return (int)(cl1.getMontantAchat() - cl2.getMontantAchat());
//			}
//		});
		
		listeClients.sort((cl1, cl2)->(int)(cl1.getMontantAchat() - cl2.getMontantAchat()));
		
		
//		for(Client c:listeClients) {
//			System.out.println(c.getNom());
//		}
		
		listeClients.forEach(cl->System.out.println(cl.getNom()));
		
		listeClients.forEach(System.out::println);
		
		
	}

}
