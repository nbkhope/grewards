package grewards

class Award {
	Date awardDate
	String type // purchase or a free drink
	Integer points

	static belongsTo = [customer: Customer]

    static constraints = {
    	type(inList: ["Purchase", "Reward"]) // you can only input these values for the type
    }
}
