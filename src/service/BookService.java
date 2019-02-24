package service;

import common.BookCreateParameter;
import common.BookUpdateParameter;
import entity.Book;

public interface BookService {
    Book create(BookCreateParameter createParameter);

    Book update(BookUpdateParameter updateParameter);

    boolean delete();

    Book get();

}
