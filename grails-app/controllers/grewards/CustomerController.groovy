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

		// def customers = Customer.findByPhone(params.id)

		/**
		 * Dynamic finders
		 */

		// name starts with B (you Ilike for case insensitive (NOT ILike))
		// def customers = Customer.findAllByLastNameLike("B%")

		// points greater than 3
		// GreaterThanEquals also works
		// def customers = Customer.findAllByTotalPointsGreaterThan(3, [sort: "totalPoints", order: "desc"])

		// Ranges (inclusive)
		// def customers = Customer.findAllByTotalPointsBetween(2, 4, [sort: "totalPoints", order: "desc"])


		// Combining search parameters
		// def customers = Customer.findAllByFirstNameAndTotalPoints("Bo", 3)

		// Combining even more (starts with B case insensitive and total pts >= 3)
		def customers = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
		[customerInstanceList: customers]
	}

	def index() {
		// Number of items per page
		params.max = 10

		// Include params in list() so it deals with pagination
		// *** The lines below don't work **
		// [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
		// [customerInstanceList: Customer.list(), customerInstanceCount: Customer.count()]


		respond Customer.list(params), model:[customerCount: Customer.count()]
	}

	def create() {
		// ** does not work in Grails 3 ?? **
		// [customerInstance: new Customer()]

		// code from static scaffolding is like this
		respond new Customer(params)
	}

	def save(Customer customerInstance) {
		customerInstance.save()
		redirect action: "show", id: customerInstance.id
	}

	// does not work in Grails 3.2.4:
	// def show(Long id) {
	// 	def customerInstance = Customer.get(id)
	// 	[customerInstance: customerInstance]
	// }

	def show(Customer customer) {
		
		respond customer
	}

	// does not work in Grails 3.2.4:
	// def edit(Long id) {
	// 	def customerInstance = Customer.get(id)
	// 	println customerInstance

	// 	[customerInstance: customerInstance]
	// }

	def edit(Customer customer) {
		respond customer
	}

	def update(Long id) {
		println "Update: id is $id"
		def customerInstance = Customer.get(id)
		println customerInstance.properties

		customerInstance.properties = params
		println customerInstance.properties

		// need to pass flush: true !
		customerInstance.save(flush: true)

		redirect action: "show", id: customerInstance.id
	}

	def delete(Long id) {
		def customerInstance = Customer.get(id)

		// need to flush!
		customerInstance.delete flush: true

		redirect action: "index"
	}

}
