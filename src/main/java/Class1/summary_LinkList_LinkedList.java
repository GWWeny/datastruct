package Class1;

import java.util.LinkedList;
import java.util.List;

public class summary_LinkList_LinkedList {
    public static void main(String[] args) {
        //这是一个由java提供的双向链表, 它提供了双向链表的操作
        LinkedList<Object> list=new LinkedList<>();
        list.add("hello");
        list.add(1);
        list.add(2.0);
        list.add("truer");
        System.out.print("链表：");
        System.out.println(list);
        list.addFirst("world");
        list.addLast("world");
        list.add(3,"没有钱");
        System.out.println(list.get(3));
        list.remove("world");
        System.out.println(list);
    }
}
