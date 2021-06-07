package com.company.thrillio.dao;

import com.company.thrillio.DataStore;
import com.company.thrillio.entities.Bookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }
}
