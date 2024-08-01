import java.util.HashMap;

public class Diccionario {
    private String nombreDeDiciconario;
    private HashMap<String, Palabra> palabras;

    public Diccionario() {
        palabras = new HashMap<>();
    }

    public Diccionario(String nombreDeDiciconario, HashMap<String, Palabra> palabras) {
        this.nombreDeDiciconario = nombreDeDiciconario;
        this.palabras = palabras;
    }

    public String getNombreDeDiciconario() {
        return nombreDeDiciconario;
    }

    public void setNombreDeDiciconario(String nombreDeDiciconario) {
        this.nombreDeDiciconario = nombreDeDiciconario;
    }

    public HashMap<String, Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(Palabra palabra) {
        palabras.put(palabra.getPalabra(), palabra);
    }

}
