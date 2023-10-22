
import java.util.ArrayList;
import java.security.SecureRandom;
public class Atm implements Runnable  {
    private final static SecureRandom generator = new SecureRandom();
    private final int sleepTime; // random sleep time for thread
    private  boolean deposit; // name of task

    // constructor
    public Atm(Account a,boolean deposit , int amount)
    {
        this.deposit = deposit;

        if (this.deposit){
            a.deposit(amount);

        }
        else
        {
            a.withdraw(amount);
        }
        // pick random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000); // milliseconds

    }

    @Override
    public void run() {







    }
}
