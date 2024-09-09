package book_04.chapter_04;

import java.util.LinkedList;

public class chapter_04 {
    public static void main(String[] args) {
//        using the linked list class
//        stores data in nodes
//        nodes are stored in non consercutive memory location
//        when inserting data in the list there is no need for shifting elements
//        a singly linked list only stores the data and the location of the next lnode
//        whereas a doubly linked list store the adress for the previous node and the next node
//        hence it uses more memory
//

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.pop(); //removes the last/tail
        linkedList.poll(); //removes the first/head

        linkedList.add(4,"E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");;

//        advantages and disadvantages;
        /*
        1.allocates needed memory while running
        2.inserting and deleting of nodes is easy
        3.doesnt waste memory

        1.uses more memory
        2.doesnt use indexes
        3.searching elements is more time consuming;


         */


    }
}
