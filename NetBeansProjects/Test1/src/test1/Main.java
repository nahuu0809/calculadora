package test1;

import UI.Formulario;
import UI.welcome;
import java.awt.Color;
import java.awt.PopupMenu;
import java.util.ArrayList;

public class Main {

    private static Object bolic;

    public static void main(String[] args) {
        
        welcome wel;
        wel = new welcome();
 
       //El fondo se cambia desde el main. 
     Formulario formu;
        formu = new Formulario();
        //Cambiar el color de fondo con xnombre.getContentPane().setBackground(Color.xcolor);
        //Color (oxFF000);
        formu.getContentPane().setBackground(Color.blue);
 
        //Login Class 
      ArrayList <Login> loginList = new ArrayList <Login>();
      
      //Instanciamos usuarios y contrasenas por ejemplo
      
      Login login0 = new Login("nahuel022", "rappi894902");
      loginList.add(login0);
      
      Login login1 = new Login("juani093", "ruby8373");
      loginList.add(login1);
      
      
       for(int index=0; index < loginList.size(); index++){
            Login loginActual = loginList.get(index);
            loginActual.mostrar();
        } 
       
       
       //BoliList Class 
      ArrayList <Boliche> boliList = new ArrayList <Boliche>();
      
      //Instanciamos usuarios y contrasenas por ejemplo
      
      Boliche bolic0 = new Boliche("Believe BS.AS.");
      boliList.add(bolic0);
      
      Boliche bolic1 = new Boliche("Club Leloir");
      boliList.add(bolic1);
      
      Boliche bolic2 = new Boliche("Bora Bora");
      boliList.add(bolic2);
      
      Boliche bolic3 = new Boliche("Crobar");
      boliList.add(bolic3);
      
      Boliche bolic4 = new Boliche("Sucht");
      boliList.add(bolic4);
      
      Boliche bolic5 = new Boliche("Al Diablo");
      boliList.add(bolic5);
    
      for(int index=0; index <boliList.size(); index++){
          Boliche boli = boliList.get(index);
            boli.mostrar();
        }    
}
    
}
