package apresentacao;

import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

import java.awt.event.ActionEvent;

public class ControladorLimpar implements ActionListener {
    //PP DA CLASSE 
    private JTextField txtNome = null;
    private JRadioButton optMasculino = null;
    private JTextField txtEndereco = null;
    private JComboBox<String>cboUf = null;

    //metodo construtor cheio da classe
    public ControladorLimpar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco, JComboBox<String> cboUf) {
        super();
        this.txtNome = txtNome;
        this.optMasculino = optMasculino;
        this.txtEndereco = txtEndereco;
        this.cboUf = cboUf;
    }
    //metodo implementado da interface
    public void actionPerformed(ActionEvent e ){
        //composição do objeto
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(txtNome.getText());
        objPessoa.setSexo(optMasculino.isSelected());
        objPessoa.setEndereco(txtEndereco.getText());
        objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));

        
        txtNome.setText("");
        optMasculino.setSelected(true);
        txtEndereco.setText("");
        txtEndereco.setText("");
        cboUf.setSelectedIndex(0);
        
        
    
    }
}