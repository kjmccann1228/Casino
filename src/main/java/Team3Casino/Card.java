package Team3Casino;
/**
 * Created by zaclee on 9/28/16. -- feel free to scrap / change this if needed
 */
public class Card implements Comparable {

    public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3;
    public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
    public final int suit;
    public final int value;
    public String name;


    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }



    public String getSuitAsString() {
        switch (suit) {
            case SPADES: return "Spades";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            default: return "??";
        }
    }

    public String getValueAsString() {
        switch (value) {
            case 1: return "ACE";
            case 2: return "TWO";
            case 3: return "THREE";
            case 4: return "FOUR";
            case 5: return "FIVE";
            case 6: return "SIX";
            case 7: return "SEVEN";
            case 8: return "EIGHT";
            case 9: return "NINE";
            case 10: return "TEN";
            case 11: return "JACK";
            case 12: return "QUEEN";
            case 13: return "KING";
            default: return "??";
        }
    }

    public String getCardName() {
        name = this.getValueAsString() + " of " + this.getSuitAsString();
        return name;
    }

    public int compareTo(Object o) {
        if(o == null){
            throw new NullPointerException("Object to compare was null");
        }
        if(!(o.getClass().equals(this.getClass()))){
            throw new ClassCastException(("Objects are not the same class"));
        }

        Card comp = (Card)o;
        if(this.value == comp.value){
            return 0;
        }
        if(this.value == 1){
            return 1;
        }
        if(comp.value == 1){
            return -1;
        }
        if(this.value > comp.value){
            return 1;
        }
        if(this.value < comp.value){
            return -1;
        }
        return 0;
    }

//    public int getBlackJackValue() {
//        switch(value) {
//            case 1: return 11;
//            case 2: return 2;
//            case 3: return 3;
//            case 4: return 4;
//            case 5: return 5;
//            case 6: return 6;
//            case 7: return 7;
//            case 8: return 8;
//            case 9: return 9;
//            case 10: return 10;
//            case 11: return 10;
//            case 12: return 10;
//            case 13: return 10;
//            default: return 0;
//        }
//    }
}
