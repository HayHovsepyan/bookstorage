package service;

import common.AuthorCreateParameter;
import entity.Author;

public interface AuthorService {

Author create(AuthorCreateParameter createParameter);

    boolean delete();

    Author get();
}
