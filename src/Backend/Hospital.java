/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class Hospital implements Serializable {    
    //Variaveis de instancia
    private String cod_hosp;
    private String nome_hosp;
    private String localidade;
    private ListaEnfermarias lista_enfer;
    private ListaProfissionaisSaude lista_prof;
    private ListaEquipamentos lista_equi;
    private ListaPacientes lista_paciente;
    
    //Construtores
    public Hospital(String cod_hosp, String nome_hosp, String localidade) {
        this.cod_hosp = cod_hosp;
        this.nome_hosp = nome_hosp;
        this.localidade = localidade;
    }
    
    //Seletores
    public String getCodigoHosp() {
        return cod_hosp;
    }
    public String getNomeHosp() {
        return nome_hosp;
    }
    public String getLocalidadeHosp() {
        return localidade;
    }
    
    //Modificadores
    public void setCodigoHosp(String cod_hosp) {
        this.cod_hosp = cod_hosp;
    }
    public void setNomeHosp(String nome_hosp) {
        this.nome_hosp = nome_hosp;
    }
    public void setLocalidadeHosp(String localidade) {
        this.localidade = localidade;
    }
    public void setEnfermarias(ListaEnfermarias lista_enfer) {
        this.lista_enfer = lista_enfer;
    }
    public void setProfissionais(ListaProfissionaisSaude lista_prof) {
        this.lista_prof = lista_prof;
    }
    public void setEquipamentos(ListaEquipamentos lista_equi) {
        this.lista_equi = lista_equi;
    }
    public void setPacientes(ListaPacientes lista_paciente) {
        this.lista_paciente = lista_paciente;
    }
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_hosp = "- Hospital -"+"\nCódigo: "+cod_hosp+"\nNome: "+nome_hosp+"\nLocalidade"+localidade+"\nLista de enfermeiros: "+lista_enfer+"\nLista de equipamento: "+lista_equi+
                "\nLista de pacientes: "+lista_paciente+"\nLista de utilizadores: "+lista_prof;
        return str_hosp;
    }
    /*@Override
    public String toString() {
        return "Hospital{" + "cod_hosp=" + cod_hosp + ", nome_hosp=" + nome_hosp + ", localidade=" + localidade + ", lista_enfer=" + lista_enfer + ", lista_user=" + lista_user + ", lista_equi=" + lista_equi + ", lista_paciente=" + lista_paciente + '}';
    }*/
}