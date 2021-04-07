package com.example.tests;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // What is printed to console?
    public static class TestArrayList {
        public static void main(String[] args) {
            List<String> array = new ArrayList<String>();
            array.add("a");
            array.add("b");
            changeThisList(array);
            System.out.println(array);
        }

        public static void changeThisList(List<String> array) {
            array.add("c");
            array.remove("b");
            array.add("d");
            array = null;
        }
    }

    // What is printed to console?
    public static class TestIntDec {
        public static void main(String[] args) {
            int i = 5;
            int j = ++i;
            int k = i++;
            System.out.println("i=" +i+ ",j=" +j+ ",k=" +k);
        }
    }

    // What is printed to console?
    public static class TestHash {
        static class Entity {
            public String name;
            public int age;

            public Entity(String name, int age) {
                super();
                this.name = name;
                this.age = age;
            }

            @Override
            public int hashCode() {
                return (name + age).hashCode();
            }
        }

        public static void main(String[] args) {
            Entity entity1 = new Entity("GO", 16);
            Entity entity2 = new Entity("WENT", 16);
            Map<Entity, String> hash = new HashMap<>();
            hash.put(entity1, "RSA-512");
            System.out.println(hash.containsKey(entity1));
            System.out.println(hash.containsKey(entity2));

            entity1.name = "WENT";

            System.out.println(hash.containsKey(entity1));
            System.out.println(hash.containsKey(entity2));
        }
    }

    // What is printed to console?
    static class Int {
        int intVal;
        double doubleVal;
        boolean boolVal;
    }

    public static class TestIntegerClass {
        public static void main(String[] args) {
            Int a = new Int();
            System.out.println(a.intVal);
            System.out.println(a.doubleVal);
            System.out.println(a.boolVal);
        }
    }

    // What is printed to console?
    public static class A {
        public static void itStatic() {
            System.out.println("it A");
        }
        public void that() {
            System.out.println("that A");
        }
    }

    public static class B extends A {
        public static void itStatic() {
            System.out.println("it B");
        }
        @Override
        public void that() {
            System.out.println("that B");
        }
    }

    public static class TestStatic {
        public static void main(String[] args) {
            A a = new A();
            a.itStatic();
            a.that();

            A aa = new B();
            aa.itStatic();
            aa.that();

            B b = new B();
            b.itStatic();
            b.that();
        }
    }

    // What is printed to console?
    public static class TestIntegerClass1 {
        public static void main(String[] args) {
            System.out.println(getSum("75", "25"));
        }

        public static int getSum(String a, String b) {
            //return (int) a + (int) b; // ??? incompatible types
            return 0;
        }
    }

    // What is printed to console?
    static class X {
        public static void main(String[] args) {
            try {
                System.out.print("A");
                badMethod();
            }
            catch (Exception ex) {
                System.out.print("B");
            }
            catch (Throwable ex1) {
                System.out.print("C");
            }
            finally {
                System.out.print("D");
            }
            System.out.print("E");
        }
        public static void badMethod() {
            throw new Error();
        }
    }

    // What is printed to console?
    public static class A1 {
        public boolean exists() {
            System.out.println("A");
            return true;
        }
    }

    public static class TestOperator {
        public static void main(String[] args) {
            A1 a = null;
            if (a == null || !a.exists())
                System.out.println("B");

            a = new A1();
            if (a == null && !a.exists())
                System.out.println("C");

            if (a.exists())
                System.out.println("D");
        }
    }

    // What is printed to console?
    public static class TestForEachLoop {
        public static void main(String[] args) {
            int[] arr1 = {1,2,3};
            for (int element : arr1) {
                System.out.println(element);
                element += 5;
            }
            System.out.println();
            for (int element : arr1) {
                System.out.println(element);
            }
            System.out.println();
        }
    }

    // What is printed to console?
    public static class TestSwitch {
        public static void main(String[] args) {
            int[] nums = {1,2,3};
            for (int i : nums) {
                switch (i) {
                    case 1:
                        System.out.println("1");
                    case 5:
                        System.out.println("5");
                    default:
                        System.out.println("D");
                    case 2:
                        System.out.println("2");
                }
            }
        }
    }

    // What is printed to console?
    public static class TestString2 {
        public static void main(String[] str) {
            String str1 = "hello";
            final String str2 = "hel";
            String str3 = "lo";

            System.out.println(str1 == str2 + str3);
            System.out.println(str1.equals(str2 + "lo"));
        }
    }

    // What is printed to console?
    static class Superclass {
        public void call() {
            System.out.println("call from Superclass");
        }
        public void callParent() {
            super.hashCode();
        }
    }
    static class Subclass extends  Superclass {
        @Override
        public void call() {
            System.out.println("call from Subclass");
        }
        @Override
        public void callParent() {
            super.call();
        }
    }
    public static class TestSuperSubClass {
        public static void main(String[] args) {
/*            Subclass a = new Superclass();
            a.call();
            a.callParent();*/

            Superclass c = new Subclass();
            c.call();
            c.callParent();
        }
    }

    // What is printed to console?
    public static class ArrayPrint {
        public static void main(String[] args) {
            int[] arr2 = {1, 2, 3};
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]);
                arr2[i] += 5;
            }
            System.out.println();
            for (int element : arr2) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    // Write java code
    // Finish implementation of stack

    public class MyStack<T> {
        private Object d[] = new Object[INITIAL_CAPACITY];
        private static final int INITIAL_CAPACITY = 10;

        // Feel free to design more variables if necessary

        public MyStack() {


        }

        public void push(T e) {


        }
        // push method adds new element into the stack
        // stack should be able to store more elements than INITIAL_CAPACITY

        public T pop() {


        }
        // pop method removes last element from the stack
        // if stack is empty then method returns null
    }

    // 19. Finish method that removes all elements from
    // the list which are single characters - it means "d", "g", "h"

    public static class Test {

        public static void main(String[] args) {
            ArrayList<String> array = new ArrayList<>();
            array.addAll(Arrays.asList("aaaaa", "bbbb", "ccc", "d", "eeee", "g", "h", "hh"));
            removeElementWithLengthEquals1 (array);
            System.out.println(Arrays.toString(array));
        }

        public static void removeElementWithLengthEquals1(ArrayList<String> list) {
            list.stream().filter(i -> {
                if (i.length() == 1) {
                    list.remove(i);
                }
                return false;
            }).collect(Collectors.toList());
        }
    }

    // 20. Finish implementation of method sort that sorts array descending using following algorithm
    // ([3] 2 8 7 9) source array, number 3 is trivially sorted
    // (3 [2] 8 7 9) we will put number 2 to correct position (it is already there)
    // (3 2 [8] 7 9) we will put number 8 to correct position (number 3 and 2 are shifted to the right, 8 goes to position 1)
    // (8 3 2 [7] 9) we will put number 7 to correct position (number 3 and 2 are shifted to the right, 7 goes to position 2)
    // (8 7 3 2 [9]) we will put number 9 to correct position (numbers 8,7,3 and 2 are shifted to the right, 9 goes to position 1)
    // (9 8 7 3 2) the complete array is sorted

    public static class TestSort {

        public static void main(String[] args) {
            int[] arr2 = {7,1,3,-2,12,4};
            sort(arr2);
            System.out.println(Arrays.toString(arr2));
        }

        public static void sort(int[] array) {

        }
        // Please keep in mind that we are interested on solution that is implemented according to sorting algorithm described above

    }

    // 21. Write SQL commands (using SQL-92 standard) that will
    // 1) Create DB tables "Orders" and "Customers"
    //    - see content of those tables in question number (21)
    //    - Define correct primary keys for both tables
    //    - Define foreign key between both tables
    // 2) Optimize table "Customers" for searching according to column "CustomerName"
    // 3) Finish SQL query "SELECT Customers.CustomerName, Order.OrderId
    //    FROM .." that will select customers and their orders, see expected result:
    //      - Alfreds Futterkiste   NULL
    //      - Ana Trujillo          1030B
    //      - Antonio Moreno        NULL

}
