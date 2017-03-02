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
      
    public void insert(int i,Object obj)throws Exception{//˳���� ����  
        if(size==maxSize)  
            throw new Exception("˳����������޷����룡");  
        if(i<0||i>size)  
            throw new Exception("����λ�ò����ڣ�");  
          
        //for(int j=i;j<=size;j++)   
        //  arrayList[j+1]=arrayList[j];�ⲻ��ÿ�������ˣ����ǰѺ����ÿ�������arrayList[j]  
          
        for(int j=size;j>i;j--){//�������ʵ�������ĺ���~!!  
            arrayList[j]=arrayList[j-1];  
        }     
           
        arrayList[i]=obj;  
        size++;  
    }  
      
    public Object delete(int i)throws Exception{//˳��� ɾ��  
        if(size==0)  
            throw new Exception("˳�����Ϊ��");  
        if(i<0||i>size)  
            throw new Exception("ɾ��λ�ò����ڣ�");  
        Object obj=arrayList[i];  
        for(int j=i;j<size;j++){  
            arrayList[j]=arrayList[j+1];//ǰ��~  
        }  
        size--;  
        return obj;  
    }  
      
    public Object getData(int i)throws Exception{//ȡֵ  
        if(i<0||i>size)  
            throw new Exception("��λ�ò����ڣ�");  
        return arrayList[i];  
    }  
    public int getSize(){//��С  
        return size;  
    }  
    public boolean isEmpty(){//�Ƿ�Ϊ��  
        return size==0;  
    }  
}  