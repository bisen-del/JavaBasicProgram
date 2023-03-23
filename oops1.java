package com.company;

public class oops1 {
    int rno;
    String name;
    int age;
    void greeting(){
        System.out.println("hello my name is "+this.name);
    }
    oops1(int rno,String name,int age){
        this.rno=rno;
        this.name=name;
        this.age=age;
    }
    oops1(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    public static void main(String[] args) {
        oops1 manu=new oops1(13,"kunal",20);
        manu.greeting();
        oops1 rashi=new oops1(12,"rashi",13);
        rashi.greeting();
        /*System.out.println(manu.rno);
        System.out.println(manu.name);
        System.out.println(manu.age);
        oops1 rashi=new oops1(12,"rashi",18);
        System.out.println(rashi.rno);
        System.out.println(rashi.name);
        System.out.println(rashi.age);
        oops1 gati=new oops1(13,"gati");
        System.out.println(gati.rno);
        System.out.println(gati.name);*/



    }
}
