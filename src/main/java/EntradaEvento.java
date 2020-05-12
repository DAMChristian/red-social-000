public class EntradaEvento extends Entrada {

    private String evento;

    public EntradaEvento(String autor, String evento) {
        super(autor);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += evento + "\n";
        aDevolver += getTiempoDeVidaDeLaPublicacion() + "\n";
        return aDevolver;
    }
}
