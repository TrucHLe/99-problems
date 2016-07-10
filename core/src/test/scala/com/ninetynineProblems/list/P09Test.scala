package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P09Test extends WordSpec {
  "`pack`" should {
    "pack unique elements into sublists" in {
      val pack = P09.pack(List("a", "b", "c", "d"))
      assert(List(List("a"), List("b"), List("c"), List("d")) === pack)
    }

    "pack only consecutive duplicate elements into sublists" in {
      val pack = P09.pack(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "d"))
      assert(List(List("a", "a"), List("b", "b", "b"), List("c", "c", "c", "c"), List("d", "d", "d", "d", "d")) === pack)
    }
  }

  "`packSpan`" should {
    "pack unique elements into sublists" in {
      val packSpan = P09.packSpan(List("a", "b", "c", "d"))
      assert(List(List("a"), List("b"), List("c"), List("d")) === packSpan)
    }

    "pack only consecutive duplicate elements into sublists" in {
      val packSpan = P09.packSpan(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "d"))
      assert(List(List("a", "a"), List("b", "b", "b"), List("c", "c", "c", "c"), List("d", "d", "d", "d", "d")) === packSpan)
    }
  }
}
