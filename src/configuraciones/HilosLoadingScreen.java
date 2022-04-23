/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuraciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * clase Hilos del jframe LoadingScreen.java
 * @author scont
 */
public class HilosLoadingScreen extends Thread {   
    
    javax.swing.JTextField jtfCargando; //se crea una variable de la clase swing tipo JTextField
    int contador; //que se va a ver en la pantalla de LoadingScreen.java

    public HilosLoadingScreen() {
        contador = 1; //o en 0
    }

    public void run() {
        while (contador <101) {       //para que el hilo termine de correr cuando llegue al 100, sino sigue 
            
            jtfCargando.setText("Cargando: " + contador++); //hago que la caja de texto jtfCargando muestre el contador, e incremento el contador
            
            try {
                sleep(51); //para que se mueva del 1 al 100 
            } catch (InterruptedException ex) { //excepcion del metodo sleep()
                Logger.getLogger(HilosLoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 

    } 

    /*este metodo es el que se llama desde el jframe LoadingScreen.java
    recibe el contador y se lo asigna al JTextField jtfCargando
    */
    public void recibeJTextField (javax.swing.JTextField jlContador) {
        this.jtfCargando = jlContador;
    }

} 
