package com.ninetynineProblems.list

object P08 {
  def compress[T](list: List[T]): List[T] = {
    list match {
      case Nil => List()
      case x :: xs  => x :: compress(xs.dropWhile(xss => x == xss))
    }
  }

  def compressRec[T >: Null](list: List[T]): List[T] = {
    @scala.annotation.tailrec
    def recurse(input: List[T], result: List[T], lastElem: T): List[T] = {
      input match {
        case x :: xs if x == lastElem => recurse(xs, result, x)
        case x :: xs if x != lastElem => recurse(xs, result :+ x, x)
        case Nil => result
      }
    }
    recurse(list, List(), null)
  }
}
