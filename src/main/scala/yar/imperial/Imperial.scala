package yar.imperial

import yar.metric.Metric

trait Imperial[T] extends Any {
  val v: Double

  def create(v: Double): Imperial[T]

  def +(that: Imperial[T]): Imperial[T] = create(this.v + that.v)
  def -(that: Imperial[T]): Imperial[T] = create(this.v - that.v)
  def *(that: Double): Imperial[T] = create(this.v * that)
  def /(that: Double): Imperial[T] = create(this.v / that)

  def toMetric: Metric[_]
}

object Imperial {
  implicit class DoubleFoot(v: Double) {
    def ft = Foot(v)
  }
}