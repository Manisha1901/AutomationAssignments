package assignmentone;

public class Assignone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp = 25.5 ;
		boolean placedorder = true ;
		long phoneno = 1234567890;
		double money = 1000.50 ;
		double latitude = 37.7749;
	    double longitude  = -122.4194 ;
	    boolean maritalstatus = false ;
	    String occupation =  "Software Engineer" ;
				
		String email = "john.doe@example.com" ;
		String colour = "Blue";
		int year = 2023 ;
		String followers = "1,000,000" ;
		System.out.println("Temperature of a city in degrees Celsius:" + temp );
		System.out.println("Whether a customer has placed an order:"+ placedorder );
		System.out.println("Person's phone number:"+ phoneno );
		System.out.println("Amount of money in a customer's bank account:"+ money );
		System.out.println("Person's email address:"+ email);
		System.out.println("Coordinates of a location:("+ latitude +"," +longitude + " )");
		System.out.println("Person's marital status:"+ maritalstatus);
		System.out.println("Person's occupation: " + '"' + occupation + '"') ;
		System.out.printf("Person's occupation:\" %s\"%n" , occupation) ;
		System.out.println("Person's favourite colour:" +  colour);
		System.out.println("Current year:" + year);
		System.out.println("Number of followers on a social media platform:" + followers);
		System.out.format("Rating of a movie:%.1f %n ",7.50);
		System.out.printf("Person's blood type:%s","'A' ");
		
	}

}
