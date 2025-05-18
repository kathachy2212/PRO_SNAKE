
import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    SnakeGame(){

        GamePanel pannel = new GamePanel(); 
        this.add(pannel); 
        this.setTitle("Let's Play Game....");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
      }

    

}
