package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P08Test extends WordSpec {
  "`compress`" should {
    "return an empty list if input list is an empty list" in {
      val compress = P08.compress(List())
      assert(List() === compress)
    }

    "remove consecutive duplicates in a list" in {
      val compress = P08.compress(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "d"))
      assert(List("a", "b", "c", "d") === compress)
    }

    "not remove non-consecutive duplicates in a list" in {
      val compress = P08.compress(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "a", "a", "a", "a", "a"))
      assert(List("a", "b", "c", "a") === compress)
    }
  }

  "`compressRec`" should {
    "return an empty list if input list is an empty list" in {
      val compressRec = P08.compressRec(List())
      assert(List() === compressRec)
    }

    "remove consecutive duplicates in a list" in {
      val compressRec = P08.compressRec(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "d"))
      assert(List("a", "b", "c", "d") === compressRec)
    }

    "not remove non-consecutive duplicates in a list" in {
      val compressRec = P08.compressRec(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "a", "a", "a", "a", "a"))
      assert(List("a", "b", "c", "a") === compressRec)
    }
  }
}
