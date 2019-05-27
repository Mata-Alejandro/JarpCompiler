package Interface;

import java.awt.Window;
import javax.swing.JFrame;


public class Editor {

    public static void main(String[] args) {
        Home gui =new Home();
        
        gui.setTitle("JarpCompiler");
        gui.setResizable(false);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        
    }
}
