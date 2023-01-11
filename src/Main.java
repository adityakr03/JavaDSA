import java.util.Scanner;
// Introduction to OOPS.
// 1. Abstraction:-> Used to hide internal details.
// 2. Encapsulation:-> The act of putting various components together. ( in a capsule)
// In Java, encapsulation simply means that the sensitive data can be hidden from the user.
// Inheritance:-> The act of deriving new things from the existing things.
// Polymorphism:-> One entity, many forms.

// This keyword:-> It is a way for us to reference an object of the class
// which is being created/referenced.
// example: this.area = 2;
// In the above example, this is a reference to current object.

// Super keyword:-> It is a reference variable used to refer immediate parent class object.
// It can be used to:-
// :-> Refer immediate parent class instance variable.
// :-> Make parent class methods.
// :-> Invoke parent class constructors.

// Inheritance in Java.
// Inheritance is used to borrow properties and methods from an existing class.
// For instance, Phone is a base for the development of Smartphone.
// Here, we can refer Phone as the base class, and Smartphone as the derived class.
// For deriving a class from the base class, we use the "extends" keyword.
// Usage: subClass extends baseClass{}
// Below is an example of the above.

interface Bicycle {
    void applyBrake();

    void speedUp();
}

interface bicycleHorn {
    void blowHorn();
}

// Default methods in Interfaces:
// Interface 1:
interface Camera {
    void Snap();

    void Record();

    // Usage of default in Interface.
    // Default is used to prevent any error which can occur if a method
    // has been created in an interface, but is never implemented in
    // the class. So we define the default method within the interface.
    default void RecordIn4K() {
        System.out.println("Recording in 4K.");
    }
}

// Interface 2:
interface WiFi {
    void WiFi_On();

    void WiFi_Off();
}
// One more example, having Constructors in Inheritance.

interface SampleInterface {
    void meth1();

    void meth2();
}

interface child_of_SampleInterface extends SampleInterface {
    void meth3();

    void meth4();
}

interface nib {
    void changeNib();
}

interface basicAnimal {
    void eat();

    void sleep();
}

interface ring {
    void ring();
}

interface lift {
    void lift();
}

interface disconnect {
    void disconnect();
}

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("The value of x is: " + x); // Here we are accessing the variable x from the base class.
    }
}
// Question_4:

// One more example to clear the concept of Inheritance.
class animal {
    void cat() {
        System.out.println("A cat meows.");
    }

    void lion() {
        System.out.println("A lion roars.");
    }

    void cow() {
        System.out.println("A cow moos.");
    }
}

class pet extends animal {
    void dog() {
        System.out.println("A dog barks.");
    }
}

class Base1 {
    // Creation of a constructor( constructor is of the same name as of the class)

    Base1() {
        System.out.println("This is a constructor.");
    }
}
// Guess the number Game:

class Derived1 extends Base1 {
    // Creating a derived class constructor.If we invoke the derived class
    // constructor,then, 1st it will invoke the base constructor,
    // then it will execute itself.

    Derived1() {
        System.out.println("This is a derived class constructor, it will be executed only after executing the base constructor.");
    }
}

class Derived2 extends Derived1 {
    // Creating another constructor, it will be executed after executing
    // its base class, i.e., Derived1, and Derived1 will be executed after
    // executing its base class , i.e., Base1.
    Derived2() {
        System.out.println("This will execute after executing its father and grandfather class.");
    }
}

// Method overriding in Java.
// It means creation of methods with the same name in 2 or more classes
// which are based on inheritance.
class one {
    void method1() {
        System.out.println("This is a method of one.");
    }
}

// Practice problem.

class two extends one {
    @Override
    void method1() {
        System.out.println("This is an overridden method of one.");
    }
}

// Creating a custom class.
class customClass {
    int id;
    String name;

    // Generating method to print the class contents (Part of oops concept)
    void emp() {
        System.out.println("The employee id is: " + id);
        System.out.println("The name of the employee is " + name);
    }
}

// Question_1:
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

// Question_2:
class cellphone {
    String ringing() {
        return "Ringing";
    }

    String vibrating() {
        return "Vibrating";
    }
}

// Interface: An Interface consists only of abstract classes / abstract methods.
// There is not a single non-abstract method available in an Interface.

