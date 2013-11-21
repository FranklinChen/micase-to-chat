package com.franklinchen

import org.specs2._

import scala.xml.XML

class MicaseSpec extends Specification { def is = s2"""
  MICASE

    Read in from file $e1
  """

  def e1 = {
    val elem = XML.load(getClass.getResource("/adv700ju023.xml"))

    val tei = scalaxb.fromXML[TEIu462](elem)

    //TODO
    5 must_== 5
  }
}
