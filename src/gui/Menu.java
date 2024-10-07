/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Management;
import model.Person;
import model.Wallet;

public class Menu {

    public void display() {
        Management m = new Management();
        Wallet w = new Wallet();
        Person p = new Person(w);
        System.out.println("======= Shopping program ==========");
        int[] a = m.inputBill();
        w.inputWallet();
        int totalBill = m.totalBills(a);
        p.payMoney(totalBill);
    }
}
