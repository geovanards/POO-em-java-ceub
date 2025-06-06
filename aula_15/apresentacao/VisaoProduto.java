import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VisaoProduto extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel lblProduto = new JLabel("Produto");
    private JComboBox<String> cboProduto = new JComboBox<String>();

    private JLabel lblCliente = new JLabel("Cliente");
    private JComboBox<String> cboCliente = new JComboBox<String>();

    private JLabel lblData = new JLabel("Data");
    private JTextField txtData = new JTextField();

    private JLabel lblQuantidade = new JLabel("Quantidade");
    private JTextField txtQuantidade = new JTextField();

    private JButton btnGravar = new JButton("Gravar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");

    public static void main(String[] args) {
        new VisaoProduto().setVisible(true);
    }
    public VisaoProduto(){
        setTitle("AMAZON - Gaste até vc querer apostar no tigrinho");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    

    //config da combo de produtos

    lblProduto.setBounds(10,10,200,20);
    add(lblProduto);
    
    cboProduto.setBounds(10,30,365,20);
    add(cboProduto);

    cboProduto.addItem ("- - - Selecione o Produto - - -");
    try {
        for (Produto objProduto : Produto.getTodos()){
            cboProduto.addItem(objProduto.getNome()+ "R$"+
                                objProduto.getPreco()+")");
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, erro);
    }

    lblCliente.setBounds(10,60,200,20);
    add(lblCliente);
    
    cboCliente.setBounds(10,80,365,20);
    add(cboCliente);

    cboCliente.addItem ("- - - Selecione o Cliente - - -");
    try {
        for (Cliente objCliente : Cliente.getTodos()){
            cboCliente.addItem(objCliente.getNome());
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, erro);
    }
    
    //config da caixa da data

    lblData.setBounds(10,110,200,20);
    add(lblData);

    txtData.setBounds(10,130,80,20);
    add(txtData);

    //config da caixa da quantidade

    lblQuantidade.setBounds(10,180,30,20);
    add(txtQuantidade);

    //configuração dos botões

    btnGravar.setBounds(20,210,100,30);
    add(btnGravar);
    btnGravar.addActionListener(new ControladorGravar(cboProduto, cboCliente,txtData,txtQuantidade));

    btnLimpar.setBounds(140,210,100,30);
    add(btnLimpar);
    btnLimpar.addActionListener(new ControladorLimpar(cboProduto, cboCliente,txtData,txtQuantidade));

    btnSair.setBounds(260,210,100,30);
    add(btnSair);
    btnSair.addActionListener(new ControladorSair(cboProduto, cboCliente,txtData,txtQuantidade));

    }
}

