import yar.metric._
import Metric._
import yar.imperial._
import Imperial._


import scala.language.postfixOps

val x = 5 ft //Foot(5)
val y = 3 m // 3.m

//x + y //won't compile
x + y.toImperial