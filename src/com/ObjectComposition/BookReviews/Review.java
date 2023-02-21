package com.ObjectComposition.BookReviews;

public class Review {
    private int id;
    private String comment;
    private float rating;

    Review(int id,String comment,float rating) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
    }

    public String toString() {
        return String.format("id - %d, comment - %s, rating - %f",id,comment,rating);
    }
}
