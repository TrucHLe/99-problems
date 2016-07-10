package com.ninetynineProblems.list

object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    list match {
      case x :: xs => (x +: xs.takeWhile(xss => x == xss)) +: pack(xs.dropWhile(xss => x == xss))
      case Nil => List()
    }
  }

  def packSpan[T](list: List[T]): List[List[T]] = {
    list match {
      case x :: xs =>
        val sublist = list.span(xss => x == xss)
        (sublist._1) +: packSpan(sublist._2)
      case Nil => List()
    }
  }
}
