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
``` 

### [P02](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P02.scala) **(*) Find the last but one element of a list**

```scala
"`secondLast`" should {
  "return the first element if list has 2 elements" in {
    val secondLast = P02.secondLast(List("a", "b"))
    assert("a" === secondLast)
  }

  "return the second to last element if list has more than 2 elements" in {
    val secondLast = P02.secondLast(List("a", "b", "c", "d"))
    assert("c" === secondLast)
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
The first element in the list has index 0.

```scala
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
```

### [P04](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P04.scala) **(*) Find the number of elements of a list**

```scala
"`length`" should {
  "return the length of list" in {
    val length = P04.length(List("a", "b", "c", "d"))
    assert(4 === length)
  }

  "return 0 of list is empty" in {
    val length = P04.length(List())
    assert(0 === length)
  }
}
```

### [P05](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P05.scala) **(*) Reverse a list**

```scala
"`reverse`" should {
  "reverse a list" in {
    val reverse = P05.reverse(List("a", "b", "c", "d"))
    assert(List("d", "c", "b", "a") === reverse)
  }

  "return an empty list if input is an empty list" in {
    val reverse = P05.reverse(List())
    assert(List() === reverse)
  }
}
```

### [P06](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P06.scala) **(*) Find out whether a list is a palindrome**
A palindrome a sequence that reads the same forward as backward.

```scala
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
```

### [P07](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P07.scala) **(\*\*) Flatten a nested list structure**

```scala
"`flatten`" should {
  "return an empty list if input is an empty list" in {
    val flatten = P07.flatten(List())
    assert(flatten === List())
  }

  "flatten any kind of nested list of type `Any`" in {
    val flatten = P07.flatten(List(List("a"), "b", List(List("c", "d", List("e"))), List(1, List(2, List(3, List(4, List(5)))))))
    assert(flatten === List("a", "b", "c", "d", "e", 1, 2, 3, 4, 5))
  }
}
```

### [P08](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P08.scala) **(\*\*) Eliminate consecutive duplicates of list elements**

```scala
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
```

### [P09](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P09.scala) **(\*\*) Pack consecutive duplicates of list elements into sublists**

```scala
"`pack`" should {
  "pack unique elements into sublists" in {
    val pack = P09.pack(List("a", "b", "c", "d"))
    assert(List(List("a"), List("b"), List("c"), List("d")) === pack)
  }

  "pack only consecutive duplicate elements into sublists" in {
    val pack = P09.pack(List("a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "d", "d", "d", "d"))
    assert(List(List("a", "a"), List("b", "b", "b"), List("c", "c", "c", "c"), List("d", "d", "d", "d", "d")) === pack)
  }
}
```

### [P10](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P10.scala) **(*) Run-length encoding of a list**
Use the result of problem [P09](https://github.com/TrucHLe/99-problems/blob/master/core/src/main/scala/com/ninetynineProblems/list/P09.scala) to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as terms [N,E] where N is the number of duplicates of the element E.

```scala
"`encode`" should {
  "encode consecutive duplicate elements" in {
    val encode = P10.encode(List("a", "b", "b", "b", "c", "c", "c", "c", "a", "a", "a", "a", "a"))
    assert(List((1, "a"), (3, "b"), (4, "c"), (5, "a")) === encode)
  }
}
```