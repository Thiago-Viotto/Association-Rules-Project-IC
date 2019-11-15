package teste.weka;

import java.util.LinkedHashSet;
import java.util.Set;
import weka.core.Instances;

/**
 *
 * @author Thiago Henrique Viotto
 * @date 25/06/2018
 */
public class Atributo {

    private Set lista = new LinkedHashSet();

    //preenche a String lista com os nomes dos atributos
    public Set preencherString(Instances ins) {
        Instances nova = ins;
        int numAtributo = nova.numAttributes();
        for (int i = 0; i < numAtributo; i++) {
            lista.add(nova.attribute(i).name());
        }
        return lista;        
    }

    //apaga a String lista com os nomes dos atributos
    public Set apagarString(Instances ins) {
        Instances nova = ins;
        int numAtributo = nova.numAttributes();
        for (int i = 0; i < numAtributo; i++) {
            lista.removeAll(lista);
        }
        return lista;
    }

    public Set getLista() {
        return lista;
    }

    public void setLista(Set lista) {
        this.lista = lista;
    }

}
