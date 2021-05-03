package priority_queue;

public class node<T> {
	public T value;
	public node<T> next;
	public int priority;
	public node(T value,int priority)
	{
		this.value=value;
		this.priority=priority;
	}
	public node()
	{
		
	}
}
