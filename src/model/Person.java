package model;

public class Person {

    private Wallet wallet;

    public Person() {
    }

    public Person(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
  
    public void payMoney(int totalBills) {
        System.out.println("This is total of bill: " + totalBills);
        if (wallet.getMoney() >= totalBills) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }
    }
    
    
}
