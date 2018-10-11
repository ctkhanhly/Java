/*
 * 
 */


import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author lycao
 */
public class MenuDemo {
    public static void main(String[] args){
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu file = new JMenu("File");
        //short-cut
        file.setMnemonic(KeyEvent.VK_F);//=alt F- gach ngang duoi
        menuBar.add(file);
        
        //file selection
        JMenuItem miNew = new JMenuItem("New");
        miNew.setMnemonic(KeyEvent.VK_N);
        file.add(miNew);
        
        JMenuItem miOpen = new JMenuItem("Open");
        miOpen.setMnemonic(KeyEvent.VK_O);
        file.add(miOpen);
        
        JMenuItem miSave = new JMenuItem("Save");
        miSave.setMnemonic(KeyEvent.VK_S);
        file.add(miSave);
        
        //separate options from file
        file.addSeparator();
        
         JMenuItem miExit = new JMenuItem("Exit");
        miExit.setMnemonic(KeyEvent.VK_X);
        file.add(miExit);
        
        
                
        JMenu edit = new JMenu("Edit");
        edit.setMnemonic(KeyEvent.VK_E);
        menuBar.add(edit);
        
//        JMenuItem miFind = new JMenuItem("Find");
//        miFind.setMnemonic(KeyEvent.VK_I);
//        edit.add(miFind);
        JMenu muFind = new JMenu("Find");
        muFind.setMnemonic(KeyEvent.VK_I);
        edit.add(muFind);
         
        //options cho find thuoc edit
        JMenuItem miUp = new JMenuItem("Up");
        miUp.setMnemonic(KeyEvent.VK_U);
        muFind.add(miUp);
        
        JMenuItem miDown = new JMenuItem("Down");
        miDown.setMnemonic(KeyEvent.VK_U);
        muFind.add(miDown);
        
        
        frame.setSize(300,500);
        frame.setVisible(true);
    }
}
