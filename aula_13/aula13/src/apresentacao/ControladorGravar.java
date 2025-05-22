package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class ControladorGravar implements ActionListener{
    private JTextField txtTitulo = null;
    JComboBox<String> cboAutor = null;
    public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor){ 
    super();
    this.txtTitulo = txtTitulo;
    this.cboAutor = cboAutor;
    }


    public void actionPerformed(ActionEvent e){
        Livro objLivro= new Livro();
        objLivro.setTitulo(txtTitulo.getText());
        objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(),""));

        try {
            objLivro.persistir();
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
}
