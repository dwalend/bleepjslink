package net.walend.link

import org.scalajs.dom.document

object Main:
  def main(args: Array[String]): Unit =
    println("Hello, world")
    val parNode = document.createElement("p")
    val textNode = document.createTextNode("Hello, world")
    parNode.appendChild(textNode)
    document.body.appendChild(parNode)
