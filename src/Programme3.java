public class Programme3 {

    /**
     * Write a Java programme using the following steps.
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String Surname = "Testing";

    //3.2 Declare one instance method.
    //3.4  Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme3.Surname);
    }

    //3.3 Declare one static method .
    //3.4Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme3 Programme3 = new Programme3();
        System.out.println(Programme3.name);
        System.out.println(Surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme3 Programme3 = new Programme3();
        Programme3.instanceMethod();
        staticMethod();
    }
}
