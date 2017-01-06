import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		
		Client c1 = new Client("toto", 1000, "Puteaux");
		Client c2 = new Client("titi", 1000, "Puteaux");
		Client c3 = new Client("martin", 10, "Paris");
		Client c4 = new Client("zoe",1500, "Londres");
		
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
		
		//listeClients.forEach(cl->System.out.println(cl.getNom()));		
		//listeClients.forEach(System.out::println);
		
		System.out.println("streams :\n");
		
		// demo streams
		String noms = listeClients
		.stream()
		.filter(cli->cli.getMontantAchat()>100)
		.filter(cli->cli.getNom().startsWith("t"))
		.map(cli->cli.getNom())
		.sorted()
		.map(nom->nom.toUpperCase())
		//.forEach(nom->System.out.println(nom));
		//.collect(Collectors.toList());
		.reduce("", (nom1,nom2)->nom1+nom2);
		System.out.println(noms);
		
		double achats = listeClients
			.stream()
			.filter(cli->cli.getVille().equals("Puteaux"))
			.mapToDouble(cli->cli.getMontantAchat())
			.sum();
		
		System.out.println("Total des achats Puteaux " + achats);
		
		
		
	}

}
