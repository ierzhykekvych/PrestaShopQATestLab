package Pages.Prestashop.MainPage.ComponentsForMainPage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Raflection {

    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz);
    }

    public void showMethod(Object object) {

        Class clazz = object.getClass();
        Method[] method = clazz.getMethods();
        for (Method methods : method)
        {
            System.out.println(methods.getName());
        }
    }

    public void showField(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
        {
            System.out.println(field.getName());
        }
    }

    public void s() {
        List<String> list = new ArrayList<>();
        list.add("1");
        String i = list.get(0);
    }

    public void showMeth(Object object) {
        Class clazz = object.getClass();

    }

    static class Cell<T> {
        T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    public static void main(String[] args) {

        Cell<Integer> cell = new Cell<>();
        cell.setT(1);
        System.out.println(cell.getT());


        Rabbit rabbit = new Rabbit();
        Raflection raflection = new Raflection();
        raflection.showClassName(rabbit);
        raflection.showMethod(rabbit);
        raflection.showField(rabbit);

        List<Rabbit> list = new ArrayList<>();

        //List<String> list = new ArrayList<>();
        //list.add("sda");


        //for (Object lists: list) {
         //   System.out.println(lists);
        //}

    }


}
