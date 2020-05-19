import java.util.ArrayList;

public class EntradaComentarios extends Entrada {


    private ArrayList<String> comentarios;


    public EntradaComentarios(String autor) {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String text) {

        comentarios.add(text);
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver = super.toString();
        if (!comentarios.isEmpty()) {
            aDevolver += "Comentarios - ";
            for (String texto : comentarios) {
                aDevolver += texto + "\n";
            }
        }
        else {
            aDevolver += "No hay comentarios\n";
        }
        return aDevolver;
    }
}
