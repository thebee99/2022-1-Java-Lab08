package edu.handong.csee.java.hw2.math;


/**This is a MathCalculator class, which each functions for calculation process inserted*/
public class MathCalculator {

    //Set a getName constructor for both JC and JH
    private String name;
    //private int number1;
    //private String JH;
           


    // public String getName(){
    //     return JC; 
    //     return JH;
    // }
    /**This is a method function for the user set any names*/
    public void setName(String name) {
        this.name = name;
        //this.JH = JH;
    }

    /**This is a method function for computer to get a name inserted by the user*/
    public String getName() {
        return name;
    }

    /**This is a method function to do the Max calculation from 2 values inserted by the user*/
    public int getMax(int parseInt, int parseInt2) {
        return Math.max(parseInt,parseInt2);
    }

    /**This is a method function to do the Min calculation from 2 values inserted by the user*/
    public int getMin(int parseInt, int parseInt2) {
        return Math.min(parseInt,parseInt2);
    }

    /**This is a method function to do the Abs calculation from 2 values inserted by the user*/
    public int getAbs(int parseInt) {
        return Math.abs(parseInt);
    }

    /**This is a method function to do the Sum calculation from 2 values inserted by the user*/
    public int getSum(int parseInt, int parseInt2) {
        //Integer.sum(parseInt, parseInt2);
        //parseInt + parseInt2;
        return parseInt + parseInt2;
    }

    /**This is a method function to do the Diff calculation from 2 values inserted by the user*/
    public int getDiff(int parseInt, int parseInt2) {
        return parseInt - parseInt2;
    }

    /**This is a method function to do the Product calculation from 2 values inserted by the user*/
    public int getProduct(int parseInt, int parseInt2) {
        return parseInt * parseInt2;
    }

    /**This is a method function to do the Quotient calculation from 2 values inserted by the user*/
    public int getQuotient(int parseInt, int parseInt2) {
        return parseInt / parseInt2;
    }

    /**This is a method function to do the Remainder calculation from 2 values inserted by the user*/
    public int getRemainder(int parseInt, int parseInt2) {
        return parseInt % parseInt2;
    }

    /**This is a method function to do the Power calculation from 2 values inserted by the user*/
    public int getPower(int parseInt, int parseInt2) {
        return (int) Math.pow(parseInt, parseInt2);
    }

    /**This is a method function to do the Factorial calculation from 2 values inserted by the user*/
    public int getFactorial(int parseInt) {
        int res = 1, i;
        for (i=2; i<=parseInt; i++)
            res *= i;
        return res;
    }

    /**This is a method function to do the Gcd calculation from 2 values inserted by the user*/
    public int getGcd(int parseInt, int parseInt2) {
        while(parseInt2 != 0)  
        {  
        if(parseInt > parseInt2){  
        parseInt = parseInt - parseInt2;  
        }  
        else {  
        parseInt2 = parseInt2 - parseInt;  
        }  
        }  
        return parseInt;  

    }

    /**This is a method function to do the Lcm calculation from 2 values inserted by the user*/
    public int getLcm(int parseInt, int parseInt2) {
        int multiple =0;
        for(int i=1; i<=100; i++){
            multiple=parseInt*i;

            if (multiple%parseInt2 ==0 && multiple%parseInt==0){
                return multiple;
            }
        }
        return multiple;
    }

    /**This is a method function to do the Square calculation from 2 values inserted by the user*/
    public int getSquare(int parseInt) {
        return parseInt * parseInt;
    }




    // public String getMax(int parseInt2, int parseInt3) {
    //     Math.max(parseInt2,parseInt3);
    //     return null;
    // }

    

    // operator for max: Math.max(num1,num2);
}
