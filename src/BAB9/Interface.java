/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author lilis
 */
public class Interface {
    public static void main(String[] args) {
        try {
            int a,b,hasil;
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("======Program Pembagian=======");
            System.out.println("Masukkan angka 1 = ");
            a = Integer.parseInt(Keyboard.next());
            System.out.println("Masukkan angka 2 = ");
            b = Integer.parseInt(Keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
        }
        catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0!!","warning",2);
        }
        catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input yang anda inputkan harus angka bukan huruf!!","warning",2);
        }
        finally {
            System.out.println("Trima Kasih sudah jalanin program ini dan dia masi bersama orang lain");
        }
    }
}
