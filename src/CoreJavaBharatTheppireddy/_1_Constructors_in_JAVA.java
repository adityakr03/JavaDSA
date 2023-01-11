package CoreJavaBharatTheppireddy;

public class _1_Constructors_in_JAVA {  // Non-Static Member
    static {
        System.out.println("Inside the static block."); // This will execute at the first as it is a static block member.
    }

    {
        System.out.println("Inside the non-static block."); // This will be executed before the constructor as it is a non-static block member.
    }

    _1_Constructors_in_JAVA() {
        System.out.println("This is a constructor !"); // Constructor will be executed every time a new object is created.
    }

    _1_Constructors_in_JAVA(int n) { // This is a default constructor(not needed to take int n as parameter), basically a default constructor is an empty constructor.
        // Default Constructor.
    }

    public static void main(String[] args) {
        new _1_Constructors_in_JAVA(); // Here new is used for method call of the constructor(creation of object).
        System.out.println("This is inside main block.");
    }
}
