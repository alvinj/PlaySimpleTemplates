package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  val cart = List("apple", "banana")

  // maps to /views/orders.scala.html
  def basket = Action {
    Ok(views.html.basket(cart))
  }
  
  def products(id: Long) = Action {
    // would normally do a lookup here based on the id.
    // we'll just return an XYZ Widget.
    val product = ("The XYZ Widget", "The XYZ Widget is the one and only widget you need for ...")
    Ok(views.html.productDetail(product, cart))
  }

  /**
   * demonstrate a function being passed to a template
   */
  def sayHello = <p>Hello, world</p>
  
  def function = Action {
    Ok(views.html.function(sayHello))
  }
  
}