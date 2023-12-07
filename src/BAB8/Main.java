/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

/**
 *
 * @author lilis
 */
public class Main {
    public static void main(String[] args) {
        Payment pay = new Payment(750000);
        pay.titlePurchase(1);
        System.out.println("Credit Balance = " + pay.creditbalance);
        System.out.println("Emoney Balance = "+ pay.emoneybalance);
        System.out.println("Cash Balance = " + pay.cashbalance);
        System.out.println("============================");
        System.out.println("Total Payment = "+pay.total);
        System.out.println("============================");
        System.out.println("Payment with credit, ending balance "+ pay.creditproses());
        System.out.println("Payment with emoney, ending balance "+ pay.emoney());
        System.out.println("Payment with cash, ending balance "+ pay.cashproses());
        
    }
}
