package assignment2;

public class DLL 
{
	DLLNode head;
	DLLNode tail;
	DLL()
	{
		this.head = null;
		this.tail = null;
	}
	
	public int size()
	{
		int num = 0;
		DLLNode temp = head;
		while (temp != null)
		{
			num++;
			temp = temp.next;
		}
		return(num);
	}
	
	public void addToHead(DLLNode nd)
	{
		if (head == null)
		{
			tail = nd;
		}
		else
		{
			head.prev = nd;
			nd.next = head;
		}
		head = nd;
	}
	
	public void addToTail(DLLNode nd)
	{
		if (head == null)
		{
			head = nd;
		}
		else
		{
			tail.next = nd;
			nd.prev = tail;
		}
		tail = nd;
	}
	
	public DLLNode delNode()
	{
		DLLNode temp = head;
		if (temp == null)
		{
			return null;
		}
		if (temp.next == null)
		{
			head = null;
			return temp;
		}
		head = head.next;
		head.prev = null;
		temp.next = null;
		return temp;
	}
	
	public int readMiddleElement()
	{
		int num = 0;
		int midInt = 0;
		DLLNode temp = head;
		// finding the middle pointer
		int middleP = size()/2;		
		while (temp != null)
		{
			if (middleP == num)
			{
				midInt = temp.num;
			}
			temp = temp.next;
			num++;
		}
		return midInt;
	}	
	
	public DLLNode readElementForward()
	{
		DLLNode temp = head;
		if (head == null)
		{
			return null;
		}
		while (temp != null)
		{
			System.out.print(temp.num + " ");
			// going forward
			temp= temp.next;		
		}
		System.out.println("\n"); 
		return temp;
	}
	
	public DLLNode readElementBackward()
	{
		DLLNode temp = tail;
		if (head == null)
		{
			return null;
		}
		while (temp != null)
		{
			System.out.print(temp.num + " ");
			// going backward
			temp = temp.prev;
		}
		System.out.println("\n");
		return temp;
	}
	
	public void primeNum()
	{
		int count = 0;
		DLLNode temp = head;
		while (temp != null)
		{
			int x = temp.num;
			if (isPrime(x))
			{
				// counting the prime for the printing
				count++;
				System.out.print(x + "\t");
				if ((count) % 5 == 0)
				{
					System.out.println();
					count = 0;
				}	
			}
			temp = temp.next;
		}
		System.out.println("\n");
	}
	
	public boolean isPrime(int n)
	{
		if ( n == 1 || n == 0)
		{
			return false;
		}
		for (int  i = 2; i <= Math.sqrt(n); i++)
		{
			// if result is equal to zero the return false
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean contains(int element)
	{
		DLLNode current = head;
		while(current != null) 
		{
			// checking the element 
			if(current.num == element) 
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
