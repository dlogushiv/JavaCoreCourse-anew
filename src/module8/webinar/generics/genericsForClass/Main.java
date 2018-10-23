package module8.webinar.generics.genericsForClass;

public class Main {
    public static void main(String[] args) {
        // I can create MyClass object without generics, but this is bad practice
        // MyClass myClass=new MyClass();
        MyClass<Too, Boo> myClass=new MyClass<>();

        // too example
        Too too1 = new Too();
        Too too2 =myClass.doSomeThing(too1);
        if (too2!=null){
            System.out.println("it works");
        }

        // boo example
        Boo boo=new Boo();
        myClass.test(boo);
    }
}
