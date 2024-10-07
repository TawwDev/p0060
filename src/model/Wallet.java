
package model;

import controller.Validation;

public class Wallet {
    private int money;

    public Wallet() {
    }

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    } 
    
    public void inputWallet(){
        Validation i = new Validation();
        int amount = i.getInt("input value of wallet:", 0, Integer.MAX_VALUE);
        setMoney(amount);
    }
    
}
