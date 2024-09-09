package book_04.chapter_05;

public class chapter_05 {
    public static void main(String[] args) {
//        creating java collection generics

//        generics allow you to create classes that can be used for any type specified by the programmer at compile time;
        /*
        public class ArrayList<E>{};
        The E parameter specifies the type of elements stored in the list

         */

//         example generic stack class
        /*


        public class GenStack<E>{
            private LinkedList<E> list = new LinkedList<E>();

            public void push(E item){
                list.addFirst(item)
            }
        }

         */

//        using wildcard type
//        public void addItems(ArrayList<?> list){}
    }
}
