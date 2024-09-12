package oop.chapt5_8;

import java.lang.reflect.Method;

class Starter {
    public static void main(String[] args) {
        ClassA ref_a = new ClassA();
        Class c = ref_a.getClass();
        System.out.println("ref_a is an instance of " + c.getName());
        Method[] methods = c.getMethods();
        System.out.println("<method name list>");
        for (int i=0; i<methods.length; i++) {
            System.out.println("[" + i + "] " + methods[i].getName());
        }
    }
}

class ClassA {
    public ClassA() {
        super();
    }
    public void methodA() {
    }
}
