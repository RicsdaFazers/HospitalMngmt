/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;


import java.io.Serializable;

public class Utilizador implements Serializable {    
    //Variaveis de instancia
    private String username;
    private String password;
    
    //Construtores
    public Utilizador(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    //Seletores
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    //Modificadores
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_user = "Username: " +username+ "\nPassword: " +password;
        return str_user;
    }
    /*@Override
    public String toString() {
        return "Utilizador{" + "username=" + username + ", password=" + password + '}';
    }*/
}