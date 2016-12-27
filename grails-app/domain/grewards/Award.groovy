package grewards

class Award {
	Date awardDate
	String type // purchase or a free drink
	Integer points

	static belongsTo = [customer: Customer]

    static constraints = {
    }
}
