/*
Benefits of using OOP:

    Implements D.R.Y. (Don't Repeat Yourself) code
    Makes our application scalable.
    Makes our code reusable. 
    Makes our applications easily maintainable.
*/

/*
Encapsulation

Encapsulation is the idea that we can group code together into objects that will behave in an expected way. Encapsulation in Java involves controlling access to properties or methods with access modifiers and limiting control to the inner scope where necessary. For example, if you wanted to get the max number of cups of coffee your coffee maker will make, you expect to get a number back, and for the calculation formula to remain consistent no matter which model coffee maker.
*/

public class CoffeeMaker {
    protected int maxVolumeOz;
    protected String milk;
    
    public CoffeeMaker(int maxVolumeOz) {
        this.maxVolumeOz = maxVolumeOz;
    }
                
    public int getMaxVolumeOz() {
        return this.maxVolumeOz;
    }
    
    public int getMaxServings() {
        return this.maxVolumeOz / 8;
    }
    
    public void brew(String beans) {
    	System.out.println("Brewing coffee");
    }
}

/*
Inheritance

Inheritance is the idea that we pass along attributes and methods from one class into a "sub-class" or child class, and not have to re-write the code to make it work.  Child classes can be more specific versions of their Parent class.  Using the key word "super" will call methods
*/

class CappuccinoMaker extends CoffeeMaker {
    
    public CappuccinoMaker(int maxVolumeOz) {
        super(maxVolumeOz);
        this.milk = "whole";
    }
    
    public void makeCappuccino(String beans) {
        super.brew(beans);
        System.out.println("Smooth.");
    }
}

/*
Polymorphism

Polymorphism means "many forms", and the idea in OOP is that a Child class can have a different version of a method than the Parent class. In this example the child class of CappuccinoM has a clean method, and so does CoffeeM. Depending on the class, the clean method will do different things.
*/

public class CappuccinoMaker extends CoffeeMaker {
    private String milk;
    public CappuccinoMaker() {
        this.maxVolumeOz = 16;
        this.milk = whole;
    }
                  
    public void brew(String beans) {
		super.brew(beans);
        System.out.println("Frothy!!!");
    }
                  
    public void clean(){
        System.out.println("Cleaning the froth!");
    }
}

/*
Abstraction

Abstraction is an extension of Encapsulation, and we can hide attributes or methods that a Barista doesn't need to know about, like a CoffeeM. That way the Barista can make a cup of coffee in a simpler manner.
*/

class Barista {
    
    private String name;
    private CoffeeMaker;
    
    public Barista(String name) {
        this.name = name;
        this.cafe = new CoffeeMaker(40);
    }
    
    public void makeCoffee() {
        this.cafe.brew();
    }
}