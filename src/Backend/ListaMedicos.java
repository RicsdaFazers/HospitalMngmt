package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

public class ListaMedicos implements Serializable {
    //Variaveis de instancia
    private TreeMap<String, Medico> lista;
    private ArrayList<Medico> listaM;

    //Construtor
    public ListaMedicos() {
        lista = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); 
        listaM = new ArrayList<Medico>();        
    }
    
    //Exceptions
    public class MedicoNaoExistenteException extends Exception {
        public MedicoNaoExistenteException() { }
        public MedicoNaoExistenteException(String message) {
            super(message);
        }        
    }
    
    public class MedicoDuplicadoException extends Exception {
        public MedicoDuplicadoException() { }
        public MedicoDuplicadoException(String message) {
            super(message);
        }        
    }
    
    //Seletores
    public ArrayList<Medico> getListaM() {
        return listaM;
    }
    public Medico getMedico(String codigo) throws MedicoNaoExistenteException {
        if (lista.containsKey(codigo)){
            return lista.get(codigo);
        }else{
            throw new MedicoNaoExistenteException("O hospital '%s' já existe na lista");
        }
    }
    
    //Modificadores
    public void setListaM(ArrayList<Medico> listaM) {
        this.listaM = listaM;
    }
    
    //Metodos
    //Adicionar
    public void adicionar(Medico medico) throws MedicoDuplicadoException {
        if (medico == null) {
            throw new NullPointerException("O parâmetro 'medico' não pode ser um valor nulo");
        }        
        
        if (!lista.containsKey(medico.getCodigo())) {
            lista.put(medico.getCodigo(), medico);
            listaM.add(medico);
        }else{
            throw new MedicoDuplicadoException(String.format("O medico '%s' já existe na coleção", medico.getCodigo()));
        }
        
    }        
    //Existe
    public boolean existe(String codigo) {
        return lista.containsKey(codigo);
    }
    //Remover
    public void removerMedico(String codigo) {
        lista.remove(codigo);
    }   
    public int size() {
        return lista.size();
    }
    public ArrayList<Medico> todos() {
        return new ArrayList<>(lista.values());
    }  
}