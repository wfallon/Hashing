public class ObjectHasher extends Hasher
{

	public int hash(Object obj) 
	{
		String str = obj.toString();
		int counter = 0;
		int counter2 = 1;
		for(int i = str.length() - 1; i>=0;i--)
		{
			counter+=(str.codePointAt(i)*counter2);
			counter2*=10;
		}
		return counter;
		
	}
	
	public String getCoderName() 
	{
		return "Billy Fallon";
	}
	
	

}
