package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI extends JFrame {
    
    Container cp;
    JPanel pnNorte= new JPanel();
    JPanel pnSul= new JPanel();
    JPanel pnLeste= new JPanel();
    JPanel pnOeste= new JPanel();
    JPanel pnCentro= new JPanel();
    
    JLabel lbTitulo = new JLabel("Teste");
    
    public GUI() {
        setSize(400,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp=getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(pnNorte, BorderLayout.NORTH);
        pnNorte.setBackground(Color.cyan);
        pnNorte.add(lbTitulo);
        
        cp.add(pnSul, BorderLayout.SOUTH);
        pnSul.setBackground(Color.cyan);
      
        cp.add(pnLeste, BorderLayout.EAST);
        pnLeste.setBackground(Color.cyan);
        
        cp.add(pnOeste, BorderLayout.WEST);
        pnOeste.setBackground(Color.cyan);
        
        cp.add(pnCentro, BorderLayout.CENTER);
        pnCentro.setBackground(Color.white);
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        
        
        
    }
    
}
