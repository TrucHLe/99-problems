package com.ninetynineProblems.list

object P05 {
  def reverse[T](list: List[T]): List[T] = list.reverse

  def reverseRecursion[T](list: List[T]): List[T] = list match {
    case Nil => List()
    case x :: xs => reverseRecursion(xs) :+ x
  }
}