// Question_3:
class square {
    int side(int side) {
        System.out.print("The side of the Square is: ");
        return side;
    }

    int perimeter(int side) {
        System.out.print("The Perimeter of the square is: ");
        return side * 4;
    }

    int area(int side) {
        System.out.print("The Area of the square is: ");
        return side * side;
    }
}

class TommyVecetti {
    void hitting() {
        System.out.println("Hitting...");
    }

    void running() {
        System.out.println("Running...");
    }

    void firing() {
        System.out.println("Firing...");
    }
}
// Interface created.
// Now creating a class.
// Use "implements" keyword to implement the interface.

// Access Modifiers:
class access_modifier {
    private int id; // Private int, not directly accessible/modifiable. Only way to access is through a method.
    private String Name; // Private String, not directly accessible/modifiable. Only way to access is through a method.

    void setid(int i) {
        id = i; // Modifying the private int through this method.
    }

    int getid() {
        return id; // Accessing the private int through this method.
    }

    void setname(String naam) {
        Name = naam; // Modifying the private String.
    }

    String getName() {
        return Name; // Accessing the private String.
    }
}

// Constructors:
class constructor {
    // If nothing is given to the constructor, it will print the below data by default.
    private int[] empId = {2, 3, 4, 5, 6};
    private String[] empName = {"LoneDevil", "LoneWolf", "Leo", "Leo03", "Leo03.akrs"};

    void setempId(int[] Id) {
        empId = Id;
    }

    void getempId() {
        for (int j : empId) {
            System.out.println("The employee id is: " + j);
        }
    }

    void setempName(String[] EmpName) {
        empName = EmpName;
    }

    void getempName() {
        for (String s : empName) {
            System.out.println("The employee name is: " + s);
        }
    }
}

class game {
    private final int win = 46;

    int jackpot(int input, int guesses) {
        if (input == win) {
            System.out.println("Hurray! You guessed the right number in " + guesses + " guess(es)!");
            return 1;
        } else if (input < 40) {
            System.out.println("Higher Number please!");
        } else if (input > 50) {
            System.out.println("Lower Number please!");
        }
        if (input >= 40 && input <= 50) {
            System.out.println("Very near to the Jackpot!");
        }
        return 0;
    }
}

// New to me!!
// Dynamic Method Dispatch in Java.
class Phone {
    void phone() {
        System.out.println("This is a Phone.");
    }
}

class SmartPhone extends Phone {
    void phone() {
        System.out.println("This is a SmartPhone.");
    }
}

// Inheritance In Interfaces:

class circle {
    int radius = 5;

    void perimeter() {
        System.out.println("The perimeter of circle is: " + 2 * Math.PI * radius);
    }

    void area() {
        System.out.println("The area of circle is: " + radius * Math.PI * radius);
    }
}

// Using inheritance in Interface:

class cylinder extends circle {
    int height = 10;

