/*
 * Projeto Explosões solares - Iniciação científica
 */
package View;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import teste.weka.Arquivo;
import teste.weka.Atributo;
import teste.weka.Regras;
import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.associations.AssociationRules;
import weka.core.Instances;
import weka.core.SelectedTag;

/**
 *
 * @author thiago viotto 187583
 */
public class TelaAssociação extends javax.swing.JFrame {

    public TelaAssociação() {
        initComponents();
    }

    Atributo atr = new Atributo();
    Regras regras = new Regras();
    int auxQuantidadeCliqueBotaoAbrirArquivo = 1, valorIndiceAtributoSelecionado = 1, testeDeletarAtributo;
    DefaultListModel modelo = new DefaultListModel();
    DefaultComboBoxModel modeloCampoRegras = new DefaultComboBoxModel();

//apaga a JList com a String lista
    private void apagarListadosAtributos() {
        modelo.removeAllElements();
    }

//preenche a JList com a String lista
    private void preencherListadosAtributos() {
        listAtributos.setVisibleRowCount(20);
        listAtributos.setSelectionBackground(Color.yellow);
        listAtributos.setToolTipText("Lista de atributos");
        int i = 0;
        Iterator listasIterator = atr.getLista().iterator();
        while (listasIterator.hasNext()) {
            modelo.add(i, listasIterator.next());
            i++;
        }
        listAtributos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        cbxInstancias = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtNumRegras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSuporteMinimo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSuporteMáximo = new javax.swing.JTextField();
        txtMetricaMínima = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxMetrica = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAbrirArquivo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtConsequente = new javax.swing.JTextField();
        btnHelp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAtributos = new javax.swing.JList<>();
        btnRemoverAtributo = new javax.swing.JButton();
        txtStringSelecionada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnHelp2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotalRegras = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        txtNAtributos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        cbxInstancias.setColumns(20);
        cbxInstancias.setRows(5);
        jScrollPane1.setViewportView(cbxInstancias);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Número de regras");

        txtNumRegras.setText("20");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Suporte mínimo");

        txtSuporteMinimo.setText("0.1");

        btnCalcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular apriori");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Suporte máximo");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Métrica  mínima");

        txtSuporteMáximo.setText("1");

        txtMetricaMínima.setText("0.3");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de métrica");

        cbxMetrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confiança", "Lift" }));

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Tarefa de Associação - Apriori");

        btnAbrirArquivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAbrirArquivo.setText("Abrir arquivo");
        btnAbrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArquivoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Índice do consequente");

