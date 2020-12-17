package iniciosSwing;
import java.*;
import javax.swing.*;

public class SelecionPlanetas extends JComboBox{
    
    SelecionPlanetas(ArrayList<String> a){
        super();
        for(int i=0;i<a.size();i++){
            this.addItem(a.get(i));
        }
        
    }


}
