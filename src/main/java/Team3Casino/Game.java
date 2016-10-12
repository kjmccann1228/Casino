package Team3Casino;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by kenragonese on 10/12/16.
 */
public abstract class Game {
    HashMap<Player, Bet> mapOfPlayersAndBets = new HashMap<Player, Bet>();
    Random random = new Random();


    public void takeBet(Player p){
        //TODO
    }
    public void settleAllBets(){
        //TODO
    }

}
