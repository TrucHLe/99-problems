package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P10Test extends WordSpec {
  "`encode`" should {
    "encode consecutive duplicate elements" in {
      val encode = P10.encode(List("a", "b", "b", "b", "c", "c", "c", "c", "a", "a", "a", "a", "a"))
      assert(List((1, "a"), (3, "b"), (4, "c"), (5, "a")) === encode)
    }
  }

  "`encodeSpan`" should {
    "encode consecutive duplicate elements" in {
      val encode = P10.encodeSpan(List("a", "b", "b", "b", "c", "c", "c", "c", "a", "a", "a", "a", "a"))
      assert(List((1, "a"), (3, "b"), (4, "c"), (5, "a")) === encode)
    }
  }

}
