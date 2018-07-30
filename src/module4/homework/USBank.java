package module4.homework;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) {
            return 1000;
        }
        if (this.getCurrency() == Currency.EUR) {
            return 1200;
        } else {
            return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) {
            return 10000;
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
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            return (summ < 1000 ? 5 : 7);
        }
        if (this.getCurrency() == Currency.EUR) {
            return (summ < 1000 ? 6 : 8);
        } else {
            return 0;
        }
    }
}
