/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class ListaHospitais implements Serializable {    
    //Variaveis de instancia
    private final Map<String, Hospital> lista_hosp;
    
    //Construtor
    public void ListaHospitais() {}
    
    public ListaHospitais() {
        lista_hosp = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }    
    
    //Exceptions
    public class HospitalDuplicadoException extends Exception {
        public HospitalDuplicadoException() { }
        public HospitalDuplicadoException(String message) {
            super(message);
        }
    }
    
    //Metodos
    //Devolver a lista de hospitais
    public Map<String, Hospital> getListaHosp() {
            return lista_hosp;
    }
    //Adicionar
    public void adicionarHospitais(Hospital cod_hosp) throws Exception {
       if (existeHospitais(cod_hosp.getCodigoHosp())) {
           throw new HospitalDuplicadoException("Hospital ja existe!");
       }
       else {
           lista_hosp.put(cod_hosp.getCodigoHosp(), cod_hosp);
       }
    }
    //Verificar se existe um dado hospital
    public boolean existeHospitais(String cod_hosp) {
        return lista_hosp.containsKey(cod_hosp);
    }  
    //Remover
    public void removerHospitais(String cod_hosp) {
        lista_hosp.remove(cod_hosp);
    }
}
