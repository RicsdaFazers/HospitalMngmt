/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPacientes implements Serializable {    
    //Variaveis de instancia
    private final ArrayList<Paciente> lista_paciente;
    
    //Construtor
    public void ListaPacientes() {}
    
    public ListaPacientes() {
        lista_paciente = new ArrayList<>();
    }
    
    //Exceptions
    public class PacienteDuplicadoException extends Exception {
        public PacienteDuplicadoException() { }
        public PacienteDuplicadoException(String message) {
            super(message);
        }
    }
    
    //Metodos
    //Devolver a lista de utilizadores
    public ArrayList<Paciente> getListaPaciente() {
            return lista_paciente;
    }
    //Adicionar
    public void adicionarPacientes(Paciente cod_paciente) throws Exception {
        if (existePacientes(cod_paciente.getCodigoPaciente())) {
            throw new PacienteDuplicadoException("Paciente ja existe!");
        }
        else {
            lista_paciente.add(cod_paciente);
        }
    }
    //Verificar se existe um dado paciente
    public boolean existePacientes(String cod_paciente) {
        for(Paciente pac : lista_paciente) {
            if(pac.getCodigoPaciente().equals(cod_paciente)) {
                lista_paciente.remove(pac);
                return true;
            }
        }
        return false;
    }
    //Remover
    public void removerPacientes(String cod_paciente) {
        for(Paciente pac : lista_paciente) {
            if(pac.getCodigoPaciente().equals(cod_paciente)) {
                lista_paciente.remove(pac);
            }
        }
    }
}