package com.ninetynineProblems.list

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    P05.reverse(list) == list
  }

  def isPalindromeRec[T](list: List[T]): Boolean = {
    P05.reverseRec(list) == list
  }
}
