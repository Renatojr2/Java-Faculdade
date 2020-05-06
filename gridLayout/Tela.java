package gridLayout;


import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;




public class Tela extends JFrame {

  public Tela(){
    super("Grid Layout");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(800, 600));

    getContentPane().setLayout(new GridLayout(3,3));

    for(int i = 0; i < 6; i++){
      add(new JButton("Botão - " + i));
    }

    pack();

  }
  
}