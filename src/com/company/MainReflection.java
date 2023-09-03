package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        Resume r = new Resume(4);
        Field field = r.getClass().getDeclaredField("id");
        field.setAccessible(true);
        Integer rid =(Integer) field.get(r);
        System.out.println(rid);
     /*   Field field1 = r.getClass().getDeclaredFields()[0];
        field1.setAccessible(true);
        System.out.println(field1.getName());
        System.out.println(field1.get(r));
        field1.set(r, 3);
        System.out.println(r);*/

        Class resume = Class.forName("com.company.Resume");
        Field fid = resume.getDeclaredField("id");

        System.out.println("Type "+ fid.getType());
        Field [] fields = resume.getDeclaredFields();
        for (Field fiel: fields){
            System.out.println("Type of " +  fiel.getName() + " = " + fiel.getType());
        }
        Method someMethod1 = resume.getMethod("toString");
        System.out.println("Return type method = " +
                someMethod1.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod1.getParameterTypes()));





    }
}
