package Class1.SqList;

public class SqList {
    private int length;//当前顺序表的长度
    private Object[] data;//顺序表数组
    private int maxSize;//顺序表数组的最大长度
    final static int NULL_DATA=-456;

    //创建
    public void init(int maxSize){
        length=0;
        this.maxSize=maxSize;
        data=new Object[maxSize];//创建数组，长度为maxSize
    }

    //销毁
    public void destroy(){
        for(int i=0;i<data.length;i++){
            data[i]=null;
        }
        length=0;
    }

    public int getLength(){
        return length;
    }
    public int getMaxSize(){return maxSize;}

    //增加元素
    //头插
    public void Headinsert(Object obj){
        if(length==maxSize){
            System.out.println("顺序表已满，无法插入。现在开始扩容");
            expand();

            for(int i=length-1;i>=0;i--){
                data[i+1]=data[i];
            }
            data[0]=obj;
            length++;
        }else{
            for(int i=length-1;i>=0;i--){
                data[i+1]=data[i];
            }
            data[0]=obj;
            length++;
        }
    }
    //尾插
    public void Tailinsert(Object obj){
        if(length==maxSize){
            System.out.println("顺序表已满，无法插入");
            expand();

            data[length]=obj;
            length++;
        }else{
            data[length]=obj;
            length++;
        }
    }
    //按指定位置插
    public void Posinsert(int pos,Object obj){
        if(length==maxSize){
            System.out.println("顺序表已满，无法插入");
            expand();

            for(int i=length-1;i>=pos-1;i--){
                data[i+1]=data[i];
            }
            data[pos-1]=obj;
            length++;

        }else if(pos<1 || pos>length+1){
            System.out.println("位置不合法");
        }else{
            for(int i=length-1;i>=pos-1;i--){
                data[i+1]=data[i];
            }
            data[pos-1]=obj;
            length++;
        }
    }

    //删除元素
    //头删
    public void Headdelete(){
        if(length==0){
            System.out.println("顺序表为空，无法删除");
        }else{
            for(int i=0;i<length-1;i++){
                data[i]=data[i+1];
            }
            length--;
        }

    }
    //尾删
    public void taildelete(){
        if(length==0){
            System.out.println("顺序表为空，无法删除");
        }else{
            length--;
        }
    }
    //指定位置删除
    public void posdelete(int pos){
        if(length==0){
            System.out.println("顺序表为空，无法删除");
        }else if(pos<1 || pos>=length+1){
            System.out.println("位置不合法");
        }else{
            for(int i=pos-1;i<length-1;i++){
                data[i]=data[i+1];
            }
            length--;
        }
    }

    //修改元素
    public void posupdate(int pos,Object obj){
        if(pos<1 || pos>=length+1){
            System.out.println("位置不合法");
        }else{
            data[pos-1]=obj;
        }
    }

    //按位置查找
    public Object possearch(int pos) {
        checkIndex(pos);
        if(pos<1 || pos>=length+1){
            System.out.println("位置不合法");
            return null;
        }else{
            return data[pos-1];
        }
    }

    //查找元素并返回位置
    public int objsearch(Object obj){
        checkObj(obj);
        for(int i=0;i<length;i++){
            if(data[i].equals(obj)){
                return i+1;
            }
        }
        return NULL_DATA;
    }

    //判空处理
    public String isEmpty(){
        if (length==0){
            return "线性表为空";
        }else{
            return "线性表不为空";
        }
    }
    //遍历打印
    public void print(){
        if(length==0){
            System.out.println("顺序表为空");
            return;
        }
        System.out.print("顺序表为：");
        for(int i=0;i<length;i++){
            System.out.print(data[i]+" ");
        }
    }

    //检查索引是否越界
    private void checkIndex(int pos){
        if(pos<1 || pos>=length+1){
            throw new IndexOutOfBoundsException("索引越界");
        }
    }

    //判断元素是否存在,不存在报错
    private void checkObj(Object obj){
        for(int i=0;i<length;i++){
            if(data[i].equals(obj)){
                return;
            }
        }
        throw new IllegalArgumentException("元素不存在");
    }

    //扩容
    private void expand(){
        maxSize=maxSize*2;
        Object[] temp=new Object[maxSize];
        for(int i=0;i<length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

}
