
/**
 * Clase que representa una lista circular de ciudades.
 */
public class ListaCiudad {
    private Nodo inicio;
    private Nodo fin;

    /**
     * Método para insertar un nuevo nodo en la lista.
     * @param ciudad1 Nombre de la primera ciudad.
     * @param ciudad2 Nombre de la segunda ciudad.
     */
    public void insertar(String ciudad1, String ciudad2) {
        Nodo nuevo = new Nodo(ciudad1, ciudad2);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            fin = nuevo;
        }
    }

    /**
     * Método para eliminar un nodo de la lista.
     * @param ciudad1 Nombre de la primera ciudad del nodo a eliminar.
     * @param ciudad2 Nombre de la segunda ciudad del nodo a eliminar.
     */
    public void eliminar(String ciudad1, String ciudad2) {
        Nodo aux = inicio;
        do {
            if (aux.ciudad1.equals(ciudad1) && aux.ciudad2.equals(ciudad2)) {
                if (aux == inicio) {
                    inicio = inicio.siguiente;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;
                } else if (aux == fin) {
                    fin = fin.anterior;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;
                } else {
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                }
                return;
            }
            aux = aux.siguiente;
        } while (aux != inicio);
    }

    /**
     * Imprime la lista de ciudades en orden normal.
     */
    public void imprimir() {
        if (inicio == null) {
            return;
        }
        Nodo aux = inicio;
        do {
            System.out.println(aux.ciudad1 + " - " + aux.ciudad2);
            aux = aux.siguiente;
        } while (aux != inicio);
    }

    /**
     * Imprime la lista de ciudades en orden inverso.
     */
    public void imprimirInverso() {
        if (inicio == null) {
            return;
        }
        Nodo aux = fin;
        do {
            System.out.println(aux.ciudad1 + " - " + aux.ciudad2);
            aux = aux.anterior;
        } while (aux != fin);
    }

    /**
     * Recorre la lista hacia adelante y encuentra el nombre más largo de las ciudades.
     */
    public void Recorrer() {
        Nodo aux = inicio;
        String ciudadMasLarga = "";
        int mayor = 0;
        do {
            if (aux.ciudad1.length() > mayor) {
                mayor = aux.ciudad1.length();
                ciudadMasLarga = aux.ciudad1;
            }
            if (aux.ciudad2.length() > mayor) {
                mayor = aux.ciudad2.length();
                ciudadMasLarga = aux.ciudad2;
            }
            aux = aux.siguiente;
        } while (aux != inicio);
        System.out.println("La ciudad con el nombre más largo es: " + ciudadMasLarga + " con " + mayor + " caracteres.");
    }

    /**
     * Método de prueba para verificar los enlaces de los nodos.
     */
    public void imprimirEnlaces() {
        if (inicio == null) {
            return;
        }
        Nodo aux = inicio;
        System.out.println("Enlaces de los nodos:");
        do {
            System.out.println("Nodo: " + aux.ciudad1 + " - " + aux.ciudad2);
            System.out.println("  Siguiente: " + aux.siguiente.ciudad1 + " - " + aux.siguiente.ciudad2);
            System.out.println("  Anterior: " + aux.anterior.ciudad1 + " - " + aux.anterior.ciudad2);
            aux = aux.siguiente;
        } while (aux != inicio);
    }
}