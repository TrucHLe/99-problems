# Ninety-Nine Problems in Scala

This is my personal space for re-creating solutions for the [Ninety-Nine Problems in Scala by shekhargulati](https://github.com/shekhargulati/99-problems/tree/master/scala), which is originally inspired by the [Ninety-Nine Prolog Problems](https://sites.google.com/site/prologsite/prolog-problems) written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland.

## Table of Contents

* [Lists](#lists)
* [Arithmetic](#arithmetic)
* [Logic and Codes](#logic-and-codes)
* [Binary Trees](#binary-trees)
* [Multiway Trees](#multiway-trees)
* [Graphs](#graphs)
* [Miscellaneous](#miscellaneous)

## Lists

### [P01](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P01.scala) **(*) Find the last element of a list**

```scala
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
``` 

### [P02](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P02.scala) **(*) Find the last but one element of a list**

```scala
  "`secondLast`" should {
    "return the first element if list has 2 elements" in {
      val secondLast = P02.secondLast(List("a", "b"))
      assert(secondLast === "a")
    }

    "return the second to last element if list has more than 2 elements" in {
      val secondLast = P02.secondLast(List("a", "b", "c"))
      assert(secondLast === "b")
    }

    "throw a `NoSuchElementException` if list has 0 element" in {
      intercept[NoSuchElementException] {
        P02.secondLast(List())
      }
    }

    "throw a `NoSuchElementException` if list has 1 element" in {
      intercept[NoSuchElementException] {
        P02.secondLast(List("a"))
      }
    }
  }
```

### [P03](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P03.scala) **(*) Find the K'th element of a list**

```scala
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
```

### [P04](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P04.scala) **(*) Find the number of elements of a list**

```scala
  "`length`" should {
    "return the length of list" in {
      val length = P04.length(List("a", "b", "c"))
      assert(length === 3)
    }

    "return 0 of list is empty" in {
      val length = P04.length(List())
      assert(length === 0)
    }
  }

  "`lengthRecursion`" should {
    "return the length of list" in {
      val lengthRecursion = P04.lengthRecursion(List("a", "b", "c"))
      assert(lengthRecursion === 3)
    }

    "return 0 of list is empty" in {
      val lengthRecursion = P04.lengthRecursion(List())
      assert(lengthRecursion === 0)
    }
  }
```

### [P05](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P05.scala) **(*) Reverse a list**

```scala
  "`reverse`" should {
    "reverse a list" in {
      val reversedList = P05.reverse(List("a", "b", "c", "d"))
      assert(reversedList === List("d", "c", "b", "a"))
    }

    "return an empty list if input is an empty list" in {
      val reversedList = P05.reverse(List())
      assert(reversedList === List())
    }
  }

  "`reverseRecursion`" should {
    "reverse a list" in {
      val reversedList = P05.reverseRecursion(List("a", "b", "c", "d"))
      assert(reversedList === List("d", "c", "b", "a"))
    }

    "return an empty list if input is an empty list" in {
      val reversedList = P05.reverseRecursion(List())
      assert(reversedList === List())
    }
  }
```

### [P06](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P05.scala) **(*) Find out whether a list is a palindrome**

```scala
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
```