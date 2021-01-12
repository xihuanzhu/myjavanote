package com.test2.preflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectConstructor {
    public static void main(String[] argv){
        try {
            Class c = Class.forName("com.test2.preflect.Vip");
            Object object = c.newInstance();
            Constructor[] constructors = c.getDeclaredConstructors();
            for(Constructor constructor:constructors){
                System.out.println(constructor.getName());
                System.out.println(Modifier.toString(constructor.getModifiers()));
            }
            Constructor constructor = c.getDeclaredConstructor(int.class, String.class, int.class);
            Object o = constructor.newInstance(1, "zhu", 0);
            System.out.println(o.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
class Vip{
    int no;
    String name;
    int level;

    public Vip() {
    }

    public Vip(int level) {
        this.level = level;
    }

    public Vip(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Vip(int no, String name, int level) {
        this.no = no;
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}