package com.test2.pthread;

public class T {
     public  static void main(String[] argv){
         F g = new F();
         g.print();
     }
}
class K{
    int a = 1;

}
class G extends K{
    int  a = 2;
    public void printt(){
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
class F extends  G{
    public void print(){
        System.out.println(this.toString());
        System.out.println(super.toString());
        super.printt();
    }
}
