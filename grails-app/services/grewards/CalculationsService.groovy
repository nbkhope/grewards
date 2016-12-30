package grewards

import grails.transaction.Transactional

@Transactional
class CalculationsService {

	// Put your business logic in a service

    def welcome(params) {
    	def firstName = params.first
    	def points = params.int("points")

    	return "Welcome back, $firstName. You've got ${points} points."
    }
}
