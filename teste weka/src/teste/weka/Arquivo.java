package teste.weka;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Thiago Henrique Viotto
   @date   25/06/2018
 */
public class Arquivo {
    JFileChooser selecionador = new JFileChooser();

    public void setArq() {
        selecionador.setDialogTitle("Procurar arquivo");
        selecionador.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo", "csv", "arff", "xls", "xlsx");
        selecionador.setFileFilter(filter);
    }

    public JFileChooser getSelecionador() {
        return selecionador;
    }

    public void setSelecionador(JFileChooser selecionador) {
        this.selecionador = selecionador;
    }
    
   
}
