/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package remotescreenshot;

/**
 *
 * @author Mohanasundharam
 */

import java.awt.*;
import javax.swing.JFrame;

public class ViewResult extends Canvas{
      
    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("image.jpg");
        g.drawImage(i, 0,0,this);

    }
       public NewClass (){
        
        JFrame f=new JFrame();
        f.add(this);
        f.setSize(100,100);
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

}
