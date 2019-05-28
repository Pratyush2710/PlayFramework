package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.books.*;
import views.html.books.index;


import javax.inject.Inject;
import java.util.Map;
import java.util.Set;

public class BooksController extends Controller{


    @Inject
    FormFactory formFactory;

    public Result index(){
        Set<Book> books =  Book.allBooks();

        /*return ok(Json.toJson(books));*/
        return  ok(index.render(books));
    }


    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);

        return ok(create.render(bookForm));
    }


    public Result save(){

        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        Map<String, String> rawData = bookForm.rawData();
        Book book = new Book(Integer.parseInt(rawData.get("id")),rawData.get("title"),Integer.parseInt(rawData.get("price")),rawData.get("author"));
        Book.add(book);
        return redirect(routes.BooksController.index());
    }


    public Result edit(Integer id){
        Book book = Book.findById(id);
        if(book==null)
            return ok("Book not found");
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);

        return ok(edit.render(bookForm));
    }


    public Result update(){
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        Map<String ,String> rawData = bookForm.rawData();
        Integer id = Integer.parseInt(rawData.get("id"));
        Book book = Book.findById(id);
        if(book==null)
            return ok("Book not found");

        book.title = rawData.get("title");
        book.price = Integer.parseInt(rawData.get("price"));
        book.author = rawData.get("author");

        return redirect(routes.BooksController.index());
    }


    public Result destroy(Integer id){


        Book book= Book.findById(id);
        if(book == null)
            return ok("Record not found");

        Book.remove(book);
        return redirect(routes.BooksController.index());
    }


    public Result show(Integer id){
        return TODO(request());
    }
}
