package grewards

class CustomerController {
	// allows scaffold (gives us CRUD automatically)
	// in Grails 3, you need to give the domain class instead of just "true"
	static scaffold = Customer

	// Just by having this empty action will 
	// cause the corresponding view to be rendered
	def checkin() {

	}

	def lookup() {
		// offset by maxRecords * pageNumber.
		// e.g. given maxRecords per page = 5
		// 		page 1: offset 0
		//      page 2: offset 5
		//      page 3: offset 10
		//      etc.

		// Set the offset given the page number
		def theOffset = params.page ? (params.int("page") - 1) * 5 : 0
		println "The offset is $theOffset"

		// findAllByLastName("Foster")
		// findAllByTotalPoints(5, [sort: "lastName"])
		// findAllByPhone(params.id, [sort: "lastName"])

		// /lookup/:id
		// /lookup?page=2

		// def customers = Customer.list(sort: "lastName", order: "desc", max: 5, offset: theOffset)

		def customers = Customer.findByPhone(params.id)
		[customerInstanceList: customers]
	}
}
