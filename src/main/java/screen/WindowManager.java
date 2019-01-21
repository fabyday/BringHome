package screen;

import javax.swing.*;
import java.awt.*;


/**
 * This class manage Frame for Panels.
 * help Creating Panel or breaking Panel. etc.
 * @author ROH
 * @version 1.0
 */

public class WindowManager {

    private static WindowManager windowManager = null;
    JFrame jFrame = null;

    private WindowManager() {
        jFrame = new JFrame();
        jFrame.setSize(400, 500);
        
    }

    public static WindowManager newInstance()
    {
        if(windowManager != null)
            return windowManager;
        return new WindowManager();
    }


    public void setting(String title)
    {
        jFrame.setTitle(title);
    }


    public void setting(String title, Dimension dimension)
    {
        setting(title);
        jFrame.setSize(dimension);
    }


}
