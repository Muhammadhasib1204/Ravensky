/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author lilis
 */
public class P0001 extends Pembayaran {
  public String name, alamat;
    public int saldo;
    public String kode;
    public double diskon, bayar, total;

    public P0001() {
        this.name = "Firman Frezy Pradana";
        this.kode = "P0001";
        this.saldo = 3000000;
        this.alamat = "Malang, jl.singosari gang singa no 3";
    }

    @Override
    double cekkode(String input) {
        if (input.compareTo(kode) == 0) {
            diskon = 0.3;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    @Override
    double hitpembayaran(double bayar) {
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo() {
        return this.saldo - total;
    }

    @Override
    void tampilkanmember() {
        System.out.println("Member P0001 dengan diskon 30%");
    }

    
}

