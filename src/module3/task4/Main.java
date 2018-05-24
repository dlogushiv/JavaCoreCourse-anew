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

public class Main {
    public static void main(String[] args) {

        User Jack = new User("Jack", 10000, 6, "Oracle", 2000, "USD");

        Jack.paySalary();
        Jack.withdraw(500);
        Jack.withdraw(2000);
        System.out.println(Jack.getName() + " company name length: " + Jack.companyNameLenght());
        Jack.monthIncreaser(5);
        System.out.println(Jack.getMonthsOfEmployment());
    }
}
