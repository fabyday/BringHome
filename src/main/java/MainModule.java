import screen.WindowManager;

import javax.swing.*;

/**
 * this class is called for make explorer windows.
 * @author ROH
 * @version 1.0
 */


public class MainModule {

    public static String title = "BringHome";
    public static void main(String[] args)
    {
        WindowManager windowManager = WindowManager.newInstance();
        windowManager.setting(title);

    }

}
