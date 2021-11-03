package com.yide.pojo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    private int c =1;
    private static int getCapacity(List<?> list1) throws NoSuchFieldException, IllegalAccessException {
        Class<ArrayList> arrayListClass = ArrayList.class;
        Field capacity = arrayListClass.getDeclaredField("elementData");
        capacity.setAccessible(true);
        Object[] val = (Object[]) capacity.get(list1);
        return val.length;
    }

    public static void main(String[] args) throws Exception {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.printf(list.size() + ",");
            System.out.print(getCapacity(list) + "; ");

            list.add(Long.valueOf((long) i));
        }


        System.out.println();
        for(int c=1 ; c<10; c++){
            System.out.println(c);
        }
    }
}