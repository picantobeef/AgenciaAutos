
package personas;

import java.io.Serializable;

/**
 *
 * @author fagueros
 */
public class Registro implements Serializable{
    
    private int Contador;

    public Registro(int Contador) {
        this.Contador = Contador;
    }

    public Registro() {
        this.Contador = Contador;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
}

