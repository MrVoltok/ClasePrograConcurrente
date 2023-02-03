package pelota;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rebotador extends JFrame implements ActionListener{
    private Button iniciar;
    public void Rebotador(){
        setLayout(null);
        iniciar = new Button("Iniciar");
        iniciar.setBounds(220, 40, 80, 30);
        add(iniciar);
        iniciar.addActionListener(this);
        setTitle("Pelota JFrame");
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == iniciar){
            Graphics g = getGraphics();
            Pelota pelota = new Pelota(g);
            pelota.mostrar();
            
        }
    }
}
 