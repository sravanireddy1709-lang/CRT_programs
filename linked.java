package cse;  
public class linked{
class Node
   {
	   int data;
	   Node next;
	   Node(int data)
	   {
		   this.data=data;
		   next=null;
	   }
   }
Node top;
public void stack()
{
	top=null;
}
public void push(int value)
{
	Node newNode=new Node(value);
	newNode.next=top;
	top=newNode;
}
public int pop()
{
	if(isEmpty())
	{
		System.out.println("stack is empty.cannot pop");
		return -1;
	}
	else
	{
		int value=top.data;
		top=top.next;
		return value;
	}
}
public int peek(){
	if(isEmpty())
	{
		System.out.println("stack is empty.nothing is peek");
		return -1;		
	}
	else
	{
		return top.data;
	}
}
public boolean isEmpty()
{
	return top==null;
}
public void printstack()
{
	if(isEmpty())
	{
		System.out.println("stack is empty");
		return;
	}
	System.out.println("stack(top to bottom):");
	Node current=top;
	while(current!=null)
{
	System.out.println(current.data +" ");
	current=current.next;
}
System.out.println();
}
public static void main(String[] args)
{
	linked li=new linked();
	li.push(10);
	li.push(20);
	li.push(30);
	li.printstack();
	System.out.println("popped" +li.pop());
	li.printstack();
	System.out.println("top element" +li.peek());
}
}

  