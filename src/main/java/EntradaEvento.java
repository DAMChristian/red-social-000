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
        String aDevolver = super.toString();
        aDevolver += evento + "\n";
        return aDevolver;
    }
}
