package controllers

import javax.inject.*

import play.api.*
import play.api.mvc.*
import play.api.libs.json.*

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method will be
   * called when the application receives a `GET` request with a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.obj("message" -> "connected"))
  }

  def index1 = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.mail())
  }
}
