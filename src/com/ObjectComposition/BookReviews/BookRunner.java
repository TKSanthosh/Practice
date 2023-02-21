package com.ObjectComposition.BookReviews;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book(1,"tk","santhosh");
        Review review1 = new Review(10,"good",(float)4.5);
        book1.addReview(review1);
        System.out.println(book1);
    }
}
