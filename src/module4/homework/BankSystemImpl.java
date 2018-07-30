package module4.homework;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        int limit = user.getBank().getLimitOfWithdrawal();
        double commission = user.getBank().getCommission(amount);
        double totalAmount = amount + commission;
        if (amount > limit) {
            System.out.println("You try to withdraw " + amount + ", but withdraw limit is "
                    + limit + ". Try smaller withdraw.");
        } else if (totalAmount > user.getBalance()) {
            System.out.println("Your balance is smaller that you try to withdraw.");
        } else {
            user.setBalance(user.getBalance() - totalAmount);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("You try to fund " + amount + ", but limit of funding is "
                    + user.getBank().getLimitOfFunding() + ". Try smaller fund.");
        } else {
            user.setBalance(user.getBalance() + amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() >= amount + fromUser.getBank().getCommission(amount)) {
            fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        } else {
            System.out.println("The balance of user " + fromUser.getName() + " is smaller that you try to transfer.");
        }
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }
}
