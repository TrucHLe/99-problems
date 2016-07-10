package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P01Test extends WordSpec {
  "`last`" should {
    "return the last element" in {
      val last = P01.last(List("a", "b", "c", "d"))
      assert("d" === last)
    }

    "throw a `NoSuchelementexception` if list is empty" in {
      intercept[NoSuchElementException] {
        P01.last(List())
      }
    }
  }

  "`lastRec`" should {
    "return the last element" in {
      val lastRec = P01.lastRec(List("a", "b", "c", "d"))
      assert("d" === lastRec)
    }

    "throw a `NoSuchelementexception` if list is empty" in {
      intercept[NoSuchElementException] {
        P01.lastRec(List())
      }
    }
  }
}
