package frontend;

import serialize.Serializacao;
import Backend.Administrador;
import Backend.ListaUtilizadores;
import Backend.Sistema;
import Backend.Utilizador;

public class Piloto {
    public static void main(String[] args) throws ListaUtilizadores.UtilizadorDuplicadoException, Exception {
        Sistema sistema;        
        String ficheiroDados = String.format("%s\\utilizadores.data", System.getProperty("user.dir"));
        System.out.println(String.format("Ficheiro de dados: %s.", ficheiroDados));
        Serializacao bd = new Serializacao(ficheiroDados);        
        
        //Se o ficheiro de base de dados nao existir
        if (! bd.getFicheiro().exists()) {
            //Cria uma instancia do sistema
            sistema = new Sistema();      
            //Adiciona dois utilizadores para que possa ser possivel entrar no sistema
            sistema.getUtilizadores().adicionarUtilizador(new Administrador("admin", "admin"));
            sistema.getUtilizadores().adicionarUtilizador(new Utilizador("user1", "1234"));                    
        }else{
            sistema = bd.abrir();            
        }                 
        
        //Uma vez que a JanelaLogin é modal, este método irá bloquear até que a janela seja fechada.
        //A janela só fecha quando os dados de login são válidos.                
        JanelaLogin login = new JanelaLogin(sistema);               
        login.setVisible(true);
    
        if(sistema.getUtilizadorLigado() instanceof Administrador){
                JanelaPrincipalAdmin admin = new JanelaPrincipalAdmin(sistema, bd);
                admin.setVisible(true);       
        } else if(sistema.getUtilizadorLigado() instanceof Utilizador){
                JanelaPrincipal principal = new JanelaPrincipal(sistema, bd);
                principal.setVisible(true);  
        }
    }          
}
