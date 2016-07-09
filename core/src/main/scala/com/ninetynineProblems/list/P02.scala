package com.ninetynineProblems.list

object P02 {
  def secondLast[T](list: List[T]): T = list match {
    case x :: (_ :: Nil) => x
    case x :: xs => secondLast(xs)
    case _ => throw new NoSuchElementException
  }
}
