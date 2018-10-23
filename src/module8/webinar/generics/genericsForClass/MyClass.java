package module8.webinar.generics.genericsForClass;

public class MyClass<T, B> {
    T doSomeThing(T t){
        System.out.println("doSomeThing method is invoked");
        return t;
    }

    B test(B b){
        System.out.println("test method is invoked");
        return b;
    }
}
