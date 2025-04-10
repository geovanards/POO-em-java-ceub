package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPessoa extends JFrame {

    //nomes
    private static final long serialVersionUID = 1L;
    private JLabel lblNome = new JLabel("Nome");
    private JTextField txtNome = new JTextField();

    //opções
    private JLabel lblSexo = new JLabel("Sexo");
    private ButtonGroup btgSexo = new ButtonGroup();
    private JRadioButton optMasculino = new JRadioButton("Masculino");
    private JRadioButton optFeminino = new JRadioButton("Feminino");
    private JLabel lblEndereco = new JLabel("Endereço");
    private JTextField txtEndereco = new JTextField();

    //caixa de texto
    private JLabel lblUf = new JLabel("UF");
    private JComboBox<String> cboUf = new JComboBox<String>();

    //botão
    private JButton btnGravar = new JButton("Gravar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");

    //método principal dew execução da classe
    public static void main(String[] args) {
        new VisaoPessoa().setVisible(true);
    }

    //metodo construtor da classe

    public VisaoPessoa(){
    //confiuração da janela

        setTitle("Configuração de Pessoas");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //configuração do nome
        lblNome.setBounds(10,10,200,20);
        add(lblNome);
        
        txtNome.setBounds(10,30,360,20);
        add(txtNome);
        
        //config sexo
        lblSexo.setBounds(10,60,200,20);
        add(lblSexo);

        optMasculino.setBounds(10,80,100,20);
        add(optMasculino);

        optFeminino.setBounds(120,80,100,20);
        add(optFeminino);

        btgSexo.add(optMasculino);
        btgSexo.add(optFeminino);
        optMasculino.setSelected(true);

        //config endereço
        lblEndereco.setBounds(10,110,200,20);
        add(lblEndereco);
        txtEndereco.setBounds(10,130,360,20);
        add(txtEndereco);

        //config UF
        lblUf.setBounds(10,160,200,20);
        add(lblUf);
        cboUf.setBounds(10,180,80,20);
        add(cboUf);
        cboUf.addItem("--");
        try{ 
        for(Uf objUf : Uf.getTodos()){
                cboUf.addItem(objUf.getSigla());
            }
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro);
        }
        cboUf.setSelectedIndex(0);
        
        //config dos botões 
        btnGravar.setBounds(20,230,100,30);
        add(btnGravar);
        
        btnLimpar.setBounds(140,230,100,30);
        add(btnLimpar);
        btnLimpar.addActionListener(new ControladorLimpar(txtNome,optMasculino, txtEndereco,cboUf));
        
        btnSair.setBounds(260,230,100,30);
        add(btnSair);
        
        btnGravar.addActionListener(new ControladorGravar(txtNome,optMasculino,txtEndereco,cboUf));
        btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
        btnSair.addActionListener(new ControladorSair());
        

    
    }
}
