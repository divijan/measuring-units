package yar.imperial

import yar.metric.Meter

case class Foot(v: Double) extends AnyVal with Imperial[Foot] {
  def create(v: Double) = Foot(v)

  def toMetric = Meter(v * 0.305)

  override def toString = s"$v ft"
}