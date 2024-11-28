package Class1.LinkList;


public class LinkList {
    private  Node head;//头结点
    private  Node tail;//尾结点
    private int size;//链表大小
    private final int MAXSIZE=-898;
    public LinkList(){
        size=0;
        head=new Node(0,null);
        tail=null;
    }

    //头插
    public void headinsert(Object data){
        Node node=new Node(data,null);// 新节点
        if(head.next==null){
            head.next=node;//头结点的next指针指向新节点
            tail=node;//tail指向第一个结点
        }else{
            node.next=head.next;//新结点指向原来第一个结点
            head.next=node;//头结点的next指针指向新节点
        }
        size++;
    }

    //尾插
    public void tailinsert(Object data){
        Node node=new Node(data,null);// 新节点
        tail.next=node;
        tail=node;
        size++;
    }

    //指定位置插入
    public void posinsert(int pos,Object data){
        if(pos-1<0 || pos-1>size){
            System.out.println("插入位置不合法");
        }else if((pos-1)==0){
            headinsert(data);
        }else if(pos==size+1){
            tailinsert(data);
        }else{
            Node node=new Node(data,null);// 新节点
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }

    //按位置更新
    public void posupdate(int pos,Object data){
        if(pos-1<0 || pos>size){
            System.out.println("插入位置不合法");
        }else{
            Node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            temp.data=data;
        }
    }

    //头删
    public void headdelete(){
        if(head.next==null){
            System.out.println("链表为空，无法删除");
        }else{
            head.next=head.next.next;
            size--;
        }
    }
    //尾删
    public void taildelete(){
        if(head.next==null){
            System.out.println("链表为空，无法删除");
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
    }
    //按位置删除
    public void posdelete(int pos){
        if(pos<1 || pos>size){
            System.out.println("位置不合法");
        }else if(pos-1==0){
            headdelete();
        }else if(pos==size){
            taildelete();
        }else{
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    //按位置查找
    public Object possearch(int pos){
        if(pos<1 || pos>size){
            System.out.println("位置不合法");
        }else{
            Node temp=head;
            for(int i=0;i<pos;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        return null;
    }
    //查找元素并返回位置
    public int objsearch(Object data){
        Node temp=head;
        int i=0;
        while(temp.next!=null){
            i++;
            temp=temp.next;
            if(temp.data.equals(data)){
                return i;
            }
        }
        return MAXSIZE;
    }

    public int getSize(){
        return size;
    }
    //遍历链表
    public void print(){
        while(head.next!=null){
            if(head.next.next==null){
                System.out.print(head.next.data);
                break;
            }else{
                System.out.print(head.next.data+"->");
                head=head.next;
            }
        }
    }

    //静态内部类
    public static class Node{
        Object data;
        Node next;
        Node(Object data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
