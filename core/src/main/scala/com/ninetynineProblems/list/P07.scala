package com.ninetynineProblems.list

import scala.collection.mutable.ListBuffer

object P07 {
  def flatten[T](xss: List[Any]): List[Any] = {
    val listBuffer = new ListBuffer[Any]
    for (xs <- xss) {
      xs match {
        case x: List[Any] => listBuffer ++= flatten(x)
        case x: Any => listBuffer += x
      }
    }
    listBuffer.toList
  }
}
