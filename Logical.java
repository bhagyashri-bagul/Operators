class Logical{
    public static void main(String args[]){
    // && operator when 2_statement are true then it returns true else any statement is false then it return false.
    // See all result of (&&) (and operator) 
        System.out.println((5>4) && (2>1)); // both are true return true
        System.out.println((5>4) && (6<5)); // (5>4) is true and (6<5) is false return false
        System.out.println((9>10) && (2<0)); // both statement (9>10)and(2<0) are false it returns false 

        // in (||) (or operator) it return true when 1 statement is true else if both statement are false then it return true only.

        System.out.println((5>4) || (2>1)); // both statement are true return true
        System.out.println((5>4) || (6<5)); // only one statement is true return true
        System.out.println((9>10) || (2<0)); // both statement are false return false 

        // ! (not operator) it make statement opposite means negative to positive and positive to negative 
        System.out.println(!(2>5));
       
        System.out.println(!(5>2));
    }
}