/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olaxj
 */
public class Hilo1 implements Runnable
{
    private final String nombre;
    public Hilo1(String nombre)
    {
        this.nombre=nombre;
    }
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
                System.out.println("Este es el hilo"+nombre+" con el numero: "+i);
        }
    }
}
