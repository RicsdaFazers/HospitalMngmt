/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class ListaUtilizadores implements Serializable {    
    //Variaveis de instancia
    private final Map<String, Utilizador> lista_util;
    
    //Construtor
    public void ListaUtilizadores() {}
    
    public ListaUtilizadores() {
        lista_util = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }    
    
    //Exceptions
    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() { }
        public UtilizadorNaoExistenteException(String message) {
            super(message);
        }        
    }
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() { }
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }
    }

    //Metodos
    //Devolver a lista de utilizadores
    public Map<String, Utilizador> getListaUtil() {
            return lista_util;
    }
    //Adicionar
    public void adicionarUtilizador(Utilizador username) throws Exception {
       if (existeUtilizador(username.getUsername())) {
           throw new UtilizadorDuplicadoException("Utilizador ja existe!");
       }
       else {
           lista_util.put(username.getUsername(), username);
       }
    }
    //Verificar se existe um dado utilizador
    public boolean existeUtilizador(String username) {
        return lista_util.containsKey(username);
    }
    //Remover
    public void removerUtilizador(String username) {
        lista_util.remove(username);
    }
    //Devolver um utilizador
    public Utilizador getUtilizador(String username) throws UtilizadorNaoExistenteException {
        if (lista_util.containsKey(username)){
            return lista_util.get(username);
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador '%s' já existe na lista");
        }
    }
}