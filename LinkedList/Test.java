package LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(11);
        linkedList.addFirst(10);
        linkedList.addLast(13);
        linkedList.add(2, 12);
        linkedList.addLast(14);
        linkedList.addLast(15);
        linkedList.addLast(16);
        linkedList.addLast(17);
        System.out.println("da xoa:" + linkedList.remove1(19));


        System.out.println("size:" + linkedList.size());
        System.out.println(linkedList.contains(11));
        System.out.println("gia tri " + linkedList.get(7));
        System.out.println("head: " + linkedList.getFirst());
        System.out.println("last: " + linkedList.getLast());

        linkedList.clear();
        linkedList.show();
    }
    }
