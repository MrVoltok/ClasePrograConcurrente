package pelota3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Pelota3 extends Thread{
    private boolean seguirRebotando;
    private Graphics g;
    private int x = 7, xCambio = 7;
    private int y = 0, yCambio = 2;
    private int diametro = 10;
    private int rectIzqX = 0, rectDerX = 100;
    private int rectSupY = 0, rectInfY = 100;
    public Pelota3(Graphics graficos){
        g = graficos;
        seguirRebotando = true;
    }
    public void porFavorDetente(){
        seguirRebotando = false;
    }
    public void run(){
        g.drawRect(rectIzqX, rectSupY, rectDerX - rectIzqX + 10, rectInfY - rectSupY + 10);
        while(seguirRebotando){
            g.setColor(Color.white);
            g.fillOval(x, y, diametro, diametro);
            if(x + xCambio <= rectIzqX)
                xCambio = -xCambio;
            if(x + xCambio >= rectDerX)
                xCambio = -xCambio;
            if(y + yCambio <= rectSupY)
                yCambio = -yCambio;
            if(y + yCambio >= rectInfY)
                yCambio = -yCambio;
            x = x + xCambio;
            y = y + yCambio;
            g.setColor(Color.red);
            g.fillOval(x, y, diametro, diametro);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){System.err.println("excepcion de inactividad");}
        }
    }
}
