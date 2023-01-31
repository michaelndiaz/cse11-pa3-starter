class one{
    int number;

    one(int number){
        this.number = number;
    }

    boolean greaterThan(two other){
        if(number > other.number){
            return true;
        }

        else return false;
    }

}

class two{
    int number;
    two(int number){
        this.number = number;
    }

    boolean lessThan(one other){
        if(number < other.number){
            return true;
        }
        else return false;
    }
}

class ExampleClass{
    one Example1 = new one(1);
    two Example2 = new two(2);

    boolean ExpectedFalse = Example2.lessThan(Example1); //should be false since 2 < 1 is false
    boolean ExpectedFalseAlso = Example1.greaterThan(Example2); //should also be false because 1 > 2 is false
}

/*
OUTPUT OF RUNNING:

michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % javac Open1A.java
michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % ./run ExampleClass
Tester Library v.3.0
-----------------------------------
Tests defined in the class: ExampleClass:
---------------------------
ExampleClass:
---------------
new ExampleClass:1(
 this.Example1 = new one:2(
  this.number = 1)
 this.Example2 = new two:3(
  this.number = 2)
 this.ExpectedFalse = false
 this.ExpectedFalseAlso = false)
---------------
No test methods found. 

Since everything compiled properly and the expected values are found, Statement A is true.

*/