/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class Medico implements Serializable {   
    //Variaveis de instancia
    private String cod_med;
    private String nome_med;
    private String especialidade;
    private String enfermaria;
    
    //Construtores
    public Medico(String cod_med, String nome_med,String especialidade) {
        this.cod_med = cod_med;
        this.nome_med = nome_med;
        this.especialidade = especialidade;
        this.enfermaria = null;
    }
    
    //Seletores
    public String getCodigo() {
        return cod_med;
    }
    public String getNome() {
        return nome_med;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public String getEnfermaria() {
        return enfermaria;
    }
    
    //Modificadores
    public void setCodigo(String cod_med) {
        this.cod_med = cod_med;
    }
    public void setNome(String nome_med) {
        this.nome_med = nome_med;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }
    
    //Metodos 
    
    //toString

    @Override
    public String toString() {
        return "Medico{" + "cod_med=" + cod_med + ", nome_med=" + nome_med + ", especialidade=" + especialidade + ", enfermaria=" + enfermaria + '}';
    }
}