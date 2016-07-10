package com.ninetynineProblems.list

object P05 {
  def reverse[T](list: List[T]): List[T] = list.reverse

  def reverseRec[T](list: List[T]): List[T] = list match {
    case Nil => List()
    case x :: xs => reverseRec(xs) :+ x
  }
}
