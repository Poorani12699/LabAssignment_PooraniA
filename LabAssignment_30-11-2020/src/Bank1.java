class Person
{
    String name;
    float age;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public float getAge()
    {
        return this.age;
    }
}

class Account extends Person
{
    static int accSeries = 1;
    long accNum;
    double balance;
    Person accHolder = new Person();

    public void setAccNum(long accNum)
    {
        this.accNum = accNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {

    }

    public double getBalance()
    {
        return this.balance;
    }

    public long getAccNum() {
        return this.accNum;
    }

    public Person getAccHolder() {
        return this.accHolder;
    }
    public String getName()
    {
    	return this.accHolder.name;
    }
}
class SavingAccount extends Account {
    final int minimumBalce = 500;

    SavingAccount(String name, double balance) {
        accHolder.name = name;
        this.balance = balance;
        this.accNum = Account.accSeries++;
    }

    public void withdraw(double balance) {
        if (this.balance - balance < minimumBalce) {
            this.balance-=balance;
        }
    }
}
class CurrentAccount extends Account {
    final long overallDraftLimit = 50000;
    static long amountWithDrawn = 0;

    CurrentAccount(String name, double balance) {
        accHolder.name = name;
        this.balance = balance;
        this.accNum = Account.accSeries++;
    }

    public boolean checkOverallDraftLimit() {
        if (amountWithDrawn < overallDraftLimit)
            return true;
        else
            return false;
    }

    public void withdraw(double balance) {
        if (checkOverallDraftLimit()) {
            this.balance-=balance;
            amountWithDrawn += balance;
        }
    }
}

class Bank1
{
    public static void main(String[] args) {
        SavingAccount acc1 = new SavingAccount("smith",2000);
        CurrentAccount acc2 = new CurrentAccount("Kathy",3000);
        acc1.deposit(2000);
        acc2.deposit(2000);
        acc2.withdraw(2000);
        System.out.println("Account 1 Details:");
        System.out.println("Name "+acc1.getName());
        System.out.println("Account No "+acc1.getAccNum());
        System.out.println("Balance :"+acc1.getBalance());
        System.out.println("Account 2 Details:");
        System.out.println("Name "+acc2.getName());
        System.out.println("Account No "+acc2.getAccNum());
        System.out.println("Balance :"+acc2.getBalance());
    }
}