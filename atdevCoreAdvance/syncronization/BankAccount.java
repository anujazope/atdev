package syncronization;

class Bank 
{
	 
   
    static int total = 1000;
 
    
    static synchronized void Transfer(int actno,String name,
                                       int transferamt)
    {
        if (total >= transferamt)
        {
            System.out.println(name + " transferamt "
                               + transferamt);
            total = total - transferamt;
            System.out.println("Balance after Transfer: "
                               + total);
            /* Making the thread sleep for 1 second after
                 each Transfer.*/
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
 
        // If the money requested for Transfer is greater
        // than the balance then deny transaction
        else
        {
            System.out.println(name
                               + " you can not TransferTransfer "
                               +transferamt);
            System.out.println("your balance is: " + total);
 
            try 
            {
 
               
                Thread.sleep(1000);
            }
 
           
            catch (InterruptedException e)
            {
 
                
                e.printStackTrace();
            }
        }
    }
 
    
    static synchronized void deposit(int actno,String name,
                                     int deposit)
    {
        System.out.println("\nAccount number is " +actno+"\n" +name + " deposited " + deposit );
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
 
        
        try {
 
           
            Thread.sleep(1000);
        }
 
        
        catch (InterruptedException e) {
 
            e.printStackTrace();
        }
    }
}
 

class ThreadTransfer extends Thread 
{
 
    // Attributes of this class
    Bank object;
    int actno;
    String name;
    int rupees ;
 
    // Constructor of this class
    ThreadTransfer(Bank ob,int actno, String name, int money)
    {
        // This keyword refers to parent class
        this.object = ob;
        this.actno=actno;
        this.name = name;
        this.rupees = money;
    }
 
    // run() method for the thread
    public void run() 
    { 
    	object.Transfer(actno,name, rupees); 
    }
}
 
// Deposit method is called from ThreadDeposit class using
// the object of Bank class passed from the main method*/
 
// Class 2
// Helper class extending Thread class
class ThreadDeposit extends Thread {
 
    Bank object;
    int actno;
    String name;
    int rupees;
 
    ThreadDeposit(Bank ob,int actno, String name, int money)
    {
        this.object = ob;
        this.actno=actno;
        this.name = name;
        this.rupees = money;
    }
 
    public void run() 
    { 
    	object.deposit(actno,name, rupees);
    }
}
 
// Class 3
// Main class
class BankAccount {
 
    
    public static void main(String[] args)
    {
       
        Bank obj = new Bank();
 
        // Creating threads
        ThreadDeposit t1
            = new ThreadDeposit(obj,123, "jack", 200);
        
        ThreadDeposit t2
            = new ThreadDeposit(obj, 123,"jill", 200);
       
        //ThreadTransfer t3 = new ThreadTransfer(obj, "jill", 100);
 
        // When a program calls the start() method, a new
        // thread is created and then the run() method is
        // executed
        t1.start();
        t2.start();
      // t3.start();
    }
}