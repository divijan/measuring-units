package yar.metric

import yar.imperial.Imperial

trait Metric[T] extends Any {
  val v: Double

  def create(v: Double): Metric[T]

  def +(that: Metric[T]): Metric[T] = create(this.v + that.v)
  def -(that: Metric[T]): Metric[T] = create(this.v - that.v)
  def *(that: Double): Metric[T] = create(this.v * that)
  def /(that: Double): Metric[T] = create(this.v / that)

  def toImperial: Imperial[_]
}

object Metric { //Metric.type
  implicit class DoubleMeter(v: Double) {
    def m = Meter(v)
  }
}