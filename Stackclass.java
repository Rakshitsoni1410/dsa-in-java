import java.util.*;
class Stackclass{
static void stack_push(Stack<Integer>stack)
{
    for( int i = 0;i<5;i++)
    {
        stack.push(i);
    }
}
static void stack_pop(Stack<Integer>stack)
{
    System.out.println("pop operation:");
    {
        for(int i=0;i<5;i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
   /*static void stack_peep(Stack<Integer>stack)
   {
    Integer element = (Integer) stack_peep();
    System.out.println ("element on stack top:" +  element);
   }
   static void stack_search(Stack<Integer> stack, int element)
   {
    Integer pos = (Integer) stack.search(element);
    if (pos == -1) 
        System.out.print("element not found ");
        else
        System.out.println("element is found at pos :" +pos);
    
   }*/
public static void main (String[] args)
{
    Stack<Integer> stack = new Stack<Integer>();
    stack_push(stack);
    stack_pop(stack);
    stack_push(stack);
    stack_peek(stack);
    stack_search(stack, 2);
    stack_search(stack, 6);
}}

