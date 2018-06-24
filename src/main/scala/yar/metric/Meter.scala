package yar.metric

import yar.imperial.Foot

case class Meter(v: Double) extends AnyVal with Metric[Meter] {
  def create(v: Double) = Meter(v)

  def toImperial = Foot(v / 0.305)

  override def toString = s"$v m"
}