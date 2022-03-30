package proyecto;

/**
 * despues de cierto tiempo inactivo la sesión se cierra *
 * @author scont
 */
public class Sesion implements Runnable {

    public void run() {
        new Thread(new Sesion()).start();
        
        //pendiente


    }

}
