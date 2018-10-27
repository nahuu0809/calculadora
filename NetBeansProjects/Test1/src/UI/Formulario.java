package UI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import javax.swing.*;



//Formulario va a extender a JFrame, es decir que tiene todos los objetos visuales. Con esto ya esta hecha la ventana
//Siempre "extendes JFrame"
//Para crear agregar una interfaz a la public class, dsp de JFrame poner implements actionListener "x"(Nombre de lo que queramos agregar), etc.

/**
 *
 * @author Nahu
 */

public class Formulario extends JFrame implements ActionListener {
 
    protected JButton botonin;
    protected JTextField userfield;
    protected JPasswordField pass1;
    protected JLabel labe2;
    protected JButton botonreg;
    
   public Formulario() {
       
    
                 //x     y  width height
                 //x     y  ancho alto
    this.setLayout(null);
     this.setTitle("Puto el que lee");
    this.setBounds(100, 200, 300, 600);
    this.setMinimumSize(new Dimension(800, 600)); 
    this.setVisible(true);
    //el setdefaultcloseoperation es para que no se siga ejecutando en segundo plano, porque aunque cierres la ventana sin esto se sigue ejecutnado en 2do plano.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label1;
    label1 = new JLabel ("BIENVENIDO!");
    label1.setBounds(365, 90, 200, 40);
    add(label1);
    
    userfield = new JTextField("Usuario");
    userfield.setBounds(300, 180, 200, 40);
    add(userfield);
    
    pass1 = new JPasswordField ("Contraseña");
    pass1.setBounds(300, 220, 200, 40);
    add(pass1);
    
    botonin = new JButton("Iniciar Sesion");
    botonin.setBounds(300, 290, 200, 80);
    //Agregar escucha = actionListener
    botonin.addActionListener (this);
    add(botonin);
     
    labe2 = new JLabel ("No estas registrado? Registrate.");
    labe2.setBounds(308, 360, 1000, 90);
    add(labe2);
     
   botonreg = new JButton("Registrarme");
    botonreg.setBounds(300, 440, 200, 80);
    //Agregar escucha = actionListener
    botonreg.addActionListener (this);
    add(botonreg);
   } 
   
   //Agregar la escucha. 
   //Agregamos la acción terminada
   // Con el action performed (ActionEvent e) podemos que un boton tenga acciones.
   public void actionPerformed (ActionEvent e){
       this.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);
       // Con el Registro reg = new Registro(); llamamos a la clase registro y creamos la variable reg
       Registro reg = new Registro();
       //Con el this.setVisible (false); hacemos que la ventana formulario (osea la primera), se borre.
       this.setVisible(false);
       //Y aca si apreta el boton que le corresponde a botonreg, aparece la ventana registro, que es traida por la variable reg.setVisible(true);
       if(e.getSource()== botonreg){
       reg.setVisible(true);
       
       String button = null;
       if(e.getSource() == botonin){
           button = "Iniciar sesion";
       }
       if(e.getSource() == botonreg){
           button = "Registrarme";
       }
       //System.out.println("El boton es: " + button);
    
       //if(e.getSource()== botonreg) {
           
       }
       
  }
   
}

   
