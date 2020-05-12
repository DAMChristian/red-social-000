import java.time.LocalDateTime;

public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;


    public Entrada(String usuario) {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;

    }

    public void meGusta() {

        cantidadMeGusta++;
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


    @Override
    public String toString() {
        return "";
    }
}
