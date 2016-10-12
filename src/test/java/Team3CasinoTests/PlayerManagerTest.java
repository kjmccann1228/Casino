package Team3CasinoTests;

import Team3Casino.PlayerManager;
import Team3Casino.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/12/16.
 */
public class PlayerManagerTest {

    @Test
    public void createPlayerTest() {
        PlayerManager playerManager = new PlayerManager();
        playerManager.createPlayer("Devon", "pizza");
        int expected = 1;
        int actual = playerManager.playersinCasino.size();
        Assert.assertEquals("Arraysize should be 1",expected, actual);
    }

    @Test
    public void getPlayerByIdTest() {
        PlayerManager playerManager = new PlayerManager();
        Player expected = playerManager.createPlayer("Devon", "pizza");
        Player actual = playerManager.getPlayerById(1,"pizza");
        Assert.assertEquals("Player should be the same", expected, actual);

    }
}
