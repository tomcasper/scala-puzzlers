package com.tcasper.puzzlers

object Puzzler01 extends App {

  /*
    Hi There!
   */
  val list1 = List(1, 2).map {i => i + 1}
  val list2 = List(1, 2).map {_ + 1}
  val list3 = List(1, 2).map(i => i + 1)
  val list4 = List(1, 2) map (_ + 1)
  println(list1)
  println(list2)
  println(list3)
  println(list4)

  // Puzzle
  // What is the result of executing the following:
  List(1, 2).map { i => println("Hi"); i + 1 }
  List(1, 2).map { println("Hi"); _ + 1 }

  val printAddOne = (i: Int) => { println("Hi"); i + 1 }
  List(1, 2).map(printAddOne)

  val printAndReturnAFunc = { println("Hi"); (_: Int) + 1 }
  List(1, 2).map(printAndReturnAFunc)

  val regularFunc = { a: Any => println("foo"); println(a); "baz" }
  regularFunc("hello")

  val anonymousFunc = { println("foo"); println(_: Any); "baz" }

  val confinedFunc = { println("foo"); { a: Any => println(a) } "baz" }


}
