package grewards

class Customer {
	// In Grails, all fields are required by default? (cannot be null)

	String firstName
	String lastName
	Long phone // could also have stored as String
	String email
	Integer totalPoints

	static hasMany = [awards: Award, orders: OnlineOrder]

    static constraints = {
    	// you can reorder the fields here
    	phone()
    	firstName([nullable: true])
    	lastName(nullable: true)
    	email(nullable: true)
    	totalPoints(nullable: true)
    }
}
