/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Paciente implements Serializable {    
    //Variaveis de instancia
    private String cod_paciente;
    private String nome_paciente;
    private String localidade;
    private Enfermaria enfer_internado;
    private int[] num_cama;
    private String gravidade;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    
    //Construtores
    public Paciente(String cod_paciente, String nome_paciente, String localidade, LocalDateTime entrada) {
        this.cod_paciente = cod_paciente;
        this.nome_paciente = nome_paciente;
        this.localidade = localidade;
        this.enfer_internado = null;
        this.num_cama = null;
        this.gravidade = null;
        this.entrada = entrada;
        this.saida = null;
    }
    
    //Seletores
    public String getCodigoPaciente() {
        return cod_paciente;
    }
    public String getNomePaciente() {
        return nome_paciente;
    }
    public String getLocalidadePaciente() {
        return localidade;
    }
    public Enfermaria getEnferInternadoPaciente() {
        return enfer_internado;
    }
    public int[] getNumeroCamaPaciente() {
        return num_cama;
    }
    public String getGravidadePaciente() {
        return gravidade;
    }
    public LocalDateTime getEntradaPaciente() {
        return entrada;
    }
    public LocalDateTime getSaidaPaciente() {
        return saida;  
    }
    
    //Modificadores
    public void setCodigoPaciente(String cod_paciente) {
        this.cod_paciente = cod_paciente;
    }
    public void setNomePaciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }
    public void setLocalidadePaciente(String localidade) {
        this.localidade = localidade;
    }
    public void setEnferInternadoPaciente(Enfermaria enfer_internado) {
        this.enfer_internado = enfer_internado;
    }
    public void setNumeroCamaPaciente(int[] num_cama) {
        this.num_cama = num_cama;
    }
    public void setGravidadePaciente(String gravidade) {
        this.gravidade = gravidade;
    }
    public void setEntradaPaciente(LocalDateTime entrada) {
        this.entrada = entrada;
    }
    public void setSaidaPaciente(LocalDateTime saida) {
        this.saida = saida;  
    }
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_paciente = "- Paciente -" + "\nCodigo: " +cod_paciente+
                "\nNome: " +nome_paciente+ "\nLocalidade: " +localidade+ 
                "\nEnfermaria onde esta internado: " +enfer_internado+ 
                "\nNumero da cama: " +num_cama+ "\nGravidade: " +gravidade+ 
                "\nEntrada: " +entrada+ "\nSaida: " +saida;
     return str_paciente;
    }
    /*@Override
    public String toString() {
        return "Paciente{" + "cod_paciente=" + cod_paciente + ", nome_paciente=" + nome_paciente + ", localidade=" + localidade + ", enfer_internado=" + enfer_internado + ", num_cama=" + num_cama + ", gravidade=" + gravidade + ", entrada=" + entrada + ", saida=" + saida + '}';
    }*/
}
