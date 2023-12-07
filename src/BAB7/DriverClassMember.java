/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author lilis
 */
public class DriverClassMember {
  public static void main(String[] args) {
        
        Pembayaran payment;
        payment = new P0001();

        
        payment.tampilkanmember();
       
        if (payment instanceof P0001) {
            P0001 p0001 = (P0001) payment; 

         
            System.out.println("Jenis Member: " + p0001.member(p0001));
            System.out.println("Total Pembayaran: " + p0001.hitpembayaran(500000));
            System.out.println("Sisa Saldo: " + p0001.potSaldo());
        }
    }   
}

