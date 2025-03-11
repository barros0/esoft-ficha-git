import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(){
        setContentPane(panel1);
        pack();

        lblMensagem.setText("Piotr here!");
    
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
