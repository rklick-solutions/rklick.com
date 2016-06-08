package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

/**
  * Created by ved on 7/6/16.
  */
class ProductsController  @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */

  def r3 = Action {
    Ok(views.html.products.r3platform.r3("Your new application is ready."))
  }
  def boaster = Action {
    Ok(views.html.products.boaster.boaster("Your new application is ready."))
  }
  def ora = Action {
    Ok(views.html.products.ora.ora("Your new application is ready."))
  }
  def video = Action {
    Ok(views.html.products.videoFy.video("Your new application is ready."))
  }
}
