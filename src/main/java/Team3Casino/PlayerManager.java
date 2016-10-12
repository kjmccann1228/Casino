package Team3Casino;

import java.util.ArrayList;
import java.util.List;

/*** Created by zaclee on 10/12/16. ***/

public class PlayerManager {

    public List<Player>  playersinCasino = new ArrayList<Player>();
    static int playerCounter = 0;


    public Player createPlayer(String name, String password) {
        ++playerCounter;
        Player player = new Player(playerCounter, name, password);
        playersinCasino.add(player);
        return player;
    }

    public Player getPlayerById(int userID, String password) {
        for(Player player: playersinCasino) {
            if(player.getPassWord().equals(password) && player.getUserID() == userID) {
                return player;
            }
        }
        return null;

    }




}
