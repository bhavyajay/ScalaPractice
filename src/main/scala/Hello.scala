/**
  * Created by bhchauhan on 8/11/16.
  */
object Hello{

  var base = "cookie"
  var sauce = "abc"
  var count = 0
  def incerem() =
    {
      count += 1
      println(count)
    }

  def foo(): Unit =
  {
    println(s"Give me $base and $sauce")
  }

  def apply(m: Int): Int = m+1

  def aComparisonFunction(arg: Any): Any =
  {
    arg match{

      case a: Int if a <= 5 => println("number less than 5")
      case value: Int if value >5 =>print("number greater than 5")
      case c: Char => println(c)
    }
  }




  def main(args: Array[String]): Unit = {

    Hello.incerem()
    //println(Hello.count)

    count match{

      case 1 => println("one")
      case _ => print("any other number")

    }
    count match {

      case i if i > 2 => println("less than two")
      case _ => println("print anything")
    }

    Hello.aComparisonFunction('c')

  }
}
