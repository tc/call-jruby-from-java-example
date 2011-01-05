require 'java'

class JrubyAdderImpl
	include Java::JavaInterfaceExample
  
  java_signature 'int add(int, int)'
	def add(a, b)
		a+b
	end
end
