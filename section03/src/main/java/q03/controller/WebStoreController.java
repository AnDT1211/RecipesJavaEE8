package q03.controller;

import q03.model.Book;

import javax.ejb.SessionBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "q03WebStoreController")
@SessionScoped
public class WebStoreController {
    private List<Book> books;

    private String nameOfBook = "";
    private String authorOfBook = "";
    private double priceOfBook = 0;

    public WebStoreController() {
        initBooks();
    }
    private void initBooks() {
        books = new ArrayList<>();
        books.addAll(List.of(
                new Book("book A", "Author A", 10),
                new Book("book B", "Author B", 11),
                new Book("book C", "Author C", 12),
                new Book("book D", "Author D", 13),
                new Book("book E", "Author E", 14),
                new Book("book F", "Author F", 15)
        ));
    }


    public String toAddBookPage() {
        return "/q03/addBook";
    }

    public String back() {
        return "/q03/page1.xhtml";
    }
    public void addBookAction() {
        books.add(new Book(nameOfBook, authorOfBook, priceOfBook));
        nameOfBook = "";
        authorOfBook = "";
        priceOfBook = 0;
    }




    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public double getPriceOfBook() {
        return priceOfBook;
    }

    public void setPriceOfBook(double priceOfBook) {
        this.priceOfBook = priceOfBook;
    }
}
