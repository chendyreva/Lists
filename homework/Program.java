package homework;
    import java.util.Iterator;

    public class Program {
        public static void main(String[] args) {
            MyLinkedList<Integer> list = new MyLinkedList<>();
            list.insertFirst(7);
            list.insertFirst(9);
            list.insertFirst(11);
            list.insertFirst(13);
            list.insertFirst(15);
            list.insertFirst(19);

        /*Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            Integer current = iter.next();
            System.out.println(current);
        }*/

            for (Integer current:
                    list) {
                System.out.println(current);
            }
        }
    }

