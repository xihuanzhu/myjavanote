package com.test2.pannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectAnnotation {
    public static void main(String[] argv){
        try {
            Class c = Class.forName("com.test2.pannotation.Annotation1");
            System.out.println(c.isAnnotationPresent(Annotation3.class));
            System.out.println(c.getDeclaredAnnotations());
            //get和getDeclare的区别就是前者只能读public，后者可以读所有
            Annotation3  annotation3 = (Annotation3)c.getDeclaredAnnotation(Annotation3.class);
            System.out.println(annotation3.value());//获取注解属性值
            for(Annotation annotation:c.getDeclaredAnnotations()){
                System.out.println(annotation);
            }
            Method method = c.getDeclaredMethod("doS");
            System.out.println(method.isAnnotationPresent(Annotation2.class));
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
