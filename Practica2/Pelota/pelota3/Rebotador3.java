package pelota3;
import pelota.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rebotador3 extends JFrame implements ActionListener{
    private Button iniciar, detener;
    private Pelota3 pelota;
    public void Rebotador3(){
        setLayout(null);
        iniciar = new Button("Iniciar");
        iniciar.setBounds(220, 40, 80, 30);
        add(iniciar);
        iniciar.addActionListener(this);
        detener = new Button("Detener");
        detener.setBounds(310, 40, 80, 30);
        add(detener);
        detener.addActionListener(this);
        setTitle("Pelota JFrame");
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == iniciar){
            Graphics g = getGraphics();
            pelota = new Pelota3(g);
            pelota.start();
        }
        if(event.getSource() == detener)
            pelota.porFavorDetente();
    }
}
 