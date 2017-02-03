
public class Person {

	private static String name;
	private static int realName = 1;

		public Person()
		{
			name = "Insert name here.";
		}
		public void setName(String allName)
		{
			if(allName != "")
			{
				allName = name;
			}
				
		}
		public String getName()
		{
			return name;
		}
		public String toString()
		{
			name = Integer.toString(realName);
			return name;
		}
	}

