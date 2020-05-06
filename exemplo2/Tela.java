package exemplo2;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;


public class Tela extends JFrame {


  public Tela(){
    super("Trabalhando com layouts");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(400, 200));
    
    getContentPane().setLayout(new FlowLayout());

    for(int i = 0; i < 5; i++) {
      add(new JButton("Botão -" + i));
    }

    pack();


  }
  
}