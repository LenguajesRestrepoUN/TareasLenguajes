import javax.swing.*;
import java.awt.*;

public class Test {

    public JFrame frame;
    public JFrame frame2;
    public JFrame frame3;

    public Test(){
        frame = new JFrame("Console");
        frame.setSize(800, 800);

        //frame2 = new JFrame("Console 2");
        //frame2.setSize(600, 500);
        JTabbedPane pestañas0 = new JTabbedPane();

        JTextArea intel = new JTextArea(15, 40);
        intel.setLineWrap(true);
        intel.setWrapStyleWord(true);
        intel.setEditable(false);
        JScrollPane scroller = new JScrollPane(intel);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.add(scroller);
        JButton nextB = new JButton("Next");

        pestañas0.addTab("Cosonle", panel);
        //frame2.add(BorderLayout.SOUTH, nextB);
        //frame2.add(panel);
        //frame2.setVisible(true);

        //Creamos el conjunto de pestañas
        JTabbedPane pestañas=new JTabbedPane();

        //Creamos el panel y lo añadimos a las pestañas
        JPanel panel1=new JPanel();

        //Componentes del panel1

        JTextArea intel2 = new JTextArea(15, 40);
        intel2.setLineWrap(true);
        intel2.setWrapStyleWord(true);
        intel2.setEditable(false);
        JScrollPane scroller2 = new JScrollPane(intel2);
        scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel1.add(scroller2);

        //panel1.add(et_p1);

        //Añadimos un nombre de la pestaña y el panel
        pestañas.addTab("Scopes 1", panel1);

        //Realizamos lo mismo con el resto
        JPanel panel2=new JPanel();

        //Componentes del panel2

        JTextArea intel3 = new JTextArea(15, 40);
        intel3.setLineWrap(true);
        intel3.setWrapStyleWord(true);
        intel3.setEditable(false);
        JScrollPane scroller3 = new JScrollPane(intel3);
        scroller3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel2.add(scroller3);

        pestañas.addTab("Scopes 2", panel2);

        //-------------------------------------------

        JTabbedPane pestañas2=new JTabbedPane();

        JPanel panel12=new JPanel();


        JTextArea intel4 = new JTextArea(15, 40);
        intel4.setLineWrap(true);
        intel4.setWrapStyleWord(true);
        intel4.setEditable(false);
        JScrollPane scroller4 = new JScrollPane(intel4);
        scroller4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel12.add(scroller4);

        pestañas2.addTab("Cola 1", panel12);

        JPanel panel22=new JPanel();
        pestañas2.addTab("Panel 2", panel22);

        JLabel et_p22=new JLabel("Estas en el panel 22");
        panel22.add(et_p22);


        Box box = new Box(BoxLayout.Y_AXIS);
        Box box2 = new Box(BoxLayout.X_AXIS);
        box2.add(pestañas0);
        box2.add(pestañas);
        box.add(box2);
        box.add(pestañas2);
        frame.add(box);
        frame.add(BorderLayout.SOUTH, nextB);
        frame.setVisible(true);
    }
    public static void main(String[] args)  {
        new Test();
    }
}
