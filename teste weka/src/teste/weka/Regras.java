package teste.weka;

import java.io.IOException;
import javax.swing.JOptionPane;
import weka.associations.AssociationRules;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Thiago Henrique Viotto
 * @date 02/04/2018
 */
public class Regras {
    Instances novas;
    DataSource ds;
    Instances ins;
    weka.associations.Apriori ap;
    String diretorio;
    AssociationRules regras;

    public Instances getIns() {
        return ins;
    }

    public void setIns(Instances ins) {
        this.ins = ins;
    }

    public AssociationRules getRegras() {
        return regras;
    }

    public void setRegras(AssociationRules regras) {
        this.regras = regras;
    }

    public Regras() {
    }

    public Instances getNovas() {
        return novas;
    }

    public void setNovas(Instances novas) {
        this.novas = novas;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }
    
    //retornar destino da base de dados
    public DataSource getDs() {
        return ds;
    }

    //carregar base de dados
    public void setDs(DataSource ds) {
    }
    
    public Instances getInstancias() {
        return novas;
    }

    //carregar instancias
    public void setIns(Regras regras) {
        try {
            //ds = new ConverterUtils.DataSource("C:\\Users\\thiag\\Desktop\\Iniciação científica\\Bases\\solar-region-1997-2016-classificado.arff"); //caminho da base de dados
            ds = new ConverterUtils.DataSource(diretorio); //caminho da base de dados
            ins = ds.getDataSet();  //carregar instancias
            regras.setDs(ds);
            novas = ins;
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                JOptionPane.showMessageDialog(null, "Impossível constuir as instâncias! Verifique se os campos foram preenchidos", "Erro ao constuir instâncias", 0);
                System.out.println(e);
            } else if (e instanceof NumberFormatException) {
                JOptionPane.showMessageDialog(null, "Você não selecionou um arquivo!", "Erro abrir arquivo", 0);
            } else if (e instanceof IOException) {
                JOptionPane.showMessageDialog(null, "Formato do arquivo inválido! Verifique a documentação do weka!", "Erro abrir arquivo", 0);
            } else if (e instanceof NullPointerException) {
                JOptionPane.showMessageDialog(null, "Você não selecionou um arquivo!", "Erro abrir arquivo", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Impossível constuir as instâncias! Verifique se os campos foram preenchidos", "Erro ao constuir instâncias", 0);
                System.out.println(e);
            }
        }
    }

    //retornar regras
    public weka.associations.Apriori getAp() {
        return ap;
    }

    //construir regras
    public void setAp(weka.associations.Apriori ap) {
        this.ap = ap;
    }
}
