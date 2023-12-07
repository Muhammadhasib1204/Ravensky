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
public class ThrowException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlkaki;
        System.out.println("Berapa Jumlah Kaki Kerbau");
        try {
            System.out.println("Jumlah Kaki : ");
            jmlkaki = input.nextInt();
            if (jmlkaki != 4){
                throw new NullPointerException("Terjadi Kesalahan");
            } else {
                System.out.println("Benar Jumlah Kakinya 4");
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        
    }
}
