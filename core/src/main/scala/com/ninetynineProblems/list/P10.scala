package com.ninetynineProblems.list

object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    P09.pack(list).map(l => (l.length, l.head))
  }

  def encodeSpan[T](list: List[T]): List[(Int, T)] = {
    P09.packSpan(list).map(l => (l.length, l.head))
  }
}
