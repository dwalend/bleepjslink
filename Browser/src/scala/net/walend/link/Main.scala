package net.walend.link

import org.scalajs.dom.document
import scala.scalajs.js.annotation.{JSExport,JSExportTopLevel}

@JSExportTopLevel("Main")
object Main:
  @JSExport("main")     
  def main(): Unit =
    println("Hello, world")
    val parNode = document.createElement("p")
    val textNode = document.createTextNode("Hello, world")
    parNode.appendChild(textNode)
    document.body.appendChild(parNode)
