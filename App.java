import java.util.Scanner;
public class App 
{int add()
{
    return 0;
}
int mult()
{
    return 0;
}
int sub()
{
    return 0;
}
int divide()
{
    return 0;
}
public static void main(String[] args)
    {
    	Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator");
        System.out.println("Enter First number : ");
        int op1=s.nextInt();
        System.out.println("Enter Secound number : ");
        int op2=s.nextInt();
        System.out.println("Enter operation to perform (+,-,*,/) ");
        String operation=s.next();
        if(operation.equals("+")) {
            System.out.println(add(op1,op2));
        }
        else if(operation.equals("-")) {
            System.out.println(sub(op1,op2));
        }
        else if(operation.equals("*")) {
            System.out.println(mult(op1,op2));
        }
        else if(operation.equals("/")) {
            System.out.println(divide(op1,op2));
        }
        else {
            System.out.println("The operation is not valid");
        }
    }
    static int sub(int op1,int op2)
    {
        return op1-op2;
    }
   static int mult(int op1,int op2)
    {
        return op1*op2;
    }
   static int add(int op1,int op2)
    {
        return op1+op2;
    }
   static int divide(int op1,int op2)
    {
        if(op2==0)
            return 0;
            else
        return op1+op2;
    }
    }
