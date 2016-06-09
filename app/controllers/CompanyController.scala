package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

/**
  * Created by ved on 9/6/16.
  */
class CompanyController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def aboutUs = Action {
    Ok(views.html.company.aboutUs("Your new application is ready."))
  }

  def ourTeam = Action {
    Ok(views.html.company.ourTeam("Your new application is ready."))
  }

  def careers = Action {
    Ok(views.html.company.careers("Your new application is ready."))
  }
  def contactUs = Action {
    Ok(views.html.company.contactUs("Your new application is ready."))
  }
}
