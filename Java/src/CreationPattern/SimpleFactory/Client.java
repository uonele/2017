package CreationPattern.SimpleFactory;


public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			People pe;
			String createName = XMLUtilPeople.getBrandName();
			pe = PeopleFactory.producePeople(createName);
			pe.play();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
