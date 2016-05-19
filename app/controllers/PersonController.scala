package controllers

import play.api.mvc.{Result, Action, Controller}

/**
  * Created by nsm1211 on 18-04-2016.
  */
class PersonController extends Controller {

  def index = Action { request =>
    Ok(views.html.PersonWelcome())
  }

  def persons = Action { request =>
    Ok(views.html.PersonList(List(Person("nitish", 21), Person("shukla", 28))))
  }
}

case class Person(name: String, age: Int)
