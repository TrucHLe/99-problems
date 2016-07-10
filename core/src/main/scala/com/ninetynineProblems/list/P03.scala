package com.ninetynineProblems.list

object P03 {
  def kth[T](list: List[T], k: Int): T = list(k)

  def kthRec[T](list: List[T], k: Int): T = list match {
    case x :: _ if k == 0 => x
    case x :: xs => kthRec(xs, k -1)
    case _ => throw new NoSuchElementException
  }
}
