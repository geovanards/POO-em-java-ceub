import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorLimpar ActionListener {
    private JComboBox<String> cboProduto = null;
    private JComboBox<String> cboCliente = null;
    private JTextField txtData = null;
    private JTextField txtQuantidade = null;

    public ControladorLimpar ( JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData, JTextField txtQuantidade){
        super();

        this.cboProduto = cboProduto;
        this.cboCliente = cboCliente;
        this.txtData = txtData;
        this.txtQuantidade = txtQuantidade;
    }

    public void actionPerformed (ActionEvent e){
        cboProduto.setSelectedIndex(0);
        cboCliente.setSelectedIndex(0);
        txtData.setText("");
        txtQuantidade.setText("");
    }
        public void actionPerformed(ActionEvent e){
            try {
                Compra objCompra = new Compra();
                objCompra.setObjProduto(new Produto cboProduto.getSelectedItem(),"",0);
                objCompra.setObjCliente(new Cliente (cboCliente.getSelectedIndex(),"",""));
                objCompra.setData(txtData.getText());
                objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));

                objCompra.persistir();
                JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro);
            }
        }
    }

