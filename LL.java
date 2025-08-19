package cse;

public class LL {
	Node head;
	
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=next;
		}
		
	}
	
	//Adinng first
	public void addfirst(String data)
	{
		Node newNode=new Node(data);
		if(head == null)
		{
			System.out.println("list is empty");
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	//printing
	public void printlist()
	{
		if(head == null)
		{
			System.out.println("list is ermpty!!");
			return;
		}
		Node currNode=head;
		while(currNode != null)
		{
			System.out.println(currNode +"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args)
	{
		LL list = new LL();
		list.addfirst("this");
		list.addfirst("a");
		list.printlist();
	}
}
