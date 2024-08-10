/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class ListaAdministrador implements Serializable {    
    //Variaveis de instancia
    private final Map<String, Utilizador> lista_admin;
    
    //Construtor
    public void ListaAdministrador() {}
    
    public ListaAdministrador() {
        lista_admin = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }    
    
    //Exceptions
    public class AdministradorNaoExistenteException extends Exception {
        public AdministradorNaoExistenteException() { }
        public AdministradorNaoExistenteException(String message) {
            super(message);
        }        
    }
    public class AdministradorDuplicadoException extends Exception {
        public AdministradorDuplicadoException() { }
        public AdministradorDuplicadoException(String message) {
            super(message);
        }
    }

    //Metodos
    //Devolver a lista de utilizadores
    public Map<String, Utilizador> getListaAdministrador() {
            return lista_admin;
    }
    //Adicionar
    public void adicionarAdministrador(Utilizador username) throws Exception {
       if (existeAdministrador(username.getUsername())) {
           throw new AdministradorDuplicadoException("Administrador ja existe!");
       }
       else {
           lista_admin.put(username.getUsername(), username);
       }
    }
    //Verificar se existe um dado utilizador
    public boolean existeAdministrador(String username) {
        return lista_admin.containsKey(username);
    }
    //Remover
    public void removerAdministrador(String username) {
        lista_admin.remove(username);
    }
    //Devolver um utilizador
    public Utilizador getAdministrador(String username) throws AdministradorNaoExistenteException {
        if (lista_admin.containsKey(username)){
            return lista_admin.get(username);
        }else{
            throw new AdministradorNaoExistenteException("O administrador '%s' já existe na lista");
        }
    }
}