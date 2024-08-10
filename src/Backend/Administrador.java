/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class Administrador extends Utilizador implements Serializable {    
    //Variaveis de instancia
    
    //Construtores
    public Administrador(String username, String password) {
        super(username, password);
    }
    
    //Seletores
  
    //Modificadores
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_admin = "- Administrador -" + "\n" +super.toString();
        return str_admin;
    }
}