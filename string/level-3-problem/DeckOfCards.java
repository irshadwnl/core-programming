
import java.util.Arrays;
public class DeckOfCards {
    public static void main(String[] args) {
        String suits[]={"Hearts","Diamonds","Clubs","Spades"};
        String ranks[]={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
        int numOfCards=suits.length*ranks.length;
        String[]deck=initailizeDeck(suits,ranks,numOfCards);
        shuffleDeck(deck);
        // System.out.println(Arrays.toString(deck));
        String deckOfCard[][]=distributeCard(deck);

        for(String s[]:deckOfCard){
            System.out.println(Arrays.toString(s));
        }
    }


    private static String[] initailizeDeck(String[] suits, String[] ranks,int numOfCards) {
        String deck[]=new String[numOfCards];
        int idx=0;
        for(String s:suits){
            for(String r:ranks){
                deck[idx]= r+" of "+s;
                idx++;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck) {
        int n=deck.length;
        for(int i=0;i<n;i++){
            int randomCardNumber=i + (int) (Math.random() * (n - i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
    }

    private static String[][] distributeCard(String[] deck) {
        String players[][]=new String[5][6];
        int idx=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                players[i][j]=deck[idx++];
            }
        }
        return players;
    }
}
