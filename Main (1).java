import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Declaration Block
    int size = 10;
    int [] STACK = new int [size];
    int top = -1;
    char userChoice;
    int chuka = 1;
    while (chuka ==1){
       userChoice = Menu();

      // switch statment
      switch (userChoice){
        case 'A': 
          top = Push(top, size, STACK);
          Display(top, STACK);
          break;
        case 'B':
          top = pop(top, STACK);
        
          break;
        case 'C':
          top(top, STACK);
          break;
        case 'D':
          top = purge(top, STACK);
          Display(top, STACK);
          break;
        case 'E':
          isEmpty(top);
          Display(top, STACK);
          break;
          
      } // end of switch statement 
        
    }       
    }

public static char Menu( ){
     Scanner kb = new Scanner(System.in);
     System.out.println("select A to push numbers");
     System.out.println("select B to PoP numbers");
     System.out.println("select C to Top numbers");
     System.out.println("select D to purge numbers");
     System.out.println("select E to check if stack is emppty");
     return kb.next().charAt(0);
} // End of main method 


       // creating push method
  public static int Push(int top,int size,int []STACK){
    Scanner kbb = new Scanner(System.in);
    if (top == size -1) {
      System.out.println("Stack is full");
      return top;
    }
    else {
      System.out.println("Enter a number from 0 to 99");
      top++; 
      STACK[top] = kbb.nextInt();
    if (STACK [top] < 0 || STACK[top] > 99){
      inputValidation(top,STACK);
    }

      return top; 
      
      
    } //
    
  } // end of push method
  
  //pop method
  public static int pop(int top, int [] STACK) {
    if (top == -1) {
        System.out.println("Error underflow, stack is Empty");
        return top;
    }
    System.out.println(STACK[top--] +  " cis removed from stack" );
     if (top != -1) {
        System.out.print("Items on the Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(STACK[i] + " ");
        }
     }
        System.out.println();
    return top;
    }
    // input validation method
    public static void inputValidation (int top,int [] STACK){
       Scanner kbb = new Scanner(System.in);
    do  {
      System.out.println("Wrong entry, try again");
      STACK[top] = kbb.nextInt();
    }while(STACK[top] < 0 || STACK[top] > 99);

    }


  // DISPLAY METHOD
  public static void Display(int top, int [] STACK){
    System.out.println("this is the numbers in the stack");
    for(int i = top; i>=0; i--){
      System.out.println(STACK[i]);
    }
  }

  // TOP METHOD
  public static int top(int top, int[] STACK)
  {
    if (top == -1)
    {
      System.out.println("Stack is empty. ");
      return -1;
    }
    System.out.println("The top number is " + STACK[top]);
    return STACK[top];
    
  }

  //PURGE METHOD        
 public static int purge(int top, int[] STACK)
    {
      if (isEmpty(top))
      {
        System.out.println("Error underflow, stack is Empty");
      }   
      else
      {
       for (int i = 0; i <= top; i++)
         {
           STACK[i] = 0;
         }
           top = -1;
           System.out.println("Stack purge successfull");
       }
      return top;
    }
  //Check if stack is empty
  public static boolean isEmpty(int top)
  {
    if (top == -1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
} // end of public class 
