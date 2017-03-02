package com.java_stru;
 
public class SeqList {  
    private int maxSize;  
    private int size;  
    private Object[] arrayList;  
    public SeqList(int sz){  
        maxSize=sz;  
        size=0;  
        arrayList=new Object[sz];  
    }  
      
    public void insert(int i,Object obj)throws Exception{//顺序表的 插入  
        if(size==maxSize)  
            throw new Exception("顺序表已满，无法插入！");  
        if(i<0||i>size)  
            throw new Exception("插入位置不存在！");  
          
        //for(int j=i;j<=size;j++)   
        //  arrayList[j+1]=arrayList[j];这不是每个后移了，这是把后面的每个都变成arrayList[j]  
          
        for(int j=size;j>i;j--){//这个才能实现真正的后移~!!  
            arrayList[j]=arrayList[j-1];  
        }     
           
        arrayList[i]=obj;  
        size++;  
    }  
      
    public Object delete(int i)throws Exception{//顺序表 删除  
        if(size==0)  
            throw new Exception("顺序表已为空");  
        if(i<0||i>size)  
            throw new Exception("删除位置不存在！");  
        Object obj=arrayList[i];  
        for(int j=i;j<size;j++){  
            arrayList[j]=arrayList[j+1];//前移~  
        }  
        size--;  
        return obj;  
    }  
      
    public Object getData(int i)throws Exception{//取值  
        if(i<0||i>size)  
            throw new Exception("该位置不存在！");  
        return arrayList[i];  
    }  
    public int getSize(){//大小  
        return size;  
    }  
    public boolean isEmpty(){//是否为空  
        return size==0;  
    }  
}  