package Team3Casino;

import java.util.ArrayList;
import java.util.List;

/*** Created by zaclee on 10/12/16. ***/

public class PlayerManager {

    List<Player>  playersinCasino = new ArrayList<Player>();
    static int playerCounter = 0;


    void createPlayer(String name, String password) {
        Player player = new Player(playerCounter, name, password);
       playersinCasino.add(player);
        ++playerCounter;
    }

    Player getPlayerById(int userID, String password) {
        for(Player player: playersinCasino) {
            if(player.getPassWord().equals(password) && player.getUserID() == userID) {
                return player;
            }
        }
        return null;

    }




}
