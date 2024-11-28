package Class1.LinkList;

public class Test {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.headinsert("hello");
        list.headinsert(1);
        list.headinsert(2.0);
        list.tailinsert("棒肉大");
        list.posinsert(5, "大白");
        System.out.println("链表大小:"+list.getSize());
        System.out.println("修改位置5:");
        list.posupdate(5,123);
        System.out.println("查找位置3的元素："+list.possearch(3));

        System.out.println("查找元素123的位置："+list.objsearch(123));
        System.out.println("删除头部");
        list.headdelete();
        System.out.println("删除尾部");
        list.taildelete();
        System.out.println("删除位置2");
        list.posdelete(2);


        list.print();
    }
}
