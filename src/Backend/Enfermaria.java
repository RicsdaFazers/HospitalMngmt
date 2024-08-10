/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;

public class Enfermaria implements Serializable {    
    //Variaveis de instancia
    private String cod_enfer;
    private String tipo_enfer;
    private int[] num_camas;
    
    //Construtores
    public Enfermaria(String cod_enfer, String tipo_enfer, int[] num_camas) {
        this.cod_enfer = cod_enfer;
        this.tipo_enfer = tipo_enfer;
        this.num_camas = num_camas;
    }
    
    //Seletores
    public String getCodigoEnfer() {
        return cod_enfer;
    }
    public String getTipoEnfer() {
        return tipo_enfer;
    }
    public int[] getNum_camas() {
        return num_camas;
    }
    
    //Modificadores
    public void setCodigoEnfer(String cod_enfer) {
        this.cod_enfer = cod_enfer;
    }
    public void setTipoEnfer(String tipo_enfer) {
        this.tipo_enfer = tipo_enfer;
    }
    public void setNum_camas(int[] num_camas) {
        this.num_camas = num_camas;
    }
    
    //Metodos
    
    //toString
    @Override
    public String toString() {
        String str_enfer = "- Enfermaria -"+"\nCódigo: "+cod_enfer+"\nTipo"+tipo_enfer
                +"\nNúmero de camas: "+num_camas;
        return str_enfer;
    }
    /*@Override
    public String toString() {
        return "Enfermaria{" + "cod_enfer=" + cod_enfer + ", tipo_enfer=" + tipo_enfer + ", num_camas=" + num_camas + ", estado_ocupacao_enfer=" + estado_ocupacao_enfer + '}';
    }*/
}