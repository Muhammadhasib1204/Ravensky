/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

/**
 *
 * @author lilis
 */
public class Login {
    private String Username,pass;
    public String nama;

    public Login() {
        this.nama = "Muhammad Hasib";
        this.Username = "Hasib";
        this.pass = "123";
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    boolean cekLogin(String enteredUsername, String enteredPassword) {
        // Use equalsIgnoreCase for case-insensitive comparison
        return Username.equalsIgnoreCase(enteredUsername) && pass.equals(enteredPassword);
    }  
}
