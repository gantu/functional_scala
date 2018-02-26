package kg.baaber.io_monads

import kg.baaber.monads._

object IOTest1 extends App{

	for {
		_			<- putStrLn("First Name")
		firstName	<- getLine
		_			<- putStrLn("Last Name")
		lastName	<- getLine
		_			<- putStrLn(s"First: $firstName, Last: $lastName")
	} yield()

}