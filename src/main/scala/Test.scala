/**
  * Created by bhchauhan on 8/11/16.
  */
class Test(brand: String) {

  var count = 0
  val color: String = if (brand == "HP") {
    "blue"
  } else if(brand == "TI") {
    "red"
  } else {
    "white"
  }

  def apply(): Unit =
  {
    count += 1;
    println(count)
  }
  def testType(test: Test) : String =
  {
    test match {

      case a if (test.color == "red") => "TI is red"
      case b if (test.color == "blue") => "HP is blue"
    }
  }

  def pascal(c: Int, r: Int): Int =
  {
    if(c == 0 || c == r) 1
    else pascal(c, r-1) + pascal(c-1, r-1)
  }

  def balance(chars: List[Char]): Boolean =
  {
    var stack = List[Char]()
    def isBalanced(chars: List[Char], stack: List[Char]): Boolean =
    {
      if(chars.isEmpty)
        stack.isEmpty
      else if(chars.head == '(')
        isBalanced(chars.tail, stack :+ (chars.head))
      else if(chars.head == ')') {
        if(stack.last == '(')
          isBalanced(chars.tail, stack.dropRight(1))
        else
          false
      }
      else isBalanced(chars.tail, stack)
    }

    isBalanced(chars, stack)
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, c: List[Int]) : Int = {
      if (c.isEmpty) 0
      else if (m - c.head == 0) 1
      else if (m - c.head < 0) 0
      else countChange(m - c.head, c) + countChange(m, c.tail)
    }
    count(money, coins.sorted)
  }
}

object Test extends App{




  val test = new Test("HP")
  val p = List(1,2)
  println("count"+test.countChange(4, p))
  test()
  println(test.testType(test))
  val hostport =  ("localhost", 80)
  println(hostport._1)

  var li = List('(', 'a','(',')',')')
  println("balance output " +test.balance(li))

  println("this is it" +test.pascal(0,2))
  println(test.pascal(1,2))
  println(test.pascal(1,3))

  val numbers = List (1,2,3,4,5,6)

  val result = numbers.find(_ > 6).getOrElse(0)
  println(result)

  val result2 = numbers.find(_ > 3).map(_ * 2)
  println(result2)

  val result3 = numbers.find(_ < 3) match {
    case Some(n) => n*5
    case None => 0
  }
  println(result3)

  val result4 = numbers.find(_ < 3)


  if(result4.nonEmpty)
    {
      result4.get*5
    }
  else 0

  println(result4)

  println(numbers.map((i: Int) => i * 2))
  def timesTwo(i: Int): Int = i*2
  println(numbers.map(timesTwo))

  println(numbers.filter((i: Int) => i % 2 == 0))

  def isEven(i: Int): Boolean = i%2 == 0
  println(numbers.filter(isEven))

  val chars = List('a','b','c')
  println(numbers.zip(chars))
  println(chars :+ 'd')

  println(numbers.partition(_ % 2 == 0))
}
