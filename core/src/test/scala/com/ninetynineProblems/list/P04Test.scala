package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P04Test extends WordSpec {
  "`length`" should {
    "return the length of list" in {
      val length = P04.length(List("a", "b", "c", "d"))
      assert(4 === length)
    }

    "return 0 of list is empty" in {
      val length = P04.length(List())
      assert(0 === length)
    }
  }

  "`lengthRec`" should {
    "return the length of list" in {
      val lengthRec = P04.lengthRec(List("a", "b", "c", "d"))
      assert(4 === lengthRec)
    }

    "return 0 of list is empty" in {
      val lengthRec = P04.lengthRec(List())
      assert(0 === lengthRec)
    }
  }
}
