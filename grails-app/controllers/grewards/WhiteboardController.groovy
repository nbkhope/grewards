package grewards

class WhiteboardController {

	// To use the service, define this
	def calculationsService

    def index() { }

    def whatever() {
    	render calculationsService.welcome(params)
    }
}
