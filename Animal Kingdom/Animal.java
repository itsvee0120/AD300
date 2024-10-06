
/* Since the method makeSound is going to be abstract,
therefore, Animal class will also be declare as an
abstract class */

public abstract class Animal{

    //-----Instance Variables---//
    /* Note for myself: The "protected" keyword in Java is an access modifier
     used to restrict the visibility of a class, method,
     or variable. When a class member is marked as protected,
     it can be accessed by the members of its own class,
     its subclasses, and classes in the same package.*/

    protected String name;
    protected int age;
 


    //--------Constructor----------//

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //---------Getter/ Setter methods-------//

    public String getEat(){
        return "eat something";
    }

    public String getSleep(){
        return "sleep at night/ day";
    }

    //-------Abstract method------//
    public abstract void makeSound();

    //---------Display Info------------//
    public void displayInfo(){
        System.out.println( name + " is " + age + " years old.");
    }

}