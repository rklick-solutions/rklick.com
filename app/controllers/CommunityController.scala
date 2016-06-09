package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

/**
  * Created by ved on 9/6/16.
  */
class CommunityController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def blog = Action {
    Ok(views.html.community.blog("Your new application is ready."))
  }

  def projects = Action {
    Ok(views.html.community.projects("Your new application is ready."))
  }

  def templates = Action {
    Ok(views.html.community.templates("Your new application is ready."))
  }
}
