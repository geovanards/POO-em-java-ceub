package apresenatacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visao extends JFrame { //01
    //propieddes da classe
    private static final long serialVersionUID = 1L; //02

    //03. cadastrar todos os controles da tela
    private JPanel obJPainel = new Painel();


    //04. Método principal de execução de programa(void main):
    public static void main(String[] args) {
        new Visao().setVisible(true);
    }


    //05. Método construtor da classe
    public Visao(){

        //configuração da janela:
        //set definir:
        setTitle("Minha primeira janela java");
        setSize(1024,768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Configuração do painel
        setContentPane(obJPainel);
        
    }
}
