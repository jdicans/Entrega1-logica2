

public class App {
    public static void main(String[] args) throws Exception {
     ListasFrutas lista = new ListasFrutas();
     lista.insertar("Manzana");
     lista.insertar("Pera");
     lista.insertar("Uva");
     lista.insertar("Mango");
        
     lista.mostrar();
     System.out.println("Ordenando...");
     lista.ordenar();
     lista.mostrar();
     System.out.println("Eliminando Pera...");
     lista.eliminar("Pera");
     lista.mostrar();
    }   
    }
