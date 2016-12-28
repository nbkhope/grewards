package grewards

class OnlineOrder {
	Date orderDate
	Integer orderNumber
	Float orderTotal

	static belongsTo = [customer: Customer]

	static hasMany = [orderItems: OrderItem]

    static constraints = {
    }
}
