import javax.swing.JFrame;
import javax.swing.JLabel;

public class exercicios1 {
  public static void  main(String[] args) {
    JFrame formulario = new JFrame();

    JLabel rotulo = new JLabel("exemplo de label");
    formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    formulario.setSize(500, 300);
    formulario.setLocation(10, 10);
    formulario.setTitle("exemplo");
    formulario.addNotify();

    formulario.setVisible(true);
    formulario.add(rotulo);
    
  }

  
}



