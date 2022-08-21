package com.tkroman.kpi.y2022.l1
sealed trait Nat
case object Zero extends Nat
case class Succ(n: Nat)

def add(a: Nat, b: Nat) Nat =
  a match {
    case Zero => b
    case Succ(k) => add(k, Succ(b))
  }

def mul(a: Nat, b: Nat) Nat =
  a match {
    case Zero => Zero
    case Succ(k) => add(b, mul(k, b))
  }

def toInt(n: Nat) Int =
  n match {
    case Zero => 0
    case Succ(n) => 1 + toInt(n)
  }

def fromInt(n: Int) Nat = {
  var i = 0
  var r: Nat = Zero

  for(i <- 1 to n) {
    r = Succ(r)
    
    }
    res
  }

def min(a: Nat, b: Nat) Nat =
  (a, b) match {
    case (Zero, _)      => Zero
    case (Succ(a1), Zero)  => Zero
    case (Succ(a1), Succ(b1)) => Succ(min(n, m1))
  }

def mod(a: Nat, b: Nat) Nat = 
b match {
  case Zero => Zero 
  case Succ(b) => fromInt(toInt(a) % (toInt(b) + 1))
}


@main def run() =
    
  println(
    toInt( Succ(Succ(Succ(Succ(Zero)))) )
  )

  println(
    toInt(fromInt(6))
  )

  println(
    toInt(add(fromInt(5), fromInt(7)))
  )

  println(
    toInt(mul(fromInt(4), fromInt(3)))
  )

  println(
    toInt(mod(fromInt(6), fromInt(9))
  )

  println(
    toInt(min(fromInt(4), fromInt(6))
  )




