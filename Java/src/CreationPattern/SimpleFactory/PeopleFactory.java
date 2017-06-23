package CreationPattern.SimpleFactory;

public class PeopleFactory {
	public static People producePeople(String create) throws Exception
	{
		if (create.equalsIgnoreCase("M"))
		{
			return new Man();
		}
		else if (create.equalsIgnoreCase("W"))
		{
			return new Woman();
		}
		else if (create.equalsIgnoreCase("R"))
		{
			return new Robot();
		}
		else
		{
			throw new Exception("!!!");
		}
	}
}