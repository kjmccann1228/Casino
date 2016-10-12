package Team3Casino;

import java.util.Scanner;

/**
 * Created by kenragonese on 10/11/16.
 */
public class Console implements Display{
    Scanner scanner = new Scanner(System.in);
    public String promptUserString() {
        return null; //TODO
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
    public int promptInt(String s){
        return Integer.valueOf(s);
    }
    public String promptString(String s){
        return s;
    }

}
