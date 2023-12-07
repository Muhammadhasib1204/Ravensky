/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author lilis
 */
public class DriverClass {
    public static void main(String[]args){
       Manusia manusia = new Manusia();
       LatihanApel Apel = new Apel();
       LatihanApel Pisang = new Pisang();
       manusia.makanbuah(Apel);
       manusia.makanbuah(Pisang);
    }
}
