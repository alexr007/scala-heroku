package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { implicit request: Request[AnyContent] =>
    import Console._
    val hh: Seq[(String, String)] = request.headers.headers
    hh.map(h => s"${BLUE}${h._1}$RESET:$RED${h._2}$RESET").foreach(println)
    Ok("Minimal Scala-Play App is working!")
  }

}
