package Team3Casino;

import java.util.Map;

/*** Created by zaclee on 10/12/16. ***/

public abstract class CardGame {

    private Deck deck;
    private Map<Player, Hand> playerHands;

    dealCard(Hand, int) : void
    dealCard(Hand) : void
    calculateHandValue(Hand): String
    getRemainingDeckSize() : int


}
