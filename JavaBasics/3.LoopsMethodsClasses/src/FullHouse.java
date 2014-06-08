import java.util.*;

public class FullHouse {
	
	 public static String[] generateDeck(){
		  
		  String [] cards = new String [52];
		  
		//unicodes for the particular suits
		  char diamond = '\u2666'; 
		  char spade = '\u2660';
		  char heart = '\u2665';
		  char club = '\u2663'; 
		  
		  //arrays with the suits
		  String [] diamonds = generateSuit(diamond);
		  String [] spades = generateSuit(spade);
		  String [] hearts = generateSuit(heart);
		  String [] clubs = generateSuit(club);
		  
		  //counters for the particular suits
		  int currentDiamond = 0;
		  int currentSpade = 0;
		  int currentHeart = 0;
		  int currentClub = 0;
		  
		  for (int i = 0; i < cards.length; i++) {
			
			if (i < 13) {
				cards[i] = diamonds[currentDiamond];
				currentDiamond++;
			}
			else if (i >= 13 && i < 26) {
				cards[i] = spades[currentSpade];
				currentSpade++;
			}
			else if (i >= 26 && i < 39) {
				cards[i] = hearts[currentHeart];
				currentHeart++;
			}
			else {
				cards[i] = clubs[currentClub];
				currentClub++;
			}
		  }
		  return cards;
		 }
	
	 public static String [] generateSuit(char suit){
		 
		 String [] cardsSuit = new String [13];
		 
		 for (int i = 0; i < cardsSuit.length; i++) {
			
			 if (i <= 8) {
			    cardsSuit[i] = i + 2 + "" + suit;
			   }
			   else if (i == 9) {
				   cardsSuit[i] = 'J' + "" + suit;
			   }
			   else if (i == 10) {
				   cardsSuit[i] = 'Q' + "" + suit;
			   }
			   else if (i == 11) {
				   cardsSuit[i] = 'K' + "" + suit;
			   }
			   else if (i == 12) {
				   cardsSuit[i] = 'A' + "" + suit; 
			
			   }
	 	}
		return cardsSuit;
	 }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [] cards = new String [52];
		
		cards = generateDeck();
		int fullHouses = 0;
		
		for (int i = 0; i < cards.length; i++) {
			
			for (int j = 0; j < cards.length; j++) {
				
				for (int j2 = 0; j2 < cards.length; j2++) {
					
					for (int k = 0; k < cards.length; k++) {
						
						for (int k2 = 0; k2 < cards.length; k2++) {
							
							if (Integer.parseInt(cards[i].charAt(0) + "") == Integer.parseInt(cards[j].charAt(0) + "") 
									&& Integer.parseInt(cards[i].charAt(0) + "") == Integer.parseInt(cards[j2].charAt(0) + "") 
									&& Integer.parseInt(cards[k].charAt(0) + "") == Integer.parseInt(cards[k2].charAt(0) + "") 
									&& Integer.parseInt(cards[i].charAt(0) + "") != Integer.parseInt(cards[k].charAt(0) + "")
									&& Integer.parseInt(cards[i].charAt(0) + "") != Integer.parseInt(cards[k2].charAt(0) + "")) {
								
								System.out.print("(" + cards[i] + " " + cards[j] + " " +
										cards[j2] + " " + cards[k] + " " + cards[k2] + ") ");
								fullHouses++;
							}
						}
					}
				}
			}
		}
		System.out.println(fullHouses);		
	}
}
