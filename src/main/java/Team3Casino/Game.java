package Team3Casino;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by kenragonese on 10/12/16.
 */
public abstract class Game {
    HashMap<Player, Bet> mapOfPlayersAndBets = new HashMap<Player, Bet>();
    Random random = new Random();


    protected void takeBet(Player p){
        //TODO
    }
    protected void settleAllBets(){
        //TODO
    }
    protected void addPlayerToMap() {
        //TODO
    }
    protected void removePlayerFromMap(){
        //TODO
    }
    protected void displayGameMenu(){
        //TODO
    }
    protected void gameMenuSwitch(){
        //TODO
    }
    protected void displayPlayAgainMenu(){
        //TODO
    }
    protected void playAgainSwitch(){
        //TODO
    }
    protected void evaluateWinner(){
        //TODO
    }
    protected void displayGameResults(){
        //TODO
    }
    protected void playRoundOfGame(){
        //TODO
    }
    protected void initalizeNewGameRound(){
        //TODO
    }
    protected void displayPlayerOptions(){
        //TODO
    }
    protected void performPlayerAction(Player p){
        //TODO
    }
    protected void performComputerPlayerAction(){
        //TODO
    }

}
