class second{
    int number;
    double number;

    second(int number, double number){
        this.number = number;
        this.number = number;
    }
}

/*
 * OUTPUT:
 * 
 * michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % javac Open1B.java
Open1B.java:3: error: variable number is already defined in class second
    double number;
           ^
Open1B.java:5: error: variable number is already defined in constructor second
    second(int number, double number){
                              ^
Open1B.java:6: error: incompatible types: possible lossy conversion from double to int
        this.number = number;
                      ^
Open1B.java:7: error: incompatible types: possible lossy conversion from double to int
        this.number = number;
                      ^
4 errors
michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % 

Since we have a compile error here due to the fact that these fields have the same name, Statement B is false.
 */