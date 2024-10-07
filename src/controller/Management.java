package controller;

public class Management {

    private Validation v = new Validation();

    public int[] inputBill() {
        int n = v.getInt("input number of bill:", 0, Integer.MAX_VALUE);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = v.getInt("input value of bill " + (i + 1) + ":", 0, Integer.MAX_VALUE);
        }
        return a;
    }

    public int totalBills(int[] bills) {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            sum += bills[i];
        }
        return sum;
    }
}
