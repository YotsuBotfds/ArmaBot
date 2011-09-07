package armabot.gui;

import armabot.ArmaBot;
import armabot.Client;
import armabot.loader.MainLoader;

import javax.swing.*;

public class ArmaBotGUI extends JFrame {

    private static ArmaBotGUI gui;

    public final static ArmaBotGUI get(){
        if(gui == null)
            gui = new ArmaBotGUI();
        return gui;
    }

    private Client client;
    private MainLoader loader;

    private ArmaBotGUI(){
        super("ArmaBot");
        loader = new MainLoader(ArmaBot.getClientFile());
        client = MainLoader.loadClient(gui);
    }

}