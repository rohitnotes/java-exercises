package _f_classes._f_1_nested_class._f_1_1_non_static_nested_class;

public class OuterClass {

    public class InnerClass{
    }

    public InnerClass instantiate(){
        return new InnerClass();
    }

    public static void innerClassInstantiation(){
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass instance1 = outerClass.instantiate();
        OuterClass.InnerClass instance2 = outerClass.new InnerClass();
    }


}
