
package views.html.books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>
            Edit Book
        </title>
    </head>

    <body>
        <h1>Edit Book</h1>
        """),_display_(/*13.10*/helper/*13.16*/.form(action = helper.CSRF(routes.BooksController.update()))/*13.76*/{_display_(Seq[Any](format.raw/*13.77*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(bookFrom("id"))),format.raw/*14.46*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(bookFrom("title"))),format.raw/*15.49*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(bookFrom("price"))),format.raw/*16.49*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(bookFrom("author"))),format.raw/*17.50*/("""

            """),format.raw/*19.13*/("""<input type="submit" value="Edit Book">
            """)))}),format.raw/*20.14*/("""

    """),format.raw/*22.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(bookFrom:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookFrom)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookFrom) => apply(bookFrom)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 27 18:19:00 IST 2019
                  SOURCE: /home/vassar/Documents/play framework/bookstoreapp/app/views/books/edit.scala.html
                  HASH: 7fd9d763c26b190197f47f1614cff57666c8ea14
                  MATRIX: 957->1|1053->26|1097->42|1124->43|1284->176|1299->182|1368->242|1407->243|1448->257|1463->263|1510->289|1551->303|1566->309|1616->338|1657->352|1672->358|1722->387|1763->401|1778->407|1829->437|1871->451|1955->504|1988->510
                  LINES: 28->1|31->2|34->3|35->4|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20|53->22
                  -- GENERATED --
              */
          