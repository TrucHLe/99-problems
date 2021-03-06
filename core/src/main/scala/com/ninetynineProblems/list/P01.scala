package com.ninetynineProblems.list

object P01 {
  // Use the built-in `last`
  def last[T](list: List[T]): T = list.last

  // Use recursion we ignore the first elements until we reach the last element
  def lastRec[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => lastRec(xs)
    case _ => throw new NoSuchElementException
  }
}
