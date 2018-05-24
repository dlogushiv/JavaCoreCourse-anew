package module3.task4;

// Create User class with the following fields:
// String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.
// Create getters and setters and constructor with all fileds.
//        Write methods:
// void paySalary() -  that add salary to the balance of the user
// withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000
// and 10% commision in other cases
// companyNameLenght - calculates name of the company name
// monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth

public class User {
    private String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

    void paySalary() {
        this.balance += salary;
        System.out.println("Salary was pay! Current balance: " + this.getBalance());
    }

    void withdraw(int summ) {
        int bal = this.getBalance();
        int commission;
        System.out.println("Balance before withdraw: " + bal + ".");
        if (summ < 1000) {
            commission = (int) Math.ceil(summ * 0.05);
        } else {
            commission = (int) Math.ceil(summ * 0.1);
        }
        System.out.println("Commission: " + commission + ". Withdraw: " + summ + ".");
        if (bal - commission - summ >= 0) {
            bal = bal - commission - summ;
            System.out.println("Balance after withdraw: " + bal + ".");
            this.setBalance(bal);
        } else
            System.out.println("Can not be withdrawn!");
    }

    int companyNameLenght() {
        return this.getCompanyName().length();
    }

    void monthIncreaser(int addMonth) {
        this.setMonthsOfEmployment(this.getMonthsOfEmployment() + addMonth);
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
