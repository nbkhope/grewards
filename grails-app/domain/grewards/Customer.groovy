package grewards

class Customer {
	String firstName
	String lastName
	Long phone // could also have stored as String
	String email
	Integer totalPoints

	static hasMany = [awards: Award, orders: Order]

    static constraints = {
    }
}
