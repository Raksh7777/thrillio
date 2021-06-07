package com.company.thrillio.controllers;

import com.company.managers.BookmarkManager;
import com.company.thrillio.entities.Bookmark;
import com.company.thrillio.entities.User;

public class BookmarkController {
    private static BookmarkController instance=new BookmarkController();
    private BookmarkController(){}
    public  static BookmarkController getInstance(){
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
    }
}
