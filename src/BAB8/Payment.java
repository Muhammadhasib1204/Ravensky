/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

/**
 *
 * @author lilis
 */
public class Payment extends Purchase implements Cash, Credit, Emoney {

    double total, creditbalance, emoneybalance, cashbalance;

    public Payment(double setTotal) {
        this.creditbalance = 1000000;
        this.emoneybalance = 500000;
        this.cashbalance = 1500000;
        this.total = setTotal;
    }

    @Override
    void titlePurchase(int nopurchase) {
        System.out.println("Pembelian ke - " + nopurchase);
    }

    @Override
    public double cashproses() {
        total = cashbalance - this.total;
        return total;
    }

    @Override
    public double creditproses() {
        total = creditbalance - this.total;
        return total;
    }

    @Override
    public double emoney() {
        total = emoneybalance - this.total;
        return total;
    }

}
