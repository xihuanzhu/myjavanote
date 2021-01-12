package com.test2.parray;
import com.test1.poly.Bird;
import com.test1.poly.Cat;
import com.test1.poly.Animal;

public class Array {
    public static void main(String[] argv){
        //argv用于接收控制台用户输入的额外信息，例如java Array abf nb
        //则argv为长度为2的字符串数组，值为abf nb
        int[] array;//也可以用 int[] array;不过是c++风格，不建议使用
        //静态初始化
        int[] array1 = {1, 2, 3};
        //动态初始化
        boolean[] array2 = new boolean[5];
        print(array1);
        Animal[] animal = {new Cat(), new Bird()};
        //Cat tt = (Cat)new Animal();
        for(int i = 0; i < animal.length; i++){
            //Cat cat = (Cat)animal[i];
            animal[i].move();
        }

        //二维数组
        //静态初始化
         int [][] array3 = {array1, array1};
        //动态初始化
        int [][] array4 = new int[3][4];

        Hotel hotel = new Hotel();
        hotel.order("27");
        hotel.print();
        hotel.order("13");
        hotel.cancel("27");
        hotel.print();
    }
    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
