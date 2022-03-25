public class Geldautomat {

	public static void main(String args[]) {
				      
		int i = 0, number;
		double payment = 7.69;
		double[] coins = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
		String coins_name = "€";
		
		System.out.println(" Ihr Beitrag: " + payment + coins_name);
		System.out.println(" Ihr Kleingeld: ");
		System.out.printf(" %-9s %-9s %-9s", "Nennwert", "Währung", "Anzahl, M");
		System.out.println();
		
		while (payment > 0 & i < coins.length) {
			
			number = (int)(payment / coins[i]);
			payment = (double) Math.round(payment % coins[i]*100)/100;

			if (number > 0) {
				
				System.out.printf(" %-9s %-9s %-9s", coins[i], coins_name, number);
				System.out.println();
				
			}
			i++;
		}
	}
}

