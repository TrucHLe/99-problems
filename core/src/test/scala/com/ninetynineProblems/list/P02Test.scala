package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P02Test extends WordSpec {
  "`secondLast`" should {
    "return the first element if list has 2 elements" in {
      val secondLast = P02.secondLast(List("a", "b"))
      assert(secondLast === "a")
    }

    "return the second to last element if list has more than 2 elements" in {
      val secondLast = P02.secondLast(List("a", "b", "c"))
      assert(secondLast === "b")
    }

    "throw a `NoSuchElementException` if list has 0 element" in {
      intercept[NoSuchElementException] {
        P02.secondLast(List())
      }
    }

    "throw a `NoSuchElementException` if list has 1 element" in {
      intercept[NoSuchElementException] {
        P02.secondLast(List("a"))
      }
    }
  }
}
