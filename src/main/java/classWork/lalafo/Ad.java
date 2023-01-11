package classWork.lalafo;

import java.util.ArrayList;

public class Ad {
    String name;
    String date;
    int views;
    String category;
    ArrayList <NewComment> newCommentArrayList;

    public Ad(String name, String date, int views, String category) {
        this.name = name;
        this.date = date;
        this.views = views;
        this.category = category;
        this.newCommentArrayList = new ArrayList<>(); //new list of comments;

    }
}
