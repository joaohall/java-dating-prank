package panels;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Window extends JFrame implements WindowListener, MouseListener, ActionListener {

    private int counter = 0;
    private JLabel label2 = new JLabel("Just click on yes button if you wanna get out of it");
    private JPanel panel = new JPanel();
    private JButton yesButton = new JButton("Yes!");
    private JButton noButton = new JButton("No.");
    private JLabel label = new JLabel("Hey! you're kinda cute... \n do you wanna be my girlfriend?");
    private String name;

    public void windowConfig(){
        setResizable(false);
        setTitle("Do you wanna be my " + this.name);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setBounds(500,500,500,500);
        panel.setLayout(null);
        addWindowListener(this);

        yesButton.setVisible(true);
        noButton.setVisible(true);
        panel.setVisible(true);
        label.setVisible(true);
        label2.setVisible(false);

        add(panel);

        panel.add(label);
        panel.add(yesButton);
        panel.add(noButton);
        panel.add(label2);

        noButton.setBounds(270,300,90,30);
        yesButton.setBounds(120,300,90,30);
        label.setBounds(100,150,400,90);
        label2.setBounds(100,0,400,100);

        noButton.addMouseListener(this);
        yesButton.addActionListener(this);

    }
    public Window(String name){
        this.name = name;
        setVisible(true);
        windowConfig();
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "hay! Now youre my girlfriend");
        System.exit(0);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random random = new Random();
        int x = random.nextInt(300);
        int y = random.nextInt(300);
        counter++;

        if (counter == 14){
            label2.setVisible(true);
        }

        noButton.setBounds(x,y,90,30);

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,"Nonononono, you need to answer");
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
