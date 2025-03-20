package apresenatacao;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Painel extends JPanel {
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g){
        //céu
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1024, 500);

        //chão
        g.setColor(Color.green);
        g.fillRect(0, 500, 1024, 268);

        //sol
        g.setColor(Color.orange);
        g.fillOval(850,50, 120, 120);
        g.setColor(Color.yellow);
        g.fillOval(870,70, 80, 80);
        
        
        //frente da casa
        /*
        
        g.setColor(Color.black);
        g.drawLine(100, 580, 125, 530);
        g.setColor(Color.pink);
        g.drawLine(150, 580, 125, 530);
        */

        //boneco
        g.setColor(Color.red);
        g.fillOval(650, 600, 30, 30);
    }
}
