package kg.baaber

import kg.baaber.monads._

package object io_monads {

    def getLine: IO[String] = IO(scala.io.StdIn.readLine())
    def putStrLn(s: String): IO[Unit] = IO(println(s))

}