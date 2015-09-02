package GUI;

import gui.LoginGUI;
import java.awt.*;
import javax.swing.*;
public class SplashScreen extends JWindow {
    
    private int duration;
    
    public SplashScreen(int d) {
        duration = d;
    }
    
// Este é um método simples para mostrar uma tela de apresentção

// no centro da tela durante a quantidade de tempo passada no construtor

    
    
    public void showSplash() {        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        
        // Configura a posição e o tamanho da janela
        int width = 450;
        int height = 115;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        // Constrói o splash screen
        JProgressBar bar = new JProgressBar();
        JLabel label = new JLabel(new ImageIcon("/src/gui/imagemfundosplash.jpg"));
        bar.setMinimum(0);
        bar.setMaximum(100);
        bar.setBackground(Color.white);
        bar.setForeground(Color.getHSBColor(349, 60, 100));
        content.add(label, BorderLayout.CENTER);
        content.add(bar, BorderLayout.SOUTH);
      
        Color oraRed = new Color(156, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));        
        setVisible(true);
        
      for (int i = 0; i<101; i++){
        try {
            Thread.sleep(60);
            bar.setValue(i);  
            }
        catch (Exception e) {}  
        
      }      
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        this.dispose();        
    }
    
    public void showSplashAndExit() {        
        showSplash();       
    }
    
    public static void main(String[] args) {        
        // Mostra uma imagem com o título da aplicação 
        
               
    }
}



