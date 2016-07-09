package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P05Test extends WordSpec {
  "`reverse`" should {
    "reverse a list" in {
      val reversedList = P05.reverse(List("a", "b", "c", "d"))
      assert(reversedList === List("d", "c", "b", "a"))
    }

    "return an empty list if input is an empty list" in {
      val reversedList = P05.reverse(List())
      assert(reversedList === List())
    }
  }

  "`reverseRecursion`" should {
    "reverse a list" in {
      val reversedList = P05.reverseRecursion(List("a", "b", "c", "d"))
      assert(reversedList === List("d", "c", "b", "a"))
    }

    "return an empty list if input is an empty list" in {
      val reversedList = P05.reverseRecursion(List())
      assert(reversedList === List())
    }
  }
}
