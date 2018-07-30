package module4.homework;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency,
                     int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) {
            return 100;
        }
        if (this.getCurrency() == Currency.EUR) {
            return 150;
        } else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency()== Currency.USD){
            return 10000;
        }
        if (this.getCurrency() == Currency.EUR) {
            return 5000;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) {
            return 1;
        }
        if (this.getCurrency() == Currency.EUR) {
            return 0;
        } else {
            return 0;
        }
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            return (summ < 1000 ? 3 : 5);
        }
        if (this.getCurrency() == Currency.EUR) {
            return (summ < 1000 ? 10 : 11);
        } else {
            return 0;
        }
    }
}
