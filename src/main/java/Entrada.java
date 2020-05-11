import java.time.LocalDateTime;
import java.util.ArrayList;

public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    public Entrada(String usuario) {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    public void meGusta() {

        cantidadMeGusta++;
    }

    public void addComentario(String text) {

        comentarios.add(text);
    }

    public LocalDateTime getMomentoPublicacion() {

        return momentoPublicacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "";
    }
}
