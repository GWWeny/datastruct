package Class1.SqList;

public class Test {
    public static void main(String[] args) {
        SqList list = new SqList();
        list.init(3);
        list.Headdelete();

        System.out.println("线性表是否为空:"+list.isEmpty());
        list.Headinsert(1);
        list.Tailinsert(2);
        list.Tailinsert("傻蛋刘某");
        list.Headinsert("刘某傻蛋");
        list.Headinsert(3);
        list.Headinsert(4);
        list.Headinsert(5);
        list.Posinsert(2, "小明");
        list.print();
        System.out.println("\n修改:");
        list.posupdate(2, "小李");
        list.print();
        System.out.print("\n查找位置2的元素:");
        System.out.println(list.possearch(2));
        System.out.print("\n查找元素小李的位置:");
        System.out.println(list.objsearch("小李"));
        System.out.println("\n删除头结点后:");
        list.Headdelete();
        list.print();
        System.out.println("\n删除尾结点后:");
        list.taildelete();
        list.print();
        System.out.println("\n删除第1个结点后:");
        list.posdelete(1);
        list.print();
        System.out.println("\n线性表长度:"+list.getLength());
        System.out.println("线性表是否为空:"+list.isEmpty());
        System.out.println("\n线性表总容量:"+list.getMaxSize());
        list.destroy();
    }
}
