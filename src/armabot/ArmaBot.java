package armabot;

import armabot.gui.ArmaBotGUI;

import javax.swing.*;
import java.util.jar.JarFile;

public class ArmaBot {

    private static boolean debug;

    public static void main(String[] args) {
        ArmaBotGUI.get().setVisible(true);
        debug = JOptionPane.showConfirmDialog(ArmaBotGUI.get(), "Would you like to show debugging messages?") == JOptionPane.YES_OPTION;
    }

    public boolean isDebugging() {
        return debug;
    }

    public void setDebugging(boolean debugging) {
        debug = debugging;
    }

    public static JarFile getClientFile() {
        return null;
    }

}