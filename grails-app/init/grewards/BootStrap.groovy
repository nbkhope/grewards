package grewards

class BootStrap {

    def init = { servletContext ->
    	new Product(name: "banana", sku: "BNN01", price: 0.29).save(failOnError: true)
    	new Product(name: "apple", sku: "APL01", price: 0.69).save(failOnError: true)
    	new Product(name: "cesar salad", sku: "CSL01", price: 3.99).save(failOnError: true)

    	new Customer(phone: 8015551212, firstName: "Luther", lastName: "Allison", totalPoints: 1).save(failOnError: true)
		new Customer(phone: 2135551212, firstName: "Bessie", lastName: "Brown", totalPoints: 2).save(failOnError: true)
		new Customer(phone: 6055551212, firstName: "Bo", lastName: "Diddley", totalPoints: 3).save(failOnError: true)
		new Customer(phone: 6165551212, firstName: "Leroy", lastName: "Foster", totalPoints: 4).save(failOnError: true)
		new Customer(phone: 8015554321, firstName: "Earl", lastName: "Hooker", totalPoints: 5).save(failOnError: true)
		new Customer(phone: 7315551212, firstName: "Maggie", lastName: "Jones", totalPoints: 5).save(failOnError: true)
		new Customer(phone: 8185551212, firstName: "Nick", lastName: "Moss", totalPoints: 4).save(failOnError: true)
		new Customer(phone: 7085551212, firstName: "Odie", lastName: "Payne", totalPoints: 3).save(failOnError: true)
		new Customer(phone: 4155551212, firstName: "Jonny", lastName: "Shines", totalPoints: 2).save(failOnError: true)
		new Customer(phone: 7225551212, firstName: "Ethel", lastName: "Waters", totalPoints: 1).save(failOnError: true)
		new Customer(phone: 6045551212, firstName: "Scrapper", lastName: "Blackwell", totalPoints: 1).save(failOnError: true)
		new Customer(phone: 7315551122, firstName: "Archie", lastName: "Edwards", totalPoints: 2).save(failOnError: true)
		new Customer(phone: 5145551212, firstName: "Jessie", lastName: "Fuller", totalPoints: 3).save(failOnError: true)
		new Customer(phone: 4085551212, firstName: "Ida", lastName: "Goodson", totalPoints: 4).save(failOnError: true)
		new Customer(phone: 8015551234, firstName: "Bumble Bee", lastName: "Smith", totalPoints: 5).save(failOnError: true)
		new Customer(phone: 4315551212, firstName: "Sippie", lastName: "Wallace", totalPoints: 4).save(failOnError: true)
    }
    def destroy = {
    }
}
