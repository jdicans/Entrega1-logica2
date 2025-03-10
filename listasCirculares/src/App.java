public class App {
    public static void main(String[] args) throws Exception {
        ListaCiudad lista = new ListaCiudad();
        lista.insertar("florida", "miami");
        lista.insertar("los angeles", "tokyo");
        lista.insertar("medellin", "bogota");
        lista.insertar("madrid", "barcelona");
        lista.insertar("roma", "ciudad de mexico");
        lista.Recorrer();
        lista.imprimir();
        lista.eliminar("medellin", "bogota");
        lista.Recorrer();
        lista.imprimir();
        lista.eliminar("roma","ciudad de mexico");
        lista.Recorrer();
        lista.imprimir();

    }
}
