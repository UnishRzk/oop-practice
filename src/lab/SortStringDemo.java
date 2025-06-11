package lab;

/**
 * @author Unish Rajak
 */

import java.util.Arrays;

public class SortStringDemo {
    public static void main(String[] args) {
        String[] namelist = {"kamal", "Indra", "tek", "Prashant", "Pramod", "Praveen"};
        Arrays.sort(namelist, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted names:");
        for (String name : namelist) {
            System.out.println(name);
        }
    }
}
