
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>
            Create Book
        </title>
    </head>

    <body>
        <h1>Create Book</h1>
        """),_display_(/*13.10*/helper/*13.16*/.form(action = helper.CSRF(routes.BooksController.save()))/*13.74*/{_display_(Seq[Any](format.raw/*13.75*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(bookFrom("id"))),format.raw/*14.46*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(bookFrom("title"))),format.raw/*15.49*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(bookFrom("price"))),format.raw/*16.49*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(bookFrom("author"))),format.raw/*17.50*/("""

            """),format.raw/*19.13*/("""<input type="submit" value="Create Book">
        """)))}),format.raw/*20.10*/("""

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
                  DATE: Mon May 27 18:11:19 IST 2019
                  SOURCE: /home/vassar/Documents/play framework/bookstoreapp/app/views/books/create.scala.html
                  HASH: 09f14987034f17870eb37bfa2ac49093012d8439
                  MATRIX: 959->1|1055->26|1099->42|1126->43|1290->180|1305->186|1372->244|1411->245|1452->259|1467->265|1514->291|1555->305|1570->311|1620->340|1661->354|1676->360|1726->389|1767->403|1782->409|1833->439|1875->453|1957->504|1990->510
                  LINES: 28->1|31->2|34->3|35->4|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20|53->22
                  -- GENERATED --
              */
          