package module2;

/*
You need to write method which withdraw money of particular account owner if he/she can.
Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
Commission is 5% for all cases.

        Example
    Input
int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Ann
double withdrawal = 100;

    Output
Ann 100 145

    Input
int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 490;

    Output
Oww NO
 */
public class Task2_3 {
    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {
        String ownerName = "Oww";
        double withdrawal = 490;
        getMoneyByName(ownerName, withdrawal);

    }

    static void getMoneyByName(String ownerName, double withdrawal) {
        int nameIndex = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                nameIndex = i;
                break;
            }
        }
        if (nameIndex == -1) {
            System.out.println("Client " + ownerName + " not found.");
        } else {
            System.out.print(ownerName + " ");
            Task2_2.getMoney(balances[nameIndex], withdrawal);
        }
    }
}
