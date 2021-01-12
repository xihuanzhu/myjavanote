package com.test2.preflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectMethod {
    public static void main(String[] argv) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c = Class.forName("com.test2.preflect.UserService");
        Object object = c.newInstance();
        Method[] methods = c.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getReturnType());
            System.out.println(method.getName());
            System.out.println(Modifier.toString(method.getModifiers()));
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType:parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }
            //可以反编译方法的声明
        }

        Method method = c.getDeclaredMethod("login", String.class, String.class);
        method.invoke(object, "zhu", "ds");

        doSome('a');
        doSome('a', 1, 2, 2, 3);
    }
    public static void doSome(char a, int... args){
        //可变长度参数,一定在参数列表最后一个，且只能有一个可变长度参数
        //可以将可变长度参数当成一个数组
        for(int f:args){
            System.out.println(f);
        }
    }
}
class UserService{
    public boolean login(String name, String password){
        System.out.println("login");
        return true;
    }

    public void logOut(){

    }

}