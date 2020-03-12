package com.burt

import groovy.transform.TupleConstructor

class ClosureTester{
	String name;
	def f = {x->g(x)}
	def g;
}

t = new ClosureTester()
t.g = {x->println "Result : ${x*x}"}
t.f 4

@TupleConstructor
class MyList{
	def list
	def each(Closure cl) {
		for(l in list) {
			cl(l)
		}
	}
}

MyList myList = [1,2,3,4] // Equivalent to MyList myList = new MyList([1,2,3,4]). Uses the TupleConstructor.
myList.each { x->println(x*x) }