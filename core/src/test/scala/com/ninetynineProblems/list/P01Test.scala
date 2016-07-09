package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P01Test extends WordSpec {

  "`last`" should {
    "return the last element using built in `last`" in {
      val last = P01.last(List("a", "b", "c", "d"))
      assert(last === "d")
    }

    "throw a `NoSuchelementexception` if list is empty" in {
      intercept[NoSuchElementException] {
        P01.last(List())
      }
    }
  }

  "`lastRecursion`" should {
    "return the last element using recursive `last`" in {
      val last = P01.lastRecursion(List("a", "b", "c", "d"))
      assert(last === "d")
    }

    "throw a `NoSuchelementexception` if list is empty" in {
      intercept[NoSuchElementException] {
        P01.lastRecursion(List())
      }
    }
  }
}
