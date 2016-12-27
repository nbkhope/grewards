package grewards

class InventoryController {

    // If there is only one action, it will be rendered
    // at /
    // Otherwise, it will pick index
    def andex() {
        render "Hello there!"
    }

    def index() {
        render 'This is index'
    }

    def edit() {
        def name = "Banana"
        def sku = "BNN01"
        [name: name, sku: sku]
    }
}
