public class Account {
    private String iban;
    private double balance;
    private Person owner;

    public Account(String iban, double balance, Person owner) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s",iban,balance,owner);
    }

    public String ownerBalanceToString(){
        return String.format("%s(%.2f)", owner.shortToString(),balance);
    }
}

