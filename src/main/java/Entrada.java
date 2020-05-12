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

    public String getTiempoDeVidaDeLaPublicacion() {
        String aDevolver = "Escrito hace 10 segundos";
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        //long numeroSegundos = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        //aDevolver += "Escrito hace ";

        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        //if(numeroSegundos > 59){
        //   aDevolver += numeroSegundos / 60 + " minutos";
        //}
        //else {
        //    aDevolver += numeroSegundos + " segundos";
        //}

        return aDevolver;
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
