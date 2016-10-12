package Team3Casino;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by kenragonese on 10/12/16.
 */
public abstract class Game {
    HashMap<Player, Set<Bet>> bet = new HashMap<Player, Set<Bet>>();
    Display console = new Console(); //TODO IS THIS CORRECT??

    public void takeBet(Player p){
        //TODO
    }
    public void settleAllBets(){
        //TODO
    }


}
