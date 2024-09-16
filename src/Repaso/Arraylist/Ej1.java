package Repaso.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej1 {
    public static void main(String[] args) {
        Producto Prod1 = new Producto("Leche", 2.5);
        Producto Prod2 = new Producto("Huevos", 3);
        Producto Prod3 = new Producto("Azucar", 2.29);
        Producto Prod4 = new Producto("Harina", 2);
        Producto Prod5 = new Producto("Pan", 1.5);

        ArrayList<Producto> lista = new ArrayList();
        lista.add(Prod1);
        lista.add(Prod2);
        lista.add(Prod3);
        lista.add(Prod4);
        lista.add(Prod5);

        Iterator iterator = lista.iterator();

        while (iterator.hasNext()) {
            Producto prod = (Producto) iterator.next();
            System.out.println(prod.getNombre() + " " + prod.getPrecio());
        }
        System.out.println();

        lista.remove(Prod5);
        lista.remove(Prod4);

        Producto nuevoprod = new Producto("Cereales", 4.79);
        lista.add(1,nuevoprod);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getPrecio());
        }
        System.out.println();

        for (Producto prodfor : lista) {
            System.out.println(prodfor.getNombre() + " " + prodfor.getPrecio());
        }
        System.out.println();

        Iterator iterator2 = lista.iterator();

        while (iterator2.hasNext()) {
            Producto prodit = (Producto) iterator2.next();
            System.out.println(prodit.getNombre() + " " + prodit.getPrecio());
        }
    }
}
