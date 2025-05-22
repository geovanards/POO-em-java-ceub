package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ControladorSair implements ActionListener {

    public ControladorSair(JTextField txtTitulo, JComboBox<String> cboAutor) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}
