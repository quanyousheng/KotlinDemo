package com.example.kotlindemo

/*
* there are few requirements that data classes need to fulfil:
   The primary constructor needs to have at least one parameter.
   All primary constructor parameters need to be marked as val or var
   Data classes cannot be abstract, open, sealed or inner.
* */
data class Student(var name: String, var age: Int)