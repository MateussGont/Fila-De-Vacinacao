package priority_queue_array;
import priority.*;

@SuppressWarnings("unchecked")
public class priority_queue<T extends prioritized> {
	
	Object[] data;
	int[] priority;
	int first;
	int last;
	int length;
	int max_length;
	public int get_length()
	{
		return length;
	}
	public int get_max_length()
	{
		return max_length;
	}
	public priority_queue()
	{
		this(255);
	}
	public priority_queue(int max_length)
	{
		this.max_length=max_length+1;
		length=first=last=0;
		data=new Object[this.max_length];
		priority= new int[this.max_length];

	}
	public void print()
	{
		if(first==last)return;
		for(int i=(first+1)%max_length;;i=(i+1)%max_length)
		{
			System.out.println(data[i]);
			if(i==last)break;
		}
	}
	public void print_priority(int priority)
	{
		if(first==last)return;
		for(int i=(first+1)%max_length;;i=(i+1)%max_length)
		{
			if(this.priority[i]==priority)
			System.out.println(data[i]);

			if(i==last)break;
		}
	}
	static int demod(int v,int max)
	{
		while(v<0)v+=max;
		return v;
	}
	public void enqueue(T value) throws Exception
	{
		if(length==max_length-1)
			throw new Exception("Full queue.");
		int priority=value.get_priority();
		length++;
		first=demod(first-1,max_length);
		int prev=first;
		int cur=(first+1)%max_length;
		
		while(true)
		{
			
			data[prev]=data[cur];
			this.priority[prev]=this.priority[cur];
			if(priority<this.priority[cur])
			{
				data[prev]=value;
				this.priority[prev]=priority;
				return;
			}
			if(cur==last)
			{
				this.priority[cur]=priority;
				data[cur]=value;
				return;
			}
			
			prev=cur;
			cur=(cur+1)%max_length;
		}
	}
	public T dequeue()  throws Exception
	{
		
		if(length==0)
			throw new Exception("Empty queue.");
		first=(first+1)%max_length;
		return (T)data[first];
	}
}
