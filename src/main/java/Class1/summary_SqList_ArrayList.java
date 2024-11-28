package Class1;

import java.util.ArrayList;

public class summary_SqList_ArrayList {
    public static void main(String[] args) {
        //java的强大之处是提供大量封装好的库供大家使用
        // 它本身就提供了线性表的数据结构，如顺序表ArrayList，链表LinkedList
        ArrayList<Object> list = new ArrayList<>();
        list.add("hello");//添加元素
        list.add(1);
        list.add(2.0);
        list.add("truer");
        System.out.print("线性表：");
        for (Object o : list) {
            System.out.print(o+" ");
        }
        list.set(0, "world");//修改元素
        System.out.println("删除了"+list.remove(3));//删除指定位置，返回被删除的元素
        System.out.println("删除了"+list.remove(2.0));//删除指定元素，返回是否删除成功
        System.out.println("\n位置1的元素："+list.get(1));//获得指定索引的元素
        System.out.println("线性表的大小:"+list.size());
        System.out.print("线性表：");
        for (Object o : list) {
            System.out.print(o+" ");
        }
        System.out.println("\n线性表是否为空："+list.isEmpty());
        list.clear();//销毁顺序表
        System.out.print("线性表：");
        for (Object o : list) {
            System.out.print(o+" ");
        }
    }
}
