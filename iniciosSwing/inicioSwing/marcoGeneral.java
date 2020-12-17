package inicioSwing;

import javax.swing.*;

public class marcoGeneral extends JFrame{
    marcoGeneral(){
        setBounds(300,300,350,350);//els dos primes son les cordenades que volem on comensi (300)
        // y les dos ultimes son les dimensions que volem que tingui el marc (350)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//per a tancar el programa (cruz)
       
        add(new LaminaMenuGeneral());//añadimos la lamina
        
        
        
        setVisible(true);//para que se vea el marco(la parte de arriba de todos 
        // los programas con el nombre, minimizar, expandir y crerrar)
    }
}
