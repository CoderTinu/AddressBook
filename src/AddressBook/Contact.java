package AddressBook;

public class Contact {
	 private String firstName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private int zip;
	    private long phone;
	    private String email;
	    
	    public Contact(String first_name, String last_name, String address, String city, String state, int zip, long phone, String email_id) {
	        this.firstName = first_name;
	        this.lastName = last_name;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phone = phone;
	        this.email = email_id;
	    }
	    
	    
	    @Override
	    public String toString()
	    {
	        return "First name is: "+firstName+"\nLast Name is: "+lastName+"\nAddress is: "+address+"\nCity name is: "+city+
	                "\nState is: "+state+"\nZip is: "+zip+"\nPhone Number is: "+phone+"\nEmail Id is: "+email;
	    }
	    
	    public String getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}

}


