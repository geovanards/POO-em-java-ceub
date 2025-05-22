package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener{

    private JTextField txtTitulo = null;
    JComboBox<String> cboAutor = null;
    public ControladorLimpar(JTextField txtTitulo, JComboBox<String> cboAutor){ 
    super();
    this.txtTitulo = txtTitulo;
    this.cboAutor = cboAutor;
    }


    public void actionPerformed(ActionEvent e){
    txtTitulo.setText("");
    cboAutor.setSelectedIndex(0);
    }
}

