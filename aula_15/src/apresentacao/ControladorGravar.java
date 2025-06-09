package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class ControladorGravar implements ActionListener {
	// Propiedades da classe
	private JComboBox<String> cboProduto = null;
	private JComboBox<String> cboCliente = null;
	private JTextField txtData = null;
	private JTextField txtQuantidade = null;
	
	// Metodo Construtor cheio da classe
	public ControladorGravar(JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData,
			JTextField txtQuantidade) {
		super();
		this.cboProduto = cboProduto;
		this.cboCliente = cboCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;
	}
	
	// Metodo implementado da interface
	public void actionPerformed(ActionEvent e) {
		try {
			Compra objCompra = new Compra();
			
			objCompra.setObjProduto(new Produto(cboProduto.getSelectedIndex(), "", 0));
			objCompra.setObjCliente(new Cliente(cboCliente.getSelectedIndex(), "", ""));
			objCompra.setDate(txtData.getText());
			objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
			
			objCompra.persistir();
			JOptionPane.showMessageDialog(null, "Gravação Realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
			
		}
	
		

	}

	

}
