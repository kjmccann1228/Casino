package Team3Casino;

import java.util.ArrayList;
import java.util.List;

/*** Created by zaclee on 10/12/16. ***/

public class Hand {

    List<Card> hand = new ArrayList<Card>();





    //These methods need to be Unit Tested still

    void displayHand() {
        for(Card x : hand) {
            System.out.println(x.getCardName());
        }
    }

    void clearHand() {
        int numCards = this.hand.size();
        for(int i=0; i<numCards; i++) {
            hand.remove(0);
        }
    }
}
