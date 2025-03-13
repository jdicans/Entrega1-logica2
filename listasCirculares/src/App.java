public class App {
    public static void main(String[] args) throws Exception {
        ListaCiudad lista = new ListaCiudad();
        lista.insertar("florida", "miami");
        lista.insertar("los angeles", "tokyo");
        lista.insertar("medellin", "bogota");
        lista.insertar("madrid", "barcelona");
        lista.insertar("roma", "ciudad de mexico");
        
        System.out.println("Lista en orden normal:");
        lista.imprimir();
        
        System.out.println("Lista en orden inverso:");
        lista.imprimirInverso();
        
        System.out.println("Enlaces de los nodos:");
        lista.imprimirEnlaces();
        
        lista.eliminar("medellin", "bogota");
        
        System.out.println("Lista en orden normal después de eliminar 'medellin - bogota':");
        lista.imprimir();
        
        System.out.println("Lista en orden inverso después de eliminar 'medellin - bogota':");
        lista.imprimirInverso();
        
        System.out.println("Enlaces de los nodos después de eliminar 'medellin - bogota':");
        lista.imprimirEnlaces();
        
        lista.eliminar("roma", "ciudad de mexico");
        
        System.out.println("Lista en orden normal después de eliminar 'roma - ciudad de mexico':");
        lista.imprimir();
        
        System.out.println("Lista en orden inverso después de eliminar 'roma - ciudad de mexico':");
        lista.imprimirInverso();
        
        System.out.println("Enlaces de los nodos después de eliminar 'roma - ciudad de mexico':");
        lista.imprimirEnlaces();
    }
}
