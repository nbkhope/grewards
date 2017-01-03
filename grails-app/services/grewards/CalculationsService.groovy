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

    def getTotalPoints(customerInstance) {
    	def totalAwards = 0

    	customerInstance.awards.each { totalAwards += it.points }

    	customerInstance.totalPoints = totalAwards
    	return customerInstance
    }
}
