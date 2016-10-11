package Team3Casino;

/**
 * Created by evanhitchings on 10/11/16.
 */
public class Bet {
    private int amount;
    private double odds;

    public Bet(int amount){
        this.amount = amount;
        this.odds = 2.0;
    }

    public Bet(int amount, double odds){
        this.amount = amount;
        this.odds = odds;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }

    @Override
    public String toString(){

        //fairly certain this will return the odds with just one decimal point
        return String.format("$%d at %.1f to one odds", this.amount, this.odds);
    }
}
