

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<Account> transactions = new ArrayList<Account>();
        transactions.add(new Account(1,5000));
        transactions.add(new Account(2,15000));
        transactions.add(new Account(3,125000));

        // create and name each runnable
        Atm task1 = new Atm(transactions.get(0),false,50);
        Atm task2 = new Atm(transactions.get(1),true,500);
        Atm task3 = new Atm(transactions.get(2),false,150);

        System.out.println("Starting Executor");

        // create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // start the three PrintTasks
        executorService.execute(task1); // start task1
        executorService.execute(task2); // start task2
        executorService.execute(task3); // start task3

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}