/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author lilis
 */
public class ThrowsException {
   static void Error() throws ClassNotFoundException{
        System.out.println("Ada yang error ni! ");
        throw new ClassNotFoundException("Error Sudah Saya Tangkap");
   }
    public static void main(String[] args) {
        try {
            ThrowsException.Error();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
