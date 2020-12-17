package inicioSwing;
import java.swing.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJugar extends JPanel{
    JLabel Titulo;
    SeleccionPlanetas opciones1;//JComboBox= desplegable
    ArrayList<string> planetas;

    PanelJugar(){

        setLayout(new GridLayout(2,1));
        planetas=new ArrayList<string>();
        planetas.add("Planeta 1");
        planetas.add("Planeta 2");
        planetas.add("Planeta 3");

        Titulo=new JLabel("Bienbenido a Coldwar");
        opciones1=new SelecionPlanetas(planetas);
        opciones1.addItem("Pepito");
        opciones1.addItem("Juanito");
        opciones1.addItem("Menganito");

       

        add(Titulo);
        add(opciones1);
        
    }
}