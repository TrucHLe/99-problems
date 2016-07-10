package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P06Test extends WordSpec {
  "`isPalindrome`" should {
    "return `true` when the list is a palindrome" in {
      val isPalindrome = P06.isPalindrome(List("a", "b", "c", "b", "a"))
      assert(isPalindrome)
    }

    "return `false` when the list is not a palindrome" in {
      val isPalindrome = P06.isPalindrome(List("a", "b", "c", "d"))
      assert(!isPalindrome)
    }
  }

  "`isPalindromeRec`" should {
    "return `true` when the list is a palindrome" in {
      val isPalindromeRec = P06.isPalindromeRec(List("a", "b", "c", "b", "a"))
      assert(isPalindromeRec)
    }

    "return `false` when the list is not a palindrome" in {
      val isPalindromeRec = P06.isPalindromeRec(List("a", "b", "c", "d"))
      assert(!isPalindromeRec)
    }
  }
}
