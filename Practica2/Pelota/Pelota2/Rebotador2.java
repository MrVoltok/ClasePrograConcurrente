package Pelota2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rebotador2 extends JFrame implements ActionListener{
    private Button iniciar;
    public void Rebotador2(){
        setLayout(null);
        iniciar = new Button("Iniciar");
        iniciar.setBounds(220, 40, 80, 30);
        add(iniciar);
        iniciar.addActionListener(this);
        setTitle("Pelota 2 JFrame");
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == iniciar){
            Graphics g = getGraphics();
            Pelota2 pelota = new Pelota2(g);
            pelota.run();
            
        }
    }
}
 