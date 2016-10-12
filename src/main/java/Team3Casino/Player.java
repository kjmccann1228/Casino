package Team3Casino;

/*** Created by zaclee on 10/12/16. ***/

public class Player {

    private double balance;
    private String userName;
    private String passWord;
    private int userId; //Maybe change this to int??

    public Player(int userId, String userName, String passWord) {
        this.userName = userName;
        this.userId = userId;
        this.passWord = passWord;

    }

    //I created methods for all getters / setters... can delete the ones we dont want to use...

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getUserID() { return userId; }


}
