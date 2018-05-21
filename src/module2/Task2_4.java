package module2;

/*You need to write method which will fund (пополнение) balance of particular user.
Print name + balance after funding

    Input
int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 100;

Output
Oww 600
 */
public class Task2_4 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) {
        String ownerName = "Oww";
        double withdrawal = 100;

        fund(ownerName, withdrawal);
    }

    static void fund(String ownerName, double withdrawal) {
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
            balances[nameIndex] += withdrawal;
            System.out.print(ownerName + " " + balances[nameIndex]);
        }
    }
}
