/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class ProfissionalSaude extends Utilizador implements Serializable {   
    //Variaveis de instancia
    private String cod_prof;
    private String nome_prof;
    private Enfermaria enfer_onde_trabalha; 
    
    //Construtores
    public ProfissionalSaude(String username, String password, String cod_prof, String nome_prof, Enfermaria enfer_onde_trabalha) {
        super(username, password);
        this.cod_prof = cod_prof;
        this.nome_prof = nome_prof;
        this.enfer_onde_trabalha = enfer_onde_trabalha;
    }
    
    //Seletores
    public String getCodigoProf() {
        return cod_prof;
    }
    public String getNomeProf() {
        return nome_prof;
    }
    public Enfermaria getEnferTrabalhaProf() {
        return enfer_onde_trabalha;
    }
    
    //Modificadores
    public void setCodigoProf(String cod_prof) {
        this.cod_prof = cod_prof;
    }
    public void setNomeProf(String nome_prof) {
        this.nome_prof = nome_prof;
    }
    public void setEnferTrabalhaProf(Enfermaria enfer_onde_trabalha) {
        this.enfer_onde_trabalha = enfer_onde_trabalha;
    }
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_prof = "-- Profissionais de saúde --" + "\n" + super.toString() +
                "Código: " + cod_prof + "\nNome: " + nome_prof +
                "Enfermaria onde está a trabalhar: " + enfer_onde_trabalha;
        return str_prof;
    }
    /*@Override
    public String toString() {
        return "ProfissionalSaude{" + "cod_prof=" + cod_prof + ", nome_prof=" + nome_prof + ", enfer_onde_trabalha=" + enfer_onde_trabalha + '}';
    }*/
}