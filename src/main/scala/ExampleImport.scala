//To begin using file open Scala interpretive mode.  For Scala version 2.12 use :require /User/.../univocity-parsers-2.4.1.jar

import com.univocity.parsers.csv._
import java.io._


object ExampleImport {

  def sqr(x : Int) = x * x

  def main(args: Array[String]) = {
    val value = 3

    println(s"The square of " + value + " is " + sqr(value))

    println(s"The square of $value is ${sqr(value)}")

    val settings = new CsvParserSettings()
    val parser = new CsvParser( settings )

    println( "Enter File Directory for CSV to be read" )
    val input = scala.io.StdIn.readLine()

    val parsedCsv = parser.parseAll( new InputStreamReader(java.lang.System.in) )
    print( parsedCsv )
  }
}
