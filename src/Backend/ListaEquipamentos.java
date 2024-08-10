/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEquipamentos implements Serializable {
    //Variaveis de instancia    
    private final ArrayList<Equipamento> lista_equi;
    
    //Construtor
    public void ListaEquipamentos() {}
    
    public ListaEquipamentos() {
        lista_equi = new ArrayList<>();
    }
    
    //Exceptions
    public class EquipamentoDuplicadoException extends Exception {
        public EquipamentoDuplicadoException() { }
        public EquipamentoDuplicadoException(String message) {
            super(message);
        }
    }
    
    //Metodos
    //Devolver a lista de equipamentos
    public ArrayList<Equipamento> getListaEqui() {
            return lista_equi;
    }
    //Adicionar
    public void adicionarEquipamentos(Equipamento cod_equi) throws Exception {
        if (existeEquipamentos(cod_equi.getCodigoEqui())) {
            throw new EquipamentoDuplicadoException("Equipamento ja existe!");
        }
        else {
            lista_equi.add(cod_equi);
        }
    }
    //Verificar se existe um dado equipamento
    public boolean existeEquipamentos(String cod_equi) {
        for(Equipamento equi : lista_equi) {
            if(equi.getCodigoEqui().equals(cod_equi)) {
                lista_equi.remove(equi);
                return true;
            }
        }
        return false;
    }
    //Remover
    public void removerEquipamentos(String cod_equi){
        for(Equipamento equi : lista_equi) {
            if(equi.getCodigoEqui().equals(cod_equi)) {
                lista_equi.remove(equi);
            }
        }
    }
}