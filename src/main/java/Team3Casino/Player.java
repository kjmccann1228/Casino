package Team3Casino;

/*** Created by zaclee on 10/12/16. ***/

public class Player {

    private double balance;
    private String userName;
    private String passWord;
    private String userID; //Maybe change this to int??

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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
