import com.univocity.parsers.csv._
import java.io._


object ExampleImport {

  def main(args: Array[String]) = {

    val settings = new CsvParserSettings()
    val parser = new CsvParser( settings )



    val parsedCsv = parser.parseAll( new InputStreamReader( this.getClass().getResourceAsStream("~/Chicago-Data-Compiler/data/sample.csv"), "UTF-8") )
    println( parsedCsv )
  }
}
