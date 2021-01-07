package listametodoquicksortu5e2;
import java.util.LinkedList;
import java.util.List;
public class ListaMetodoQuicksortU5E2 {
     public static void main(String[] args) {
         // TODO code application logic here
         System.out.println("Ejercicio 2 ordenamiento Quick");
         List<Integer> Lista = new LinkedList<Integer>();
         Lista.add(4);
         Lista.add(3);
         Lista.add(1);
         Lista.add(2);
         Quicksort(Lista, 0, Lista.size() - 1);
         for (int i = 0; i < Lista.size(); i++) {
             System.out.print(Lista.get(i) + "  ");
         }
     }
     static void Quicksort(List<Integer> Lista, int primero, int ultimo) {
         int i, j, aux, pivote;
         i = primero;
         j = ultimo;
         pivote = Lista.get(primero);
         do {
             while (Lista.get(i) < pivote) {
                 i++;
             }
             while (Lista.get(j) > pivote) {
                 j--;
             }
             if (i <= j) {
                 aux = Lista.get(i);
                 Lista.set(i, Lista.get(j));
                 Lista.set(j, aux);
                 i++;
                 j--;
             }
         } while (i <= j);
         if (j > primero) {
             Quicksort(Lista, primero, j);
         } 
         if (ultimo > i) {
             Quicksort(Lista, i, ultimo);
         }
     }
    
}
