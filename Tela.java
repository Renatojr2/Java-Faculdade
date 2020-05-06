import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame{

  private JLabel rotulo = null;

  public Tela() {
    rotulo =  new JLabel("qualquer coisa");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLocation(100, 100);
    setTitle("exemplo");
    addNotify();

 
    add(rotulo);
  }
  
}

