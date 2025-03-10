import java.util.Stack;

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
        } else {
            fin.siguiente = nuevo;
            nuevo.siguiente = inicio;
            fin = nuevo;
        }
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
     * Método para eliminar un nodo de la lista.
     * @param ciudad1 Nombre de la primera ciudad del nodo a eliminar.
     * @param ciudad2 Nombre de la segunda ciudad del nodo a eliminar.
     */
    public void eliminar(String ciudad1, String ciudad2) {
        Nodo aux = inicio;
        Nodo ant = null;
        do {
            if (aux.ciudad1.equals(ciudad1) && aux.ciudad2.equals(ciudad2)) {
                if (aux == inicio) {
                    inicio = inicio.siguiente;
                    fin.siguiente = inicio;
                } else if (aux == fin) {
                    ant.siguiente = inicio;
                    fin = ant;
                } else {
                    ant.siguiente = aux.siguiente;
                }
            }
            ant = aux;
            aux = aux.siguiente;
        } while (aux != inicio);
    }

    /**
     * Imprime la lista final de atrás hacia adelante.
     */
    public void imprimir() {
        if (inicio == null) {
            return;
        }
        Stack<Nodo> stack = new Stack<>();
        Nodo aux = inicio;
        do {
            stack.push(aux);
            aux = aux.siguiente;
        } while (aux != inicio);

        while (!stack.isEmpty()) {
            Nodo nodo = stack.pop();
            System.out.println(nodo.ciudad1 + " - " + nodo.ciudad2);
        }
    }
}

