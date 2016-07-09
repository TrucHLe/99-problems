package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P04Test extends WordSpec {
  "`length`" should {
    "return the length of list" in {
      val length = P04.length(List("a", "b", "c"))
      assert(length === 3)
    }

    "return 0 of list is empty" in {
      val length = P04.length(List())
      assert(length === 0)
    }
  }

  "`lengthRecursion`" should {
    "return the length of list" in {
      val lengthRecursion = P04.lengthRecursion(List("a", "b", "c"))
      assert(lengthRecursion === 3)
    }

    "return 0 of list is empty" in {
      val lengthRecursion = P04.lengthRecursion(List())
      assert(lengthRecursion === 0)
    }
  }
}
