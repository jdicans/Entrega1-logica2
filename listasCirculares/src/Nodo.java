public class Nodo {
    String ciudad1;
    String ciudad2;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String ciudad1, String ciudad2) {
        this.ciudad1 = ciudad1;
        this.ciudad2 = ciudad2;
        this.siguiente = null;
        this.anterior = null;
    }
}