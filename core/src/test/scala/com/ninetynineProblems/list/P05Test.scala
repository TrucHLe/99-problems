package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P05Test extends WordSpec {
  "`reverse`" should {
    "reverse a list" in {
      val reverse = P05.reverse(List("a", "b", "c", "d"))
      assert(List("d", "c", "b", "a") === reverse)
    }

    "return an empty list if input is an empty list" in {
      val reverse = P05.reverse(List())
      assert(List() === reverse)
    }
  }

  "`reverseRec`" should {
    "reverse a list" in {
      val reverseRec = P05.reverseRec(List("a", "b", "c", "d"))
      assert(List("d", "c", "b", "a") === reverseRec)
    }

    "return an empty list if input is an empty list" in {
      val reverseRec = P05.reverseRec(List())
      assert(List() === reverseRec)
    }
  }
}
