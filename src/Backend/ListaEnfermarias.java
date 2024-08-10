/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEnfermarias implements Serializable {    
    //Variaveis de instancia
    private final ArrayList<Enfermaria> lista_enfer;
    
    //Construtor
    public void ListaEnfermarias() {}
    
    public ListaEnfermarias() {
        lista_enfer = new ArrayList<>();
    }
    
    //Exceptions
    public class EnfermariaDuplicadaException extends Exception {
        public EnfermariaDuplicadaException() { }
        public EnfermariaDuplicadaException(String message) {
            super(message);
        }
    }
    
    //Metodos
    //Devolver a lista de enfermarias
    public ArrayList<Enfermaria> getListaEnfer() {
            return lista_enfer;
    }
    //Adicionar
    public void adicionarEnfermarias(Enfermaria cod_enfer) throws Exception {
        if (existeEnfermarias(cod_enfer.getCodigoEnfer())) {
            throw new EnfermariaDuplicadaException("Enfermaria ja existe!");
        }
        else {
            lista_enfer.add(cod_enfer);
        }
    }
    //Verificar se existe uma dada Enfermaria
    public boolean existeEnfermarias(String cod_enfer) {
        for(Enfermaria enfer : lista_enfer) {
            if(enfer.getCodigoEnfer().equals(cod_enfer)){
                lista_enfer.remove(enfer);
                return true;
            }
        }
        return false;
    }
    //Remover
    public void removerEnfermarias(String cod_enfer) {
        for(Enfermaria enfer : lista_enfer) {
            if(enfer.getCodigoEnfer().equals(cod_enfer)){
                lista_enfer.remove(enfer);
            }
        }
    }
}
