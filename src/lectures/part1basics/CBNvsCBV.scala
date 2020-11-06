package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
  The difference between calling by value or calling by name (with =>) is that the first one returns to us
  the value of the function(in this case System.nanoTime()) evaluated once, but in the second case it returns
  the value of the function evaluated in real time, so we have 2 different values in this case.
   */

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite())
}
