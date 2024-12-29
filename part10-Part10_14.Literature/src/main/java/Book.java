/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Book {
    
    private String bookName;
    private int bookAgeRecommendation;

    public Book(String bookName, int bookAgeRecommendation) {
        this.bookName = bookName;
        this.bookAgeRecommendation = bookAgeRecommendation;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookAgeRecommendation() {
        return bookAgeRecommendation;
    }

    public void setBookAgeRecommendation(int bookAgeRecommendation) {
        this.bookAgeRecommendation = bookAgeRecommendation;
    }

    @Override
    public String toString() {
        return bookName + " (recommended for " + bookAgeRecommendation + " year-olds or older)";
    }
    

    
}
