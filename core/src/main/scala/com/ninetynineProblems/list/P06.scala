package com.ninetynineProblems.list

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    P05.reverse(list) == list
  }

  def isPalindromeRecursion[T](list: List[T]): Boolean = {
    P05.reverseRecursion(list) == list
  }
}
