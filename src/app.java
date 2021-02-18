import com.design_patterns.patterns;

public class app {

    public static void main(String[] args)
    {
        System.out.println("Design Patterns");
        System.out.println("-------------------");

        patterns basic = new patterns();
        System.out.println("Strategy Pattern");
        basic.strategyPattern();

        System.out.println("-------------------");
        System.out.println("Factory Pattern");
        basic.factoryPattern();

        System.out.println("-------------------");
        System.out.println("Builder Pattern");
        basic.builderPattern();
    }
}
