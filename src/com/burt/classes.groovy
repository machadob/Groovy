package com.burt

class Person{
	String firstName
	String lastName
}

def p = new Person()
p.setFirstName("John")
p.lastName = 'Doe'
println "firstName : ${p.getFirstName()}, lastName : ${p.lastName}"