package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P03Test extends WordSpec {
  "`kth`" should {
    "return the kth element if that element exists" in {
      val kth = P03.kth(List("a", "b", "c"), 1)
      assert(kth === "b")
    }

    "throw an `IndexOutOfBoundsException` if that element doesn't exist" in {
      intercept[IndexOutOfBoundsException] {
        P03.kth(List("a", "b", "c"), 3)
      }
    }
  }

  "`kthRecursion`" should {
    "return the kth element if that element exists" in {
      val kthRecursion = P03.kthRecursion(List("a", "b", "c"), 2)
      assert(kthRecursion === "c")
    }

    "throw a `NoSuchElementException` if that element doesn't exist" in {
      intercept[NoSuchElementException] {
        P03.kthRecursion(List("a", "b", "c"), 3)
      }
    }
  }
}
