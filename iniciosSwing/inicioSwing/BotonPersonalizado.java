package inicioSwing;

import java.awt.*;
import javax.swing.*;//JPanel

public class BotonPersonalizado extends JButton {
    
    BotonPersonalizado(String texto){
        //llamamos el constructor de la clase padre y le pasamos el texto
        super(texto);
        setBackground(Color.red);

    }

}
