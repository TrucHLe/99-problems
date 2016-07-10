package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P07Test extends WordSpec {
  "`flatten`" should {
    "return an empty list if input is an empty list" in {
      val flatten = P07.flatten(List())
      assert(flatten === List())
    }

    "flatten any kind of nested list of type `Any`" in {
      val flatten = P07.flatten(List(List("a"), "b", List(List("c", "d", List("e"))), List(1, List(2, List(3, List(4, List(5)))))))
      assert(flatten === List("a", "b", "c", "d", "e", 1, 2, 3, 4, 5))
    }
  }
}