    void areaOfCylinder() {
        System.out.printf("Curved Surface Area of Cylinder is: %f\n", 2 * Math.PI * radius * height);
        System.out.printf("Surface Area of Cylinder is: %f\n", (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
    }

    void volume() {
        System.out.println("The volume of the cylinder is: " + Math.PI * radius * radius * height);
    }
}

// Implementing Inherited interface in a class.

// Abstract method is a method that is declared without an implementation.
// Abstract class is a class which includes abstract methods. It should be
// declared using abstract keyword, or it will throw error.
abstract class abs {
    abstract void met();
}

/*
Polymorphism in Java is mainly divided into two types.
    1.Compile-time polymorphism
    2.Runtime polymorphism
Compile-time polymorphism can be achieved by method overloading,
and Runtime polymorphism can be achieved by method overriding.
*/

// Practice set on Interfaces, polymorphism:

class abs_method_usage extends abs {
    @Override
    void met() {
        System.out.println("This is an implementation of abstract method of abstract class using its derived class.");
    }
}

class MotorCycle implements Bicycle, bicycleHorn {    // Here we apply multiple inheritance.

    // Always use public access modifier in overridden methods of interfaces.
    @Override
    public void applyBrake() {
        System.out.println("Applying Brakes...!");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding Up...!");
    }

    @Override // Using method from different interface.
    public void blowHorn() {
        System.out.println("Horn Blow!!!");
    }
}

class MyCellPhone {
    // Here we have not defined the Record() method, so default method
    // of record() will prevent any error from occurring due to this
    // by executing the default method defined in the interface.
    void call() {
        System.out.println("Calling a number...");
    }

    void pickCall() {
        System.out.println("Picking a call...");
    }
}

class SmartPh0ne extends MyCellPhone implements WiFi, Camera {
    public void Snap() {
        System.out.println("Taking Snap...");
    }

    public void Record() {
        System.out.println("Recording Video...");
    }

    public void WiFi_On() {
        System.out.println("Turning on wifi...");
    }

    public void WiFi_Off() {
        System.out.println("Turning off wifi...");
    }
}

class mySampleClass implements child_of_SampleInterface {
    // We have to implement the meth1() and meth2() of SampleInterface also
    // because these methods are also inherited in child_of_SampleInterface.
    public void meth1() {
        System.out.println("This is method 1.");
    }

    public void meth2() {
        System.out.println("This is method 2.");
    }

    public void meth3() {
        System.out.println("This is method 3.");
    }

    public void meth4() {
        System.out.println("This is method 4.");
    }
}

abstract class pen {
    abstract void write();

    abstract void refill();
}

class usePen extends pen {
    @Override
    void write() {
        System.out.println("Writing with pen...");
    }

    @Override
    void refill() {
        System.out.println("Refilling pen...");
    }
}

class FountainPen extends usePen implements nib {
    public void changeNib() {
        System.out.println("Changing Nib...");
    }
}

class monkey {
    void bite() {
        System.out.println("Biting!!!");
    }

    void jump() {
        System.out.println("Jumping!!!");
    }
}

class human extends monkey implements basicAnimal {
    public void eat() {
        System.out.println("Eating!!!");
    }

    public void sleep() {
        System.out.println("Sleeping!!!");
    }
}

abstract class telePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends telePhone implements ring, lift, disconnect {
    public void ring() {
        System.out.println("Ringing the Phone...");
    }

    public void lift() {
        System.out.println("Lifting the Phone...");
    }

    public void disconnect() {
        System.out.println("Disconnecting the Phone...");
    }
}

// Miscellaneous Classes.

class Aditya {
    static void mul(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", x, i, x * i);
        }
    }

    static int sumn(int n) {
        if (n == 0)
            return 0;
        return n + sumn(n - 1);
    }

    static void pattern1() {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int x) {
        if (x == 1 || x == 2)
            return x - 1;
        return fib(x - 1) + fib(x - 2);
    }

    // Methods in JAVA. (Methods in java are similar as functions in C.)
    // Methods are always written inside a class.
    // Arguments are actual, parameters have copy of Arguments.
    static int fun(int x, int y) {  // int x and int y are parameters.
        int z;                     // int z is argument.
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // Method Overloading: Multiple methods with the same name, but having different parameters.
    static void fun() { // Here same method name exists above, but they have different parameters, so no errors thrown by the compiler.
        System.out.println("Good Morning, Aditya!");
    }

    // Varargs
    static int sum(int... arr) { // Puts all the arguments inside an array, e.g. int a,int b, int c and so on... is stored in []sum array.
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    // Recursion.
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
/*
 //Below is the code to supply commands to the terminal.

         Runtime runtime = Runtime.getRuntime();
         try{
             System.out.println("Shutting Down");
             //noinspection deprecation
             runtime.exec("reboot");
         }
         catch(IOException e){
             System.out.println("Oops! Something went wrong");
         }
*/

        /* Naming conventions:No spaces allowed.
         * AddTwoNumbers:->> Pascal naming convention.(used for Classes.)
         * addTwoNumbers:->> camel case naming convention.
         */

        // Typecasting in Java:
        int x = 100 + (int) 5.1;

        fun();
        System.out.println(fun(3, 4));
        System.out.println(sum(4, 5, 6, 7)); // Here we can put n numbers , it will be stored in an array in varargs function.
        System.out.println(fact(4));
        // Using our custom class to enter and retrieve information.
        customClass eid = new customClass();
        customClass ename = new customClass();
        eid.id = 2;
        eid.name = "Akash";
        ename.id = 1;
        ename.name = "Aditya";
        eid.emp();
        ename.emp();
        // Custom class usage ended!

        //Practice set Code WithHarry.

        // Question_1:

        Employee1 emp1 = new Employee1();
        emp1.setName("Aditya");
        emp1.salary = 50000000;
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

        // Question_2:

        cellphone state = new cellphone();
        System.out.println(state.ringing());
        System.out.println(state.vibrating());

        // Question_3:

        System.out.print("Enter the side of the square: ");
        Scanner side = new Scanner(System.in);
        int Side = side.nextInt();
        square square = new square();
        System.out.println(square.side(Side));
        System.out.println(square.perimeter(Side));
        System.out.println(square.area(Side));

        // Question_4:

        TommyVecetti act = new TommyVecetti();
        act.running();
        act.firing();
        act.hitting();

        // Access Modifiers:

        access_modifier id = new access_modifier();
        id.setid(1);
        System.out.println(id.getid());
        id.setname("Lone Devil");
        System.out.println(id.getName());

        // Constructor:

        constructor emp = new constructor();
        emp.setempId(new int[]{1, 7, 8, 9}); // Comment this line to print the contents of the constructor.
        emp.getempId();
        emp.setempName(new String[]{"Aditya Kumar", "Ankit", "Aman", "Arun"}); // Comment this line to print the contents of the constructor.
        emp.getempName();

        // Guess the number Game:

        System.out.print("Enter a number (0-100) to guess the jackpot number: ");
        Scanner in = new Scanner(System.in);
        int put = in.nextInt();
        game iput = new game();
        int guesses = 1;
        while (iput.jackpot(put, guesses) == 0) {
            System.out.print("Let's try again, enter number again: ");
            in = new Scanner(System.in);
            put = in.nextInt();
            guesses++;
        }

        // Using Inheritance:
        pet animal = new pet();
        // Here, we are accessing the contents of the animal class by calling its derived class pet.
        animal.cat();
        animal.cow();
        animal.lion();
        animal.dog();

        /*
 Constructors in Inheritance.

        Base1 base1 = new Base1(); // This line is enough to trigger the constructor.
        base1.setX(56);
        System.out.println(base1.getX());
*/

        Derived1 derived1 = new Derived1(); // Invoking the derived class constructor.
        Derived2 derived2 = new Derived2(); // Invoking the derived class constructor
        // which will invoke derived class of base class and the order of
        // execution will be from base to derived class 1 then to this class
        // (Upwards to Downwards).

        // Method overriding in Java.
        one one = new one();
        one.method1();
        two two = new two();
        two.method1();

        // Dynamic Method Dispatch.
        // Now here comes the magic of Dynamic Method Dispatch.
        Phone phone = new SmartPhone();
        // We can create object using Base class referring/invoking the Derived class at runtime.
        // The reverse is not possible, i.e,
        // SmartPhone phone = new Phone will throw error.
        // So we can use object of base class to invoke Derived class, but vice-versa is not allowed.
        phone.phone(); // This will call the method of SmartPhone as we have created the object for the reference of SmartPhone.

        // Practice Problem.

        cylinder dim = new cylinder();
        dim.perimeter();
        dim.area();
        dim.areaOfCylinder();
        dim.volume();

        // Abstract class & abstract method Implementation.
        // Abstract classes can not have any objects created for them.
        // But we can create the objects for the derived classes of the abstract class.
        abs_method_usage abs = new abs_method_usage();
        abs.met();

        // Interfaces:- We use interfaces because...
        // Multiple Interfaces can be used to create a single class.
        // Which makes it possible for multiple inheritance in Java.

        MotorCycle Moto = new MotorCycle();
        Moto.applyBrake();
        Moto.speedUp();
        Moto.blowHorn();

        // Interfaces and default methods.

        SmartPh0ne phn = new SmartPh0ne();
        phn.call();
        phn.pickCall();
        phn.Snap();
        phn.Record();
        phn.WiFi_On();
        phn.WiFi_Off();
        // It will be executed by default method if not overridden in the
        // class which implements its interface.
        phn.RecordIn4K();

        // Polymorphism:

        Camera cam = new SmartPh0ne(); // This is a smartphone but, use it as a camera.
        cam.Record(); // This method will work as it is related to camera.
        cam.RecordIn4K(); // This will also work as it is defined in Camera Interface.
        cam.Snap(); // This is also inside Camera Interface, so it will also run.
        /*
        cam.call()
        will throw error as call method is not inside Camera interface.
        */

        MyCellPhone ph = new SmartPh0ne();
        // Here we can only use the calling facility of smartphone.
        ph.call();
        ph.pickCall();

        SmartPh0ne sm = new SmartPh0ne();
        // So now we can use all the functionalities of smartphone.
        sm.WiFi_On();
        sm.Record();
        sm.Snap();
        sm.call();
        sm.WiFi_Off();
        sm.pickCall();
        sm.RecordIn4K();

        /*
         * Here we see that Smartphone is a collection of numerous features but
         * with the help of polymorphism, we can restrict a user to only use a
         * specific interface of Smartphone.
         * */

        // Practice set on Interfaces, polymorphism:

        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        human human = new human();
        human.bite();
        human.eat();
        human.jump();
        human.sleep();

// Miscellaneous Programs:

        System.out.println(1 + 2);
        System.out.println("1" + "2");
        System.out.println("My Name is Aditya.");
        System.out.println("Aditya" + " " + "is" + " " + "no." + " " + 1);
        System.out.println('A' + 'b' + " " + "is the sum of the ASCII values of A and b.");
        System.out.println('A' + '5' + " " + "is the sum of the ASCII values of A and 5.");
        byte b = 12;
        char ch = 'A';
        int j;
        float f = 4.5f; // Mandatory to use 'f' or 'F' for float. Otherwise, it will be defaulted to Double.
        double dd = 4.5d; // Not Mandatory to use 'd' or 'D' for double.
        short s = 266; // Not Mandatory to use 's' or 'S' for short.
        long ln = 78908043L; // Mandatory to use 'l' or 'L' for long. Otherwise, it will be defaulted to int.
        String str = "Aditya"; // String is always in capital.
        System.out.println("Byte: " + b);
        System.out.println("Char: " + ch);
        System.out.println("Float: " + f);
        System.out.println("Double: " + dd);
        System.out.println("Short: " + s);
        System.out.println("Long: " + ln);
        System.out.println("String: " + str);
        int n1 = 10;
        int n2 = 11;
        int n3 = 12;
        int sum = n1 + n2 + n3;
        System.out.println("The sum of the 3 numbers is : " + sum);
        // For taking input.
        Scanner sc = new Scanner(System.in); // Stores the value entered by the user. System.in means system input.
        System.out.println("Enter the number of times for the loop to occur : ");
        int num1 = sc.nextInt(); // Value stored by the user is passed to a new variable.
        // For loop in JAVA.
        int ptr;
        for (ptr = 4; ptr > 0; ptr--) {
            for (j = 0; j < ptr; j++) {
                System.out.print("*"); // * pattern
            }
            System.out.print("\n");
        }
        int feven = 6, fsum = 0; // Sum of 1st 5 even numbers.
        for (int i = 0; i < feven; i++) {
            fsum += 2 * i;
        }
        System.out.println(fsum);
        // Table of 8.
        int mul = 8;
        int summ = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("8 x %d = %d\n", i, mul * i);
            summ += mul * i;
        }
        System.out.println("Sum of the table of 8 is = " + summ);
        int i;
        for (i = 0; i < num1; i++) {
            if (i == 2) {
                continue; // it will skip printing when i = 2, it will jump to i = 3.
            }
            System.out.println("Loop : " + i);
        }
        // While loop in JAVA.
        i = 0;
        while (i < 5) {
            System.out.println("Hello " + i + " time.");
            i++;
        }
        // Do-While loop in JAVA.
        i = 0;
        do {
            System.out.println("Aditya");
            i++;
        }
        while (i < 3);

        System.out.println("Taking input from the user");
        Scanner str1 = new Scanner(System.in);
        String string = str1.nextLine(); // If using str1.next we get only 1st word of the string input by the user.
        System.out.println(string);
        Scanner marks = new Scanner(System.in);
        float sub1, sub2, sub3, sub4, sub5, t0tal;
        do {
            System.out.print("Enter the marks in sub1: ");
            sub1 = marks.nextFloat();
            if (sub1 < 0 || sub1 > 100) {
                System.out.println("Invalid Marks entered! ");
            }
        }
        while (sub1 < 0 || sub1 > 100);
        do {
            System.out.print("Enter the marks in sub2: ");
            sub2 = marks.nextFloat();
            if (sub2 < 0 || sub2 > 100) {
                System.out.println("Invalid Marks entered! ");
            }
        }
        while (sub2 < 0 || sub2 > 100);
        do {
            System.out.print("Enter the marks in sub3: ");
            sub3 = marks.nextFloat();
            if (sub3 < 0 || sub3 > 100) {
                System.out.println("Invalid Marks entered! ");
            }
        }
        while (sub3 < 0 || sub3 > 100);
        do {
            System.out.print("Enter the marks in sub4: ");
            sub4 = marks.nextFloat();
            if (sub4 < 0 || sub4 > 100) {
                System.out.println("Invalid Marks entered! ");
            }
        }
        while (sub4 < 0 || sub4 > 100);
        do {
            System.out.print("Enter the marks in sub5: ");
            sub5 = marks.nextFloat();
            if (sub5 < 0 || sub5 > 100) {
                System.out.println("Invalid Marks entered! ");
            }
        }
        while (sub5 < 0 || sub5 > 100);


        t0tal = sub1 + sub2 + sub3 + sub4 + sub5;
        float Percentage = t0tal * 0.2f;
        if (sub1 <= 100 && sub2 <= 100 && sub3 <= 100 && sub4 <= 100 && sub5 <= 100) {
            System.out.println("The percentage is: " + Percentage + "%");
        } else {
            System.out.println("Invalid makrs Entered!");
        }

        System.out.println("Enter your name: ");
        Scanner str2 = new Scanner(System.in);
        String str3 = str2.nextLine();
        System.out.printf("%s", str3);    // here print/printf does not add another line after printing its content.
        System.out.println(" is OP.");
        System.out.printf("Hello %s, have a good Day!\n", str3);
        System.out.println("Enter a number to check if it is an integer or not: ");
        Scanner intcheck = new Scanner(System.in);
        System.out.println(intcheck.hasNextInt());
        // Typecasting Example:-
        char grade = 'A';
        // Encrypting the grade by adding 8.
        grade = (char) (grade + 8); // Typecasting in the variable.
        System.out.println(grade);
        // Decrypting the grade by subtracting 8.
        System.out.println((char) (grade - 8)); // Typecasting in print statement.
        int u = 9;
        float v = 8.8f;
        // Using printf in JAVA.
        System.out.printf("The value of u is %d and v is %f\n", u, v);
        System.out.printf("The value of u is %d and v is %.2f\n", u, v);
        // Finding length of String using .length() function.
        int NameLen = str3.length();
        System.out.println(str3 + " has a length of : " + NameLen);
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        String MyName = "   Aditya   ";
        System.out.println(MyName); // Prints with the spaces Included.
        MyName = MyName.trim();
        System.out.println(MyName.length()); // Does not count for the spaces.
        System.out.println(MyName); // Prints after removing the spaces.
        System.out.println(str3.substring(2)); // Concatenation of String.
        System.out.println(str3.substring(2, 5)); // Concatenation of String.
        System.out.println(str3.replace(' ', '_'));
        System.out.println(str3.replace("Aditya", "Sanjay"));
        System.out.println(str3.startsWith("Ad"));
        System.out.println(str3.endsWith("ya"));
        System.out.println(str3.charAt(2)); // It will print 'i' from Aditya.
        System.out.println(str3.indexOf('a')); // it will print '5' from Aditya, not the 'a' from Kumar.
        System.out.println(str3.indexOf('a', 6)); // it will not print '5' from Aditya, but will print index of 'a' i.e. 10 from Kumar.
        System.out.println(str3.lastIndexOf("a"));
        System.out.println(str3.equals("Aditya Kumar"));
        System.out.println(str3.equalsIgnoreCase("aditya kumar")); // It will ignore the upper/lower case in the string.
        int age;
        System.out.print("Enter Your Age: ");
        Scanner age1 = new Scanner(System.in);
        age = age1.nextInt();
        // Example of traditional switch case.
        switch (age) {
            case 10:
                System.out.println("You are a Child!");
                break;
            case 100:
                System.out.println("You are experienced!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.print("Enter a date(1-7): ");
        // Example of Enhanced switch case. (No need to use break statement.)
        Scanner date = new Scanner(System.in);
        int day = date.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        // ARRAYS in JAVA.
        int[] mark = new int[5]; // Array Declaration in java.
        // int [] mark = {12,34,56,45,56};
        for (j = 0; j < mark.length; j++) {
            System.out.printf("Enter marks for Subject %d: ", j + 1);
            Scanner subject = new Scanner(System.in);
            int subj = subject.nextInt();
            mark[j] = subj;
        }
        for (j = 0; j < mark.length; j++) {
            System.out.printf("Marks for Subject %d is %d\n", j + 1, mark[j]);
        }
        // Using arrays in Strings.
        String[] Students = {"Aditya", "Aman", "Akash", "Ankit"};
        System.out.println(Students.length);
        System.out.println(Students[3]);
        // Using For-Each loop.
        System.out.println("Printing the array using for each loop.");
        for (int element : mark) {
            System.out.println(element);
        }
        // Reversing the array.
        String temp;
        int l = Students.length;
        int n = Math.floorDiv(l, 2);
        for (i = 0; i < n; i++) {
            temp = Students[i];
            Students[i] = Students[l - i - 1];
            Students[l - i - 1] = temp;
        }
        for (i = 0; i < Students.length; i++) {
            System.out.println(Students[i]);
        }
        //  2-D Arrays in JAVA.
        int[][] a2ry; // 2-D Array.
        a2ry = new int[2][3];   // It means 2 rows and 3 columns.
        // Taking input into the 2-D array.
        for (j = 0; j < 2; j++) {
            for (s = 0; s < 3; s++) {
                System.out.printf("Enter the element of a2ry[%d][%d]: ", j, s);
                Scanner array = new Scanner(System.in);
                int size = array.nextInt();
                a2ry[j][s] = size;
            }
        }
        for (j = 0; j < 2; j++) {
            for (s = 0; s < 3; s++) {
                System.out.printf("\t%d\t", a2ry[j][s]);
            }
            System.out.print("\n");
        }
        // Program to search for element in an array.
        int[] ele = {12, 47, 34, 45, 32, 23};
        for (i = 0; i < ele.length; i++) {
            if (ele[i] == 47) {
                System.out.println("Element found at location " + i);
                break;
            } else {
                System.out.println("Element not found at location " + i + " !");
            }
        }
        // Addition of 2 Matrices.
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        System.out.println("Addition of matrices.");
        for (j = 0; j < 2; j++) {
            for (s = 0; s < 2; s++) {
                System.out.printf("Enter the element of matrix_1[%d][%d]: ", j, s);
                Scanner array = new Scanner(System.in);
                int size = array.nextInt();
                matrix1[j][s] = size;
            }
        }
        for (j = 0; j < 2; j++) {
            for (s = 0; s < 2; s++) {
                System.out.printf("Enter the element of matrix_2[%d][%d]: ", j, s);
                Scanner array = new Scanner(System.in);
                int size = array.nextInt();
                matrix2[j][s] = size;
            }
        }
        for (j = 0; j < 2; j++) {
            for (s = 0; s < 2; s++) {
                System.out.printf("\t%d\t", matrix1[j][s] + matrix2[j][s]);
            }
            System.out.print("\n");
        }
        int[] numarr = {14, 21, 336, 54, 59, 69};
        int max = 0;
        for (i = 0; i < numarr.length; i++) {
            if (numarr[i] > max) {
                max = numarr[i];
            }
        }
        System.out.println(("The biggest element in the array is " + max));
        // Bubble Sort in JAVA.
        int tempo;
        for (i = 0; i < numarr.length - 1; i++) {
            if (numarr[i] > numarr[i + 1]) {
                tempo = numarr[i];
                numarr[i] = numarr[i + 1];
                numarr[i + 1] = tempo;
            }
        }
        for (i = 0; i < numarr.length; i++) {
            System.out.println(numarr[i]);
        }
        mul(5);
        pattern1();
        System.out.println(sumn(4));
        System.out.println(fib(5));
        // We can use Math.PI to initiate the value of PI.
        System.out.println("The area of a circle having radius 1 is: " + Math.PI * 1 * 1);
    }
}

