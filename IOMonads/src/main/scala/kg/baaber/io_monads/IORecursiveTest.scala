package kg.baaber.io_monads

import kg.baaber.monads._

object IOrecursiveTes extends App{

	def loop:IO[Unit] = for{
		_		<- putStrLn("Some Input:")
		inp 	<- getLine
		_		<- putStrLn(s"You said : $inp")
		_		<- if(inp == "q") IO(Unit) else loop
	} yield()

	loop.run
}