        txtConsequente.setText("-1");
        txtConsequente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsequenteActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(102, 255, 255));
        btnHelp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHelp.setText("?");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        listAtributos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAtributosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listAtributos);

        btnRemoverAtributo.setText("Remover atributo");
        btnRemoverAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAtributoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setText("-------------------------------------------------------- REGRAS ENCONTRADAS--------------------------------------------------------------");

        btnHelp2.setBackground(new java.awt.Color(102, 255, 255));
        btnHelp2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHelp2.setText("?");
        btnHelp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Escolher consequente?");

        buttonGroup1.add(radioSim);
        radioSim.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioSim.setText("Sim");

        buttonGroup1.add(radioNao);
        radioNao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioNao.setSelected(true);
        radioNao.setText("Não");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Número de regras:");

        txtTotalRegras.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Tamanho da base:");

        txtTamanho.setEditable(false);

        txtNAtributos.setEditable(false);

        jLabel12.setText("Número de atributos:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radioSim)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radioNao))
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7)
                                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel2)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cbxMetrica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtNumRegras, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSuporteMinimo, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSuporteMáximo, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMetricaMínima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                    .addComponent(txtConsequente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnHelp))))
                                        .addComponent(jLabel1))
                                    .addGap(50, 50, 50))
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCalcular)
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addComponent(btnAbrirArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnHelp2))
                                        .addComponent(btnLimpar))
                                    .addGap(101, 101, 101)))
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTotalRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnRemoverAtributo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStringSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(711, 711, 711)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(jLabel6)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotalRegras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumRegras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSuporteMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSuporteMáximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMetricaMínima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(radioSim)
                            .addComponent(radioNao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtConsequente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHelp))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbrirArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHelp2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverAtributo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStringSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(2383, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(2260, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Este campo é opcional!\nColoque um valor inteiro (o índice do atributo)\nSeu objetivo é definir um atributo como consequente!\nExemplo: \n 1 para atributo 1 \n 2 para atributo 2", "Escolha o índice do consequente", 1);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnAbrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArquivoActionPerformed
        // TODO add your handling code here:
        File arq = null;
        JFileChooser selecionador;
        Arquivo arquivo = new Arquivo();
        arquivo.setArq();
        int retorno = arquivo.getSelecionador().showOpenDialog(this);  //abre a janela para selecionar arquivo
        if (retorno == arquivo.getSelecionador().APPROVE_OPTION) { //se clicar no abrir
            selecionador = arquivo.getSelecionador();
            arq = arquivo.getSelecionador().getSelectedFile();  //arquivo selecionado
            regras.setDiretorio(arq.getPath());
        }
        regras.setIns(regras);
        if (auxQuantidadeCliqueBotaoAbrirArquivo == 1) {
            atr.preencherString(regras.getNovas());
            preencherListadosAtributos();
            auxQuantidadeCliqueBotaoAbrirArquivo++;
        } else {
            atr.apagarString(regras.getNovas());
            apagarListadosAtributos();
            atr.preencherString(regras.getNovas());
            preencherListadosAtributos();
        }
        valorIndiceAtributoSelecionado = 0;
        txtTamanho.setText(String.valueOf(regras.getIns().numInstances()));
        txtNAtributos.setText(String.valueOf(regras.getIns().numAttributes()));
    }//GEN-LAST:event_btnAbrirArquivoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtMetricaMínima.setText("");
        txtNumRegras.setText("");
        txtSuporteMinimo.setText("");
        txtSuporteMáximo.setText("");
        txtConsequente.setText("-1");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            txtTotalRegras.setText("");
            cbxInstancias.setText("");
            Instances ins = regras.getInstancias();
            Apriori ap = new Apriori();
            SelectedTag s = new SelectedTag(cbxMetrica.getSelectedIndex(), Apriori.TAGS_SELECTION); //1 é lift e 0 é confiança
            ap.setMetricType(s);
            ap.setNumRules(Integer.parseInt(txtNumRegras.getText())); //setar número de regras
            ap.setLowerBoundMinSupport(Double.parseDouble(txtSuporteMinimo.getText()));
            ap.setUpperBoundMinSupport(Double.parseDouble(txtSuporteMáximo.getText()));
            ap.setMinMetric(Double.parseDouble(txtMetricaMínima.getText()));
            if (radioSim.isSelected()) {
                ap.setCar(true);
            } else {
                ap.setCar(false);
            }
            ap.setClassIndex(Integer.parseInt(txtConsequente.getText()));
            //ap.setClassIndex(1);
            ap.buildAssociations(ins);
            regras.setAp(ap);
            if (regras.getAp().getCar() == true) {
                cbxInstancias.setText(regras.getAp().toString()); 
            } else {   
                AssociationRules arules = regras.getAp().getAssociationRules();
                int i = 1;
                for (AssociationRule ar : arules.getRules()) {
                    cbxInstancias.append(i++ + " - " + "SE  " + ar.getPremise().toString() + "  ENTÃO  " + ar.getConsequence().toString() + "  ---> " + ar.getPrimaryMetricName() + " =  " + String.valueOf(ar.getPrimaryMetricValue() * 100).substring(0, 3) + '%' + ",   Lift = " + String.valueOf(ar.getNamedMetricValue("Lift")).substring(0, 3));                
                    cbxInstancias.append("\n");
                    txtTotalRegras.setText(String.valueOf(regras.getAp().getAssociationRules().getNumRules()));
                }
            }
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                JOptionPane.showMessageDialog(null, "Impossível construir as instâncias! Verifique se os campos foram preenchidos", "Erro ao constuir instâncias", 0);
                System.out.println(e);
            } else if (e instanceof StringIndexOutOfBoundsException) {
                AssociationRules arules = regras.getAp().getAssociationRules();
                for (AssociationRule ar : arules.getRules()) {
                    try {
                        cbxInstancias.append("SE  " + ar.getPremise().toString() + "  ENTÃO  " + ar.getConsequence().toString() + "  ---> " + ar.getPrimaryMetricName() + " =  " + String.valueOf(ar.getPrimaryMetricValue() * 100).substring(0, 3) + '%' + ",   Lift = " + String.valueOf(ar.getNamedMetricValue("Lift")).substring(0, 2));
                        cbxInstancias.append("\n");
                        txtTotalRegras.setText(String.valueOf(regras.getAp().getAssociationRules().getNumRules()));
                    } catch (Exception ex) {
                        Logger.getLogger(TelaAssociação.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
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
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void listAtributosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAtributosMouseClicked
        txtStringSelecionada.setText(listAtributos.getSelectedValue());
        valorIndiceAtributoSelecionado = listAtributos.getSelectedIndex();
        //System.out.println(""+listAtributos.getSelectedIndex());
        // System.out.println(""+valorIndiceAtributoSelecionado);
        //System.out.println(""+novas.attribute(valorIndiceAtributoSelecionado));
    }//GEN-LAST:event_listAtributosMouseClicked

    private void btnRemoverAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAtributoActionPerformed
        modelo.remove(valorIndiceAtributoSelecionado);
        regras.getNovas().deleteAttributeAt(valorIndiceAtributoSelecionado);   //deletar atributo selecionado da instância    
        //System.out.println(""+novas.attribute(valorIndiceAtributoSelecionado));
    }//GEN-LAST:event_btnRemoverAtributoActionPerformed

    private void btnHelp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp2ActionPerformed
        BufferedImage img, img2;
        try {
            img = ImageIO.read(new File("C:\\Users\\thiag\\Desktop\\Iniciação científica\\teste weka\\src\\base1.png"));
            img2 = ImageIO.read(new File("C:\\Users\\thiag\\Desktop\\Iniciação científica\\teste weka\\src\\base2.png"));
            ImageIcon icon = new ImageIcon(img);
            ImageIcon icon2 = new ImageIcon(img2);
            JOptionPane.showMessageDialog(null, icon2, "Modelo de arquivos aceitos pelo programa (formatos arff,csv)", JOptionPane.PLAIN_MESSAGE, icon);
        } catch (IOException ex) {
            Logger.getLogger(TelaAssociação.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHelp2ActionPerformed

    private void txtConsequenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsequenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsequenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAssociação.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAssociação.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAssociação.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAssociação.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAssociação().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirArquivo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnHelp2;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemoverAtributo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea cbxInstancias;
    private javax.swing.JComboBox<String> cbxMetrica;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listAtributos;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    private javax.swing.JTextField txtConsequente;
    private javax.swing.JTextField txtMetricaMínima;
    private javax.swing.JTextField txtNAtributos;
    private javax.swing.JTextField txtNumRegras;
    private javax.swing.JTextField txtStringSelecionada;
    private javax.swing.JTextField txtSuporteMinimo;
    private javax.swing.JTextField txtSuporteMáximo;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JTextField txtTotalRegras;
    // End of variables declaration//GEN-END:variables

}
