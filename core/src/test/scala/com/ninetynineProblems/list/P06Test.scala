package com.ninetynineProblems.list

import org.scalatest.WordSpec

class P06Test extends WordSpec {
  "`isPalindrome`" should {
    "return `true` when the list is a palindrome" in {
      val isPalindrome = P06.isPalindrome(List("a", "b", "c", "b", "a"))
      assert(isPalindrome)
    }

    "return `false` when the list is not a palindrome" in {
      val isPalindrome = P06.isPalindrome(List("a", "b", "c"))
      assert(!isPalindrome)
    }
  }

  "`isPalindromeRecursion`" should {
    "return `true` when the list is a palindrome" in {
      val isPalindromeRecursion = P06.isPalindromeRecursion(List("a", "b", "c", "b", "a"))
      assert(isPalindromeRecursion)
    }

    "return `false` when the list is not a palindrome" in {
      val isPalindromeRecursion = P06.isPalindromeRecursion(List("a", "b", "c"))
      assert(!isPalindromeRecursion)
    }
  }
}
