class boofieg{

    boolean bigger(int one, int two){
        if(one > two){
            return true;
        }
        else return false;
    }

    int addition(int one, int two){
        return one + two;
    }

    boolean bigTest = bigger(1, 0); //expected true
    int addTest = addition(1, 2); //expected 3
}

/*
 * OUTPUT: 
 * 
 * michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % javac Open1C.java
michaeldiaz@Michaels-MacBook-Pro cse11-pa3-starter % ./run boofieg    
Tester Library v.3.0
-----------------------------------
Tests defined in the class: boofieg:
---------------------------
boofieg:
---------------
new boofieg:1(
 this.bigTest = true
 this.addTest = 3)
---------------
No test methods found.

Since everything compiled well and our expected values are found, Statment C is true.
 */