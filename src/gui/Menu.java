/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Management;
import controller.Validation;
import model.Person;
import model.Wallet;

public class Menu {

    public void display() {
        Validation v = new Validation();
        Management m = new Management();
        System.out.println("======= Shopping program ==========");
        int amount = v.getInt("Input value of wallet:", 0, Integer.MAX_VALUE);
        Person p = new Person(amount);
        int[] a = m.inputBill();
        int totalBill = m.totalBills(a);
        p.payMoney(totalBill);
    }
}
