/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class Equipamento implements Serializable {   
    //Variaveis de instancia
    private String cod_equi;
    private String tipo;
    private String estado_ocupacao_equi;
    private Enfermaria enfer_onde_esta_equi;
    private Paciente paciente_associado;
    
    //Construtores
    public Equipamento(String cod_equi, String tipo) {
        this.cod_equi = cod_equi;
        this.tipo = tipo;
        this.estado_ocupacao_equi = null;
        this.enfer_onde_esta_equi = null;
        this.paciente_associado = null;
    }
    
    //Seletores
    public String getCodigoEqui() {
        return cod_equi;
    }
    public String getTipoEqui() {
        return tipo;
    }
    public String getEstadoOcupacaoEqui() {
        return estado_ocupacao_equi;
    }
    public Enfermaria getEnferOndeEstaEqui() {
        return enfer_onde_esta_equi;
    }
    public Paciente getPacienteAssociado() {
        return paciente_associado;
    }
    
    //Modificadores
    public void setCodigoEqui(String cod_equi) {
        this.cod_equi = cod_equi;
    }
    public void setTipoEqui(String tipo) {
        this.tipo = tipo;
    }
    public void setEstadoOcupacaoEqui(String estado_ocupacao_equi) {
        this.estado_ocupacao_equi = estado_ocupacao_equi;
    }
    public void setEnferOndeEstaEqui(Enfermaria enfer_onde_esta_equi) {
        this.enfer_onde_esta_equi = enfer_onde_esta_equi;
    }
    public void setPacienteAssociado(Paciente paciente_associado) {
        this.paciente_associado = paciente_associado;
    }
    
    //Metodos
 
    //toString
    @Override
    public String toString() {
        String str_equi = "- Equipamento -"+"\nCódigo: "+cod_equi+"\nTipo: "+tipo+"\nEstado de ocupação do equipamento: "+estado_ocupacao_equi
                +"\nLocalização do equipamento: "+enfer_onde_esta_equi+"\nPaciente associado: "+paciente_associado;
        return str_equi;
    }
    /*@Override
    public String toString() {
        return "Equipamento{" + "designacao=" + designacao + ", cod_equi=" + cod_equi + ", tipo=" + tipo + ", estado_ocupacao_equi=" + estado_ocupacao_equi + ", enfer_onde_esta_equi=" + enfer_onde_esta_equi + ", paciente_associado=" + paciente_associado + '}';
    }*/
}