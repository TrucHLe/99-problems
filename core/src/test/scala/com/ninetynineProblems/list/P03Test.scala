package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P03Test extends WordSpec {
  "`kth`" should {
    "return the kth element if that element exists" in {
      val kth = P03.kth(List("a", "b", "c", "d"), 1)
      assert("b" === kth)
    }

    "throw an `IndexOutOfBoundsException` if that element doesn't exist" in {
      intercept[IndexOutOfBoundsException] {
        P03.kth(List("a", "b", "c", "d"), 4)
      }
    }
  }

  "`kthRec`" should {
    "return the kth element if that element exists" in {
      val kthRec = P03.kthRec(List("a", "b", "c", "d"), 1)
      assert("b" === kthRec)
    }

    "throw a `NoSuchElementException` if that element doesn't exist" in {
      intercept[NoSuchElementException] {
        P03.kthRec(List("a", "b", "c", "d"), 4)
      }
    }
  }
}
