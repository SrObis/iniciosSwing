package iniciosSwing;

import javax.swing.*;//JPanel

import java.awt.Color;//Per a ficar color
import java.awt.FlowLayout;//FlowLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//ActionListener

public class LaminaMenuGeneral extends JPanel implements ActionListener {
    JButton boton1;// JButton= boton
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JTextField Texto1;// JTextField=caja de texto

    LaminaMenuGeneral() {
        setLayout(new FlowLayout());// setLayout forma de organizar los elementos de la lamina
        boton1 = new JButton("Jugar");// texto
        boton2 = new JButton("REGLAS");
        boton3 = new JButton("AUTORES");
        boton4 = new JButton("EXTRAS");
        boton5 = new JButton("SALIR");
        Texto1 = new JTextField(20); 
                                     // 20= El tamaño que tiene el textfile
        boton5.setBackground(Color.blue);// Para poner color
                                  
        //Para poner el boton a la escucha                                     
        boton1.addActionListener(this);   
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);



        // añadir los elementos a la lamina
        add(boton1);   
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(Texto1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            Texto1.setText("Estoy pulsando el boton JUGAR");
        }
        if(e.getSource()==boton2){
            Texto1.setText("Estoy pulsando el boton REGLAS");

        }
         if(e.getSource()==boton3){
            Texto1.setText("Estoy pulsando el boton AUTORES");

        }
        if(e.getSource()==boton4){
            Texto1.setText("Estoy pulsando el boton EXTRAS");

        }
        if(e.getSource()==boton5){}
            Texto1.setText("Estoy pulsando el boton Salir");

        }
        System.out.println("Estoy pulsando el boton");//por consola se printa el escrito
        Texto1.setText("Estoy escribiendo");//se printa a el quadro de texto el texto
    }

}
