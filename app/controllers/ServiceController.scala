package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

/**
  * Created by ved on 7/6/16.
  */
class ServiceController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def support = Action {
    Ok(views.html.service.support("Your new application is ready."))
  }

  def training = Action {
    Ok(views.html.service.training("Your new application is ready."))
  }

  def consulting = Action {
    Ok(views.html.service.consulting("Your new application is ready."))
  }
}
