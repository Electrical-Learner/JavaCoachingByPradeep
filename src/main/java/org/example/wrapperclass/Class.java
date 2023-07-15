package org.example.wrapperclass;

public class Class {
    public static void main(String[] args) {
        Class c1 = new Class();
        c1.test(10);
    }

    class c1 {
        void test(double d) {
            System.out.println("double argument method");
        }

//        void test(int d) {
//            System.out.println("double argument method");
//        }
//
//        void test(Integer intObj) {
//            System.out.println("Integer argument method");
//        }
//
//        void test(Number Num) {
//            System.out.println("Number argument method");
//        }
//
//        void test(Object obj) {
//            System.out.println("object argument method");
//        }

    }


    void test(Integer intObj) {
        System.out.println("Integer argument method");
    }
}

