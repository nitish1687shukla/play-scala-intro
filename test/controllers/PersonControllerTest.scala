package controllers

import org.scalatest.mock.MockitoSugar
import org.scalatest.{FunSpec, Matchers}
import play.api.http.Status
import play.api.mvc.Result
import play.api.test.Helpers.defaultAwaitTimeout
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

/**
  * Created by nsm1211 on 18-04-2016.
  */
class PersonControllerTest extends FunSpec with Matchers with MockitoSugar {

  describe(" Route Test ") {

    it("should route to correct method for request for / ") {
      routes.PersonController.index().toString should be("/")
    }

    it("Should Return Reponse with OK when we call index method ") {
      val personController: PersonController = new PersonController
      val fakeRequest = FakeRequest("GET", routes.PersonController.index().toString())

      val result: Future[Result] = personController.index()(fakeRequest)

      Helpers.status(result) should be(Status.OK)
    }

  }
}
