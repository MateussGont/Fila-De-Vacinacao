package priority_queue;
import java.lang.*;
import priority.*;
import priority.prioritized;

public class priority_queue<T extends prioritized> {
	node<T> first;
	node<T> last;
	int length;
	public priority_queue()
	{
		node<T> cur=new node<T>();
		first=cur;
		last=cur;
	}
	public int get_length()
	{
		return length;
	}
	
	public void print() throws Exception 
	{
		if(first.next == null)
			throw new Exception("Empty queue.");
		for(node<T> i=first.next;;i=i.next)
		{
			System.out.println(i.value);
			if(i==last)break;
		}
	}
	public void print_priority(int priority) throws Exception 
	{
		if(first.next == null)
			throw new Exception("Empty queue.");
		for(node<T> i=first.next;;i=i.next)
		{
			if(i.priority==priority)
			System.out.println(i.value);
			if(i==last)break;
		}
	}
	public void enqueue(T value)
	{
		int priority=value.get_priority();
		length++;
		if(first==last)
		{
			node<T> n=new node<T>(value,priority);
			first.next=n;
			last=n;
			return;
		}
		node<T> cur=first.next;
		node<T> prev=first;
		while(true)
		{

			if(priority<cur.priority)
			{
				node<T> n=new node<T>(value,priority);
				prev.next=n;
				n.next=cur;
				return;
			}
			if(cur==last)
			{
				node<T> n=new node<T>(value,priority);
				cur.next=n;
				last=n;
				return;
			}
			prev=cur;
			cur=cur.next;
		}
	}
	public T dequeue() throws Exception 
	{
		if(length==0) 
			throw new Exception("Empty queue.");
		length--;
		node<T> ret=first.next;
		first.next=first.next.next;
		return ret.value;
		
	}
}
