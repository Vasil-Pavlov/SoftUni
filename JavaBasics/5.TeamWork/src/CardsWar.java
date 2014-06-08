import java.util.Random;

public class CardsWar {
	
	public static void getPlayersCards(String [] bot, String [] player, 
			int botCardIndex, int playerCardIndex){
		
		bot[botCardIndex] = player[0];
		botCardIndex++;
		playerCardIndex--;
		bot[botCardIndex] = bot[0];
		player[0] = null;
		bot[0] = null;
	}
	
	public static void getBotsCards(String [] bot, String [] player, 
			int botCardIndex, int playerCardIndex){
		
		bot[botCardIndex] = player[0];
		botCardIndex++;
		playerCardIndex--;
		bot[botCardIndex] = bot[0];
		player[0] = null;
		bot[0] = null;
	}
	
	public static void cardsComparison(String [] player, String [] bot){
		
		int length =  52;
		int botCardIndex = 26;
		int playerCardIndex = 26;
		int botCards = 26;
		int playerCards = 26;
		int operations = 0;
		String winner = " ";
		
		//TO DO
		
		while (true) {
			
			if(playerCardIndex == 51){
				System.out.println("Player wins with " + operations + " operations!");
				break;
			
			}
			if (botCardIndex == 51) {
				System.out.println("Bot wins with " + operations + " operations!");
				break;
			}
			
			else {
				for (int i = 0; i < length; i++) {
					
					operations++;
					
					if (botCardIndex != 51 && i == length - 1 
							|| playerCardIndex != 51 && i == length - 1) {
						
						i = 0;
						
					}
					else {
						i = length - 1;
					}
					
					String botCard = bot[0];
					String playerCard = player[0];
					String [] botDigit = new String [4];
					String [] playerDigit = new String [4];
					char botSymbol = ' ';
					char playerSymbol = ' ';
					
					if (botCard != null) {
						botDigit = botCard.split(" ");
						botSymbol = botDigit[0].charAt(0);
					}
					else {
						break;
					}
					
					if (playerCard != null) {
						playerDigit = playerCard.split(" ");
						playerSymbol = playerDigit[0].charAt(0);
					}
					else {
						break;
					}
					
					if (botSymbol == '1') {
						botSymbol += 0;
					}
					
					if (playerSymbol == '1') {
						playerSymbol += 0;
					}
					
					if (Character.isDigit(botSymbol) &&
							Character.isDigit(playerSymbol)) {
						
						if (Integer.parseInt(botDigit[0]) > Integer.parseInt(playerDigit[0])) {
							if (botCardIndex > 51) {
								break;
							}
							getPlayersCards(bot, player, botCardIndex, playerCardIndex);
							
						}
						else {
							if (botCardIndex > 51) {
								break;
							}
							player[playerCardIndex] = bot[0];
							playerCardIndex++;
							botCardIndex--;
							player[playerCardIndex] = player[0];
							bot[0] = null;
							player[0] = null;
						}
					}
					else {
						if (Character.isAlphabetic(botSymbol) &&
								Character.isDigit(playerSymbol)) {
							if (botCardIndex > 51) {
								break;
							}
							bot[botCardIndex] = player[0];
							playerCards--;
							botCards++;
							botCardIndex++;
							playerCardIndex--;
							bot[botCardIndex] = bot[0];
							botCardIndex++;
							player[0] = null;
							bot[0] = null;
							
						}
						else if (Character.isAlphabetic(playerSymbol) &&
								Character.isDigit(botSymbol)) {
							if (botCardIndex > 51) {
								break;
							}
							player[playerCardIndex] = bot[0];
							playerCards++;
							botCards--;
							playerCardIndex++;
							botCardIndex--;
							player[playerCardIndex] = player[0];
							bot[0] = null;
							player[0] = null;
						}
						else {
							if (playerSymbol == 'A') {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								playerCards++;
								botCards--;
								playerCardIndex++;
								botCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							if (botSymbol == 'A') {
								if (botCardIndex > 51) {
									break;
								}
								bot[botCardIndex] = player[0];
								botCards++;
								playerCards--;
								botCardIndex++;
								playerCardIndex--;
								bot[botCardIndex] = bot[0];
								botCardIndex++;
								player[0] = null;
								bot[0] = null;
							}
							
							if (playerSymbol == 'K' 
									&& botDigit[0].charAt(0) != 'A' ) {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								playerCards++;
								botCards--;
								playerCardIndex++;
								botCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							
							if (botSymbol == 'K' 
									&& playerDigit[0].charAt(0) != 'A' ) {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								botCards++;
								playerCards--;
								botCardIndex++;
								playerCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							
							if (playerSymbol == 'Q' 
									&& botDigit[0].charAt(0) != 'A' 
									&& botDigit[0].charAt(0) != 'K') {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								playerCards++;
								botCards--;
								playerCardIndex++;
								botCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							
							if (botSymbol == 'Q' 
									&& playerDigit[0].charAt(0) != 'A'
									&& playerDigit[0].charAt(0) != 'K') {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								botCards++;
								playerCards--;
								botCardIndex++;
								playerCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							
							if (playerSymbol == 'J' 
									&& botDigit[0].charAt(0) != 'A' 
									&& botDigit[0].charAt(0) != 'K'
									&& botDigit[0].charAt(0) != 'Q') {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								playerCards++;
								botCards--;
								playerCardIndex++;
								botCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
							
							if (botSymbol == 'J' 
									&& playerDigit[0].charAt(0) != 'A'
									&& playerDigit[0].charAt(0) != 'K'
									&& playerDigit[0].charAt(0) != 'Q') {
								if (botCardIndex > 51) {
									break;
								}
								player[playerCardIndex] = bot[0];
								botCards++;
								playerCards--;
								botCardIndex++;
								playerCardIndex--;
								player[playerCardIndex] = player[0];
								bot[0] = null;
								player[0] = null;
							}
						}
					}	
					 SelectionSort(bot);
					 SelectionSort(player);
				}
				
//				for (int i = 0; i < bot.length; i++) {
//					System.out.println(bot[i]);
//				}
//				
//				for (int i = 0; i < player.length; i++) {
//					System.out.println(player[i]);
//				}
			}
		}
	}
	
		
	
	public static String winner(String [] player, String [] bot){
		
		String winner;
		int length = 0;
		
		while(true){
			if (player.length == 0) {
				winner = "Bot won!";
				break;
			}
			else if (bot.length == 0) {
				winner = "Player won!";
				break;
			}
			else {
				
				
			}
		}
		
		return winner;
	}
 
 public static void SelectionSort(String [] deck){
  
  for (int i = 0; i < deck.length - 1; i++) {
     
   String exchanger;
   for (int j = i + 1; j < deck.length; j++) {
	//arrange the cards in front of the array
    if (deck[i] == null) {
     exchanger = deck[i];
     deck[i] = deck[j];
     deck[j] = exchanger;
    }
   }
  }
 }
 
 public static String [] generateSuit(char suit){
	 
	 String [] cardsSuit = new String [13];
	 
	 for (int i = 0; i < cardsSuit.length; i++) {
		
		 if (i <= 8) {
		    cardsSuit[i] = i + 2 + " " + suit;
		   }
		   else if (i == 9) {
			   cardsSuit[i] = 'J' + " " + suit;
		   }
		   else if (i == 10) {
			   cardsSuit[i] = 'Q' + " " + suit;
		   }
		   else if (i == 11) {
			   cardsSuit[i] = 'K' + " " + suit;
		   }
		   else if (i == 12) {
			   cardsSuit[i] = 'A' + " " + suit; 
		
		   }
 	}
	return cardsSuit;
 }
 
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
 
 public static String[] shuffle(){
  
  String[] deck = generateDeck();
  Random random = new Random();
  String[] playingDeck = new String [deck.length];
  boolean [] visited = new boolean [deck.length];
  int index = 0;
   
  for (int i = 0; i < playingDeck.length; i++) {
  
    index = random.nextInt(52);
    
    if (visited[index] == false) {
     playingDeck[i] = deck[index];
     visited[index] = true;
    }
    else {
     i--;
    } 
   }
  return playingDeck;
 }
 
 public static void main(String[] args) {
  
  //create opponents decks
  String [] shuffledDeck= shuffle();
  String [] player = new String[shuffledDeck.length];
  String [] bot = new String[shuffledDeck.length];
  
  //Dealing out cards
  for (int i = 0; i < shuffledDeck.length; i++) {
   
   if (i % 2 == 0) {
    player[i] = shuffledDeck[i];
   }
   else {
    bot[i] = shuffledDeck[i];
   }
  }
  
  //move the 26 cards in front of the deck
  SelectionSort(bot);
  SelectionSort(player);
  
  //Print players` deck
  System.out.println("This is bot`s deck:");
  for (int i = 0; i < bot.length; i++) {
	  if (bot[i] != null) {
		  System.out.println(bot[i]);
	}  
  }
  
  System.out.println();
  
  System.out.println("This is player`s deck:");
  
  for (int i = 0; i < player.length; i++) {
	  if (player[i] != null) {
		  System.out.println(player[i]);
	}
  }
  
  System.out.println();
  
  cardsComparison(bot, player);
 }
}