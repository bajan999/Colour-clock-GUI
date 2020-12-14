
package clockgui;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ClockGUI {

    
    public static void main(String[] args) {
        
        Date date = new Date();
        
        SimpleDateFormat ft = new SimpleDateFormat ("HH");
        int time = Integer.parseInt(ft.format(date));
        System.out.println(time);
        if (time==0|time==12){
            Yellow y = new Yellow();
            y.setVisible(true);
            y.setSize(200, 200);
        }else if (time==1|time==13){
            Yellow_Orange yo = new Yellow_Orange();
            yo.setVisible(true);
            yo.setSize(200, 200);
        }else if (time==2|time==14){
            Orange o = new Orange();
            o.setVisible(true);
            o.setSize(200, 200);
        }else if (time==3|time==15){
            Red_Orange ro = new Red_Orange();
            ro.setVisible(true);
            ro.setSize(200, 200);
        }else if (time==4|time==16){
            Red r = new Red();
            r.setVisible(true);
            r.setSize(200, 200);
        }else if (time==5|time==17){
            Violet v = new Violet();
            v.setVisible(true);
            v.setSize(200, 200);
        }else if (time==6|time==18){
            Purple p = new Purple();
            p.setVisible(true);
            p.setSize(200, 200);
        }else if (time==7|time==19){
            Blue_Purple bp = new Blue_Purple();
            bp.setVisible(true);
            bp.setSize(200, 200);
        }else if (time==8|time==20){
            Blue b = new Blue();
            b.setVisible(true);
            b.setSize(200, 200);
        }else if (time==9|time==21){
            Teal t = new Teal();
            t.setVisible(true);
            t.setSize(200, 200);
        }else if (time==10|time==22){
            Green g = new Green();
            g.setVisible(true);
            g.setSize(200,200);
        }else if (time==11|time==23){
            Lime l = new Lime();
            l.setVisible(true);
            l.setSize(200, 200);
        }else{
            System.out.println("Error; wromg time");
        }
        
    }
}
