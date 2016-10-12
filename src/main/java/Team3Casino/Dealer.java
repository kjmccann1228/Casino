package Team3Casino;

import java.util.ArrayList;
import java.util.List;

/*** Created by zaclee on 10/12/16. ***/

public class Dealer {

    //one problem... if our card game is going to have the deck - should it be the one to call the dealCard methond on
    //deck? otherwise we might have to make another deck in dealer? That or this class should not have a deal cardMethod
    //as on UML but just a hand for player to play against...

    List<Card> hand = new ArrayList<Card>();


//Might have to remove this method...

    void dealCard(Hand hand) {

    }

}
