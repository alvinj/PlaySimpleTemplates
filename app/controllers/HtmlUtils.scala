package com.alvinalexander.htmlutils

object HtmlUtils {
  
  def li(string: String) = <li>{string}</li>
  def anchor(url: String, description: String) = <a href="{url}">{description}</a>

}