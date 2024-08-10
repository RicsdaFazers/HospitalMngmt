/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaProfissionaisSaude implements Serializable {   
    //Variaveis de instancia
    private final ArrayList<ProfissionalSaude> lista_prof;
    
    //Construtor
    public void ListaProfissionaisSaude() {}
    
    public ListaProfissionaisSaude() {
        lista_prof = new ArrayList<>();
    }
    
    //Exceptions
    public class ProfissionalSaudeDuplicadoException extends Exception {
        public ProfissionalSaudeDuplicadoException() { }
        public ProfissionalSaudeDuplicadoException(String message) {
            super(message);
        }
    }
    
    //Metodos
    //Devolver a lista de profissionais de saude
    public ArrayList<ProfissionalSaude> getListaProf() {
            return lista_prof;
    }
    //Adicionar
    public void adicionarProfissionaisSaude(ProfissionalSaude cod_prof) throws Exception {
        if (existeProfissionaisSaude(cod_prof.getCodigoProf())) {
            throw new ProfissionalSaudeDuplicadoException("Profissional de Saude ja existe!");
        }
        else {
            lista_prof.add(cod_prof);
        }
    }
    //Verificar se existe um dado profissional de saude
    public boolean existeProfissionaisSaude(String cod_prof) {
        for(ProfissionalSaude prof : lista_prof) {
            if(prof.getCodigoProf().equals(cod_prof)){
                lista_prof.remove(prof);
                return true;
            }
        }
        return false;
    }
    //Remove
    public void removerProfissionaisSaude(String cod_prof) {
        for(ProfissionalSaude prof : lista_prof) {
            if(prof.getCodigoProf().equals(cod_prof)){
                lista_prof.remove(prof);
            }
        }
    }
}
