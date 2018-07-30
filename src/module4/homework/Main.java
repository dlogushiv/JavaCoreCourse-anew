package module4.homework;

public class Main {
    public static void main(String[] args) {
        USBank usBank = new USBank(1, "USA", Currency.USD, 100,
                2000, 10, 5000000);
        EUBank euBank = new EUBank(2, "France", Currency.EUR, 100,
                2500, 8, 6000000);
        ChinaBank chinaBank = new ChinaBank(3, "China", Currency.USD, 100,
                1500, 6, 10000000);
        BankSystemImpl bankSystem = new BankSystemImpl();
        User user1 = new User(1, "John", 0, 5, "Apple", 1000, usBank);
        User user2 = new User(2, "Ann", 0, 8, "Nike", 800, usBank);
        User user3 = new User(3, "Dan", 0, 10, "Google", 1500, euBank);
        User user4 = new User(4, "Peter", 0, 7, "Amazon", 1200, euBank);
        User user5 = new User(5, "Liza", 0, 4, "McDon", 400, chinaBank);
        User user6 = new User(6, "Oven", 0, 1, "Pepsi", 600, chinaBank);

        User[] users = {user1, user2, user3, user4, user5, user6};

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
            bankSystem.withdrawOfUser(users[i], 500);
            System.out.println(users[i]);
            bankSystem.paySalary(users[i]);
            System.out.println(users[i]);
            bankSystem.fundUser(users[i], 1000);
            if (i == users.length - 1) {
                bankSystem.transferMoney(users[i], users[1], 2000);
            } else {
                bankSystem.transferMoney(users[i], users[i + 1], 2000);
            }
            System.out.println(users[i]+"\n");
        }
    }
}
