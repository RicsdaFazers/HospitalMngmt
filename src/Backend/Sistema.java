package Backend;

import java.io.Serializable;

public class Sistema implements Serializable {
    //Variaveis de instancia
    private final ListaUtilizadores utilizadores;
    private final ListaHospitais hospitais;
    private final ListaEnfermarias enfermarias;
    private final ListaProfissionaisSaude profissionais;
    private final ListaEquipamentos equipamentos;
    private final ListaPacientes pacientes;
    private final ListaMedicos medicos;
    private Utilizador utilizadorLigado;
    
    //Construtores
    public Sistema() {
        utilizadores = new ListaUtilizadores();
        hospitais = new ListaHospitais();
        enfermarias = new ListaEnfermarias();
        profissionais = new ListaProfissionaisSaude();
        equipamentos = new ListaEquipamentos();
        pacientes = new ListaPacientes();
        medicos = new ListaMedicos();
        utilizadorLigado = null;
    }
    
    //Seletores
    public ListaUtilizadores getUtilizadores() {
        return utilizadores;
    }
    public ListaHospitais getHospitais() {
        return hospitais;
    }
    public ListaEnfermarias getEnfermarias() {
        return enfermarias;
    }
    public ListaProfissionaisSaude getProfissionais() {
        return profissionais;
    }
    public ListaEquipamentos getEquipamentos() {
        return equipamentos;
    }
    public ListaPacientes getPacientes() {
        return pacientes;
    }
    public ListaMedicos getMedicos() {
        return medicos;
    }
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }
    
    //Metodos
    //Autenticar um utilizador
    public boolean autenticarUtilizador(String username, String password) {
        if(utilizadores.existeUtilizador(username)) {
            try {
                Utilizador user = utilizadores.getUtilizador(username);
                if(user.getPassword().equals(password)) {
                    utilizadorLigado = user;
                    return true;
                }
            }
            catch(Exception e) {}
        }
        return false;
    }
    //Iniciar o sistema
    public void iniciar() throws Exception {
        utilizadores.adicionarUtilizador(new Administrador("admin", "admin"));
        utilizadores.adicionarUtilizador(new Utilizador("user1", "user1"));
        utilizadores.adicionarUtilizador(new Utilizador("user2", "user2"));
    }
    //Encerrar o sistema
    public void encerrar() {
        System.exit(0);
    }
}
