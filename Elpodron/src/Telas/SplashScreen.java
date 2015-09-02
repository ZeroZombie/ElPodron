package Telas;

import java.awt.*;
import java.util.Random;
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
        JLabel label = new JLabel(new ImageIcon("src/Telas/fundosplash.png"));
        JProgressBar bar = new JProgressBar();
        content.add(label, BorderLayout.CENTER);
        content.add(bar, BorderLayout.SOUTH);
        Color oraRed = new Color(156, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 5));        
        // Torna visível
        setVisible(true);
        bar.setBackground(Color.WHITE);
        bar.setForeground(Color.getHSBColor(349, 60, 100));;
        bar.setMinimum(0);
        bar.setMaximum(100);
        bar.setValue(0);
        for (int i = 0; i<101; i++){
        try {
            Thread.sleep(60);
            bar.setValue(i);  
            }
        catch (Exception e) {}  
        
      }
        
        
        // Espera ate que os recursos estejam carregados
        try { Thread.sleep(0); } catch (Exception e) {}        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.setVisible(false);        
    }
     
    
    public void showSplashAndExit() {        
        showSplash();       
    }
    
    public static void main(String[] args) {

SplashScreen splash = new SplashScreen(10000);
        splash.showSplashAndExit();



}
    
   
}



