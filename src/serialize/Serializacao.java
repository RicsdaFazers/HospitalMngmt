package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Backend.Sistema;

public class Serializacao {
    //Variveis de instancia
    private final File ficheiro;
    
    //Construtor
    public Serializacao(String ficheiro) {
        this.ficheiro = new File(ficheiro);
    }
    
    //Seletores
    public File getFicheiro() {
        return ficheiro;
    }
    
    //Metodos
    //Abrir o ficheiro
    public Sistema abrir() {
        try (FileInputStream fileInput = new FileInputStream(ficheiro);
             ObjectInputStream input = new ObjectInputStream(fileInput)) {
            Sistema sis = (Sistema) input.readObject();
            return sis;
        }
        catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(String.format("Erro ao abrir o ficheiro", ex.getLocalizedMessage()), ex); 
        }
    }
    //Salvar ficheiro
    public void salvar(Sistema sis) {
        try (FileOutputStream fileOutput = new FileOutputStream(ficheiro);
             ObjectOutputStream output = new ObjectOutputStream(fileOutput)) {
            try {
                output.writeObject(sis);
            }
            catch (IOException ex) {
                throw new RuntimeException(String.format("Erro ao salvar o ficheiro", ex.getLocalizedMessage()), ex);
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(String.format("Erro ao salvar o ficheiro", ex.getLocalizedMessage()), ex);
        }
    }
}