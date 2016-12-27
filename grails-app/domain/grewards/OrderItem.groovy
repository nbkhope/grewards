package grewards

class OrderItem {
	Integer quantity
	Float total

	static belongsTo = [order: Order, product: Product]

    static constraints = {
    }
}
