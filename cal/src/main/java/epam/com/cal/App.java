package epam.com.cal;

import java.util.Scanner;

class App
{   
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Select 1 for 'Addition(+)' for 2 for 'Subtraction(-)' or 3 for 'Multiplication(*)' or 4 for 'Division(/)' ");
        int op=input.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Enter two numbers for selected operation");
                double a=input.nextDouble();
                double b=input.nextDouble();
                Add s1=new Add(a,b);
                System.out.println("Result " + s1.add());
                break;
            case 2:
                System.out.println("Enter two numbers for selected operation");
                double c=input.nextDouble();
                double d=input.nextDouble();
                Sub b1=new Sub(c,d);
                System.out.println("Result " + b1.sub());
                break;
            case 3:
                System.out.println("Enter two numbers for selected operation");
                double d2=input.nextDouble();
                double d3=input.nextDouble();
                Mul c1=new Mul(d2,d3);
                System.out.println("Result " + c1.mul());
                break;
            case 4:
                System.out.println("Enter two numbers for selected operation");
                double aa=input.nextDouble();
                double bb=input.nextDouble();
                if((aa==0 && bb==0 )||bb==0){
                    System.out.println("Can't be divided by 0 ");
                }
                else{
                Div d1=new Div(aa,bb);
                System.out.println("Result " + d1.div());
                }
                break;
            
            default:
                System.out.println("Choose only 1 or 2 or 3 or 4 - This is in valid");
                //return;
            }
   
    }
        
}  