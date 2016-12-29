package grewards

class CustomerController {
	// allows scaffold (gives us CRUD automatically)
	// in Grails 3, you need to give the domain class instead of just "true"
	static scaffold = Customer

	// Just by having this empty action will 
	// cause the corresponding view to be rendered
	def checkin() {

	}
}
