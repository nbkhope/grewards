package grewards

class BootStrap {

    def init = { servletContext ->
    	new Product(name: "banana", sku: "BNN01", price: 0.29).save()
    	new Product(name: "apple", sku: "APL01", price: 0.69).save()
    	new Product(name: "cesar salad", sku: "CSL01", price: 3.99).save()
    }
    def destroy = {
    }
}
