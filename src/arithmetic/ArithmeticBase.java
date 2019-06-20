/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
enum Input{
    PLUS, MINUS, TIMES, DIVIDE  
  }
public class ArithmeticBase{
    double x;
    double y;
    
    Input s = Input.PLUS;
    //System.out.println(s);
    for(Input type: Input.value())
    do{
    
  if (s==PLUS){
    return x+y;
}
else if(s==MINUS){
    return x-y;
}
  else if(s==TIMES){
    return x*y;
}
  else if(s==DIVIDE){
    return x/y;
}
}while(true);
  /*
public class ArithmeticBase 
{
    
 public double x,y;

    double calculate(double x, double y) 
        {
        //Scanner sc =new Scanner(System.in);
        //System.out.println("enter String");
        //String s= sc.next();
            
            Input s = Input.x;
            System.out.println("enter input");
            s = sc.Input();
          public enum Input{
              
   }
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}*/
