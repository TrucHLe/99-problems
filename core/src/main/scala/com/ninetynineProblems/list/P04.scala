package com.ninetynineProblems.list

object P04 {
  def length[T](list: List[T]): Int = list.length

  def lengthRecursion[T](list: List[T]): Int = list match {
    case Nil => 0
    case x :: xs => 1 + lengthRecursion(xs)
  }
}
