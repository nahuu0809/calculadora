
package calculadora;

import java.awt.BorderLayout;
import javafx.scene.control.TitledPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    
    JPanel panelp;
    JPanel panelb;
    JTextField txt;
    
    
    public Ventana(){
    
        setTitle("Calculadora - Prueba1");
        setSize(500,500);
        setResizable(false);
        //SALIR AL CLICKEAR LA CRUZ
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //METODO PARA CREAR INTERFAZ Y AGREGAR EVENTOS A BOTONES
        init();
        setVisible(true);
    
    }
    private void init() {
        //funcionalidad
        
        panelp = new JPanel();
        panelp.setLayout(new BorderLayout());
        
        panelb = new JPanel();
        txt = new JTextField();
            
        
    }
}
