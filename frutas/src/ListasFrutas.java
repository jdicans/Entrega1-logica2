public class ListasFrutas {
    private Nodo cabeza;

    public ListasFrutas() {
        this.cabeza = null;
    }

    // Método para insertar una fruta en la lista
    public void insertar(String fruta) {
        Nodo nuevo = new Nodo(fruta);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    // Método para mostrar todas las frutas en la lista
    public void mostrar() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.fruta);
            aux = aux.siguiente;
        }
    }

    // Método para eliminar una fruta de la lista
    public void eliminar(String fruta) {
        if (cabeza != null) {
            if (cabeza.fruta.equals(fruta)) {
                cabeza = cabeza.siguiente;
            } else {
                Nodo aux = cabeza;
                while (aux.siguiente != null) {
                    if (aux.siguiente.fruta.equals(fruta)) {
                        aux.siguiente = aux.siguiente.siguiente;
                        break;
                    }
                    aux = aux.siguiente;
                }
            }
        }
    }

    // Método para ordenar las frutas en la lista alfabéticamente
    public void ordenar() {
        Nodo aux = cabeza;
        Nodo aux2 = null;
        while (aux != null) {
            aux2 = aux.siguiente;
            while (aux2 != null) {
                if (aux.fruta.compareTo(aux2.fruta) > 0) {
                    String temp = aux.fruta;
                    aux.fruta = aux2.fruta;
                    aux2.fruta = temp;
                }
                aux2 = aux2.siguiente;
            }
            aux = aux.siguiente;
        }
    }

    // Método para contar cuántas veces aparece una fruta en la lista
    public int contar(String fruta) {
        int contador = 0;
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.fruta.equals(fruta)) {
                contador++;
            }
            aux = aux.siguiente;
        }
        return contador;
    }
}