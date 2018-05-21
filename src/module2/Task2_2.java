package module2;

/*
Write method which withdraws money from account and takes commission 5% of the transaction.
Print OK + commission + balance after withdrawal. Print NO is withdrawal is not possible.

Example
Input
balance = 100
withdrawal = 10
Output
OK 0.5 89.5

Input
balance = 100
withdrawal = 99
Output
NO
 */
public class Task2_2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 102;
        getMoney(balance, withdrawal);
    }

    static void getMoney(double balance, double withdrawal) {
        if (withdrawal >= 0) {
            double commission = withdrawal * 0.05;
            if (balance - (withdrawal + commission) < 0)
                System.out.println("NO");
            else
                System.out.println("OK " + commission + " " + (balance - (withdrawal + commission)));
        } else
            System.out.println("ERROR");
    }

}
