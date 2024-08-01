public class App {
    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();

        Palabra comer = new Palabra();
        comer.setPalabra("comer");
        comer.setDefinicion("Acción de comer");

        Palabra tomar = new Palabra();
        tomar.setPalabra("tomar");
        tomar.setDefinicion("accion de tomar");

        Palabra caminar = new Palabra("caminar", "acción de caminar");

        System.out.println("-------------AGREGANDO PALABRAS-------------");

        diccionario.setPalabras(comer);
        diccionario.setPalabras(tomar);
        diccionario.setPalabras(caminar);

        System.out.println("\n-------------MOSTRANDO PALABRAS DEL DICCIONARIO JUNTO CON SU DEFINICIÓN-------------");
        for (Palabra p : diccionario.getPalabras().values()) {
            System.out.println(p);
        }

        System.out.println("\n-------------MOSTRANDO PALABRAS DEL DICCIONARIO-------------");
        for (String p : diccionario.getPalabras().keySet()) {
            System.out.println(p);
        }

        System.out.println("\n-------------MOSTRANDO SU DEFINICIÓN-------------");
        for (Palabra p : diccionario.getPalabras().values()) {
            System.out.println(p.getDefinicion());
        }

        System.out.println("\n-------------BUSCANDO PALABRA-------------");
        if (diccionario.getPalabras().containsKey("caminar")) {
            System.out.println("La palabra está");
        }

        System.out.println("\n-------------REMOVIENDO PALABRA-------------");
        if (diccionario.getPalabras().containsKey("caminar")) {
            diccionario.getPalabras().remove("caminar");
        }

        System.out.println("\n-------------VIENDO SI LA PALABRA SIGUE AHÍ-------------");
        if (diccionario.getPalabras().containsKey("caminar")) {
            System.out.println("La palabra está");
        } else {
            System.out.println("No está");
        }

        System.out.println("\n-------------MOSTRANDO DICCIONARIO DESPUÉS DE ELIMINAR LA PALABRA-------------");
        for (String p : diccionario.getPalabras().keySet()) {
            System.out.println(p);
        }
    }
}
