//To begin using file open Scala interpretive mode.  For Scala version 2.12 use :require /User/.../univocity-parsers-2.4.1.jar

import univocity-parsers-2.4.1.CsvParserSettings
import univocity-parsers-2.4.1.CsvParser
import scala.io.StdIn

CsvParserSettings settings = new CsvParserSettings()
CsvParser parser = new CsvParser( settings )

println( "Enter File Directory for CSV to be read" )
val input = scala.io.StdIn.readLine()

val parsedCsv = parser.parseAll( getReader( input ) )
print( parsedCsv )

