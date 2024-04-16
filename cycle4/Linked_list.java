import java.util.*;
public class Linked_list {
public static void main(String[] args){
System.out.println(" Steffi Antony\n Roll No: 54\n Date:09-04-2024\n Program title:Program to remove all the elements from a linked list\n");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}
