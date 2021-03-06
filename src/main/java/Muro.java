import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 *
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 *
 * @author DAM
 * @version 1.0
 */
public class Muro
{
    // Entradas de texto
    private ArrayList <Entrada> entrada;

    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro() {
        //Inicializa mensajes y fotos.
        entrada = new ArrayList<>();
    }

    /**
     * Anade una entrada de evento al muro.
     * @param entrada La entrada de evento a anadir.
     */
    public void addEntrada(Entrada entrada) {
        this.entrada.add(entrada);
    }

    public void mostrarDetallesTodasLasEntradas() {
        for (Entrada entrada : this.entrada) {
            entrada.mostrarDetallesPorPantalla();
        }
    }

    public String[] getUrlsFotos() {
        int contador = 0;
        for (Entrada entrada: this.entrada) {
            if (entrada instanceof EntradaFoto) {
                contador++;
            }
        }
        String[] urls = new String[contador];
        int contador2 = 0;
        for (Entrada entrada: this.entrada) {
            if (entrada instanceof EntradaFoto) {
                EntradaFoto entradaF = (EntradaFoto)entrada;
                urls[contador2] = entradaF.getUrlImagen();
                contador2++;
            }
        }
        return urls;
    }



    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas de texto.
        for (Entrada entrada : this.entrada) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver;
    }
}

