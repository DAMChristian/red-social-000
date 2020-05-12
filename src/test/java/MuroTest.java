import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {

    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recien llegado de mis vacaciones en Hawaii!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Marta", "Esta lloviendo ahi fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Miguel", "Ha creado la clase DAM 1");
        EntradaEvento entrada06 = new EntradaEvento("Adrian", "Se ha unido a los foros de linus");

        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);
        muro.addEntradaEvento(entrada05);
        muro.addEntradaEvento(entrada06);

        String aComparar = "Usuario: Nacho\n" + "Likes: 0\n" + "Recien llegado de mis vacaciones en Hawaii!\n" + "Escrito hace 10 segundos\n" + "No hay comentarios\n\n\n"
                         + "Usuario: Marta\n" + "Likes: 0\n" + "Esta lloviendo ahi fuera...\n" +  "Escrito hace 10 segundos\n" + "No hay comentarios\n\n\n"
                         + "Usuario: Luis\n" + "Likes: 0\n" + "Url: https://bit.ly/2W1dO09\n" + "Titulo: Gracias\n" +  "Escrito hace 10 segundos\n" + "No hay comentarios\n\n\n"
                         + "Usuario: Cristina\n" + "Likes: 0\n" + "Url: https://bit.ly/3cY9vtD\n" + "Titulo: Una foto de mi nevera\n" +  "Escrito hace 10 segundos\n" + "No hay comentarios\n\n\n"
                         + "Usuario: Miguel\n" + "Likes: 0\n" + "Ha creado la clase DAM 1\n" + "Escrito hace 10 segundos\n\n\n"
                         + "Usuario: Adrian\n" + "Likes: 0\n" + "Se ha unido a los foros de linus\n" + "Escrito hace 10 segundos\n\n\n";
        assertEquals(aComparar, muro.toString());
    }

}
