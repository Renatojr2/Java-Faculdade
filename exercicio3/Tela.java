package exercicio3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;




public class Tela extends JFrame {
  private FlowLayout layout = null;

  public Tela(){
    //superclass
    super("teste FlowLayout");

    //define o metodo que fechara a janela e sua dimensão
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(400, 200));

    //define o tipo de layout
    layout = new FlowLayout();
    setLayout(layout);

    //define o alinhamento
    layout.setAlignment(FlowLayout.CENTER);

    //adicionar os botões
    add(new JButton("Botão - 0"));
    add(new JButton("Botão - 1"));
    add(new JButton("Botão - 2"));
    add(new JButton("Botão - 3"));
    add(new JButton("Botão - 4"));
    add(new JButton("Botão - 5"));

    //ajusta a tela ao seu conteudo
    pack();
  }


}