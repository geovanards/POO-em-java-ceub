
package apresentacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import negocio.Pessoa;
import negocio.Uf;


public class ControladorGravar implements ActionListener {

	// Propiedades da Classe 

	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUF = null;

	// Metodos Construtores cheio da Classe (Nao ha construtor vazio em caixa de controle)

	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> cboUF) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.cboUF = cboUF;
	}

	
	// Metodo implementado da Interface
	public void actionPerformed(ActionEvent e) {

	// Composição do objeto 

	Pessoa objPessoa = new Pessoa();
	objPessoa.setNome(txtNome.getText());
	objPessoa.setSexo(optMasculino.isSelected());
	objPessoa.setEndereco(txtEndereco.getText());
	objPessoa.setObjUf(new Uf(cboUF.getSelectedItem().toString()));

	

	// Simulação de persistência 

	JOptionPane.showMessageDialog(null,

			"Gravação realizada com sucesso!!!\n\n" +
			"Nome: " + objPessoa.getNome() + "\n" +
			"Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\n" +
			"Endereço:  " + objPessoa.getEndereco() + "\n" +
			"UF: " + objPessoa.getObjUf().getSigla());

    }

	

}

