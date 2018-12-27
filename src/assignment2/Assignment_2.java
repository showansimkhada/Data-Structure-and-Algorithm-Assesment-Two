package assignment2;

public class Assignment_2 
{
	public static DLL list1 = PathFile.ReadFile("C:\\Users\\Admin\\Desktop\\file1.txt");
	public static DLL list2 = PathFile.ReadFile("C:\\Users\\Admin\\Desktop\\file2.txt");
	public static DLL list3 = PathFile.ReadFile("C:\\Users\\Admin\\Desktop\\file3.txt");
	
	public static void main(String[] args) 
	{
		System.out.println("The size of the list1 is: " + list1.size());
		System.out.println("The size of the list2 is: " + list2.size());
		System.out.println("The size of the list3 is: " + list3.size());
		System.out.println("The middle number of the list1 is: " + list1.readMiddleElement());
		System.out.println("The middle number of the list2 is: " + list2.readMiddleElement());
		System.out.println("The middle number of the list3 is: " + list3.readMiddleElement());
		System.out.println("The prime numbers in the list1 are: ");
		list1.primeNum();
		System.out.println("The prime numbers in the list2 are: ");
		list2.primeNum();
		System.out.println("The prime numbers in the list2 are: ");
		list2.primeNum();
		System.out.println("The integers in the list1 are: ");
		list1.readElementForward();
		System.out.println("On reversing the order we get: ");
		list1.readElementBackward();
		System.out.println("The integers in the list2 are: ");
		list2.readElementForward();
		System.out.println("On reversing the order we get: ");
		list2.readElementBackward();
		System.out.println("The integers in the list3 are: ");
		list3.readElementForward();
		System.out.println("On reversing the order we get: ");
		list3.readElementBackward();
		System.out.println("The intersection integers in list1, list2 and list3 are: ");
		intersection();
	}
	
	public static void intersection()
	{
		DLLNode current = list1.head;
		while(current != null)
		{
			// comparing the list1, list2 and list3 elements
			if(list2.contains(current.num) && list3.contains(current.num)) 
			{
				System.out.print(current.num + " ");
			}
			current = current.next;
		}
	}
}
