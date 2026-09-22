public class varaiables {
    public static void main(String[] args) {
        String name = "sakthi";
        int age = 20 ;
        float num = 20 ;
        char class2 = 'c' ;
        boolean Age = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(num);
        System.out.println(class2);
        System.out.println(Age);
    }
}

//Identifiers
//All Java variables must be identified with unique names.
//These unique names are called identifiers.

//Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

//Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

//ExampleGet your own Java Server
// Good
//int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
//int m = 60;



//constants (final keyword)
//When you do not want a variable's value to change, use the final keyword.

//A variable declared with final becomes a constant, which means unchangeable and read-only:

//ExampleGet your own Java Server
//final int myNum = 15;
//myNum = 20;  // Error: cannot assign a value to final variable 'myNum'

//When to Use final?
//You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:

//Example
//final int MINUTES_PER_HOUR = 60;
//final int BIRTHYEAR = 1980;
