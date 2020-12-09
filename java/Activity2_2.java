package activities;

abstract class Book {
    String name;
    String author;

    abstract String printDetails();
}

class StoryBook extends Book {

    @Override
    String printDetails() {
        return "Story Book Name: " + name + ", author: " + author;
    }
}

class DrawingBook extends Book {

    @Override
    String printDetails() {
        return "Drawing Book Name: " + name + ", author: " + author;
    }
}

public class Activity2_2 {
    public static void main(String args[]) {
        Book storyBook = new StoryBook();
        storyBook.name = "Thenali Raman Stories";
        storyBook.author = "Renukunda";
        System.out.println(storyBook.printDetails());

        Book drawingBook = new DrawingBook();
        drawingBook.name = "Sketch magics";
        drawingBook.author = "Rambo";
        System.out.println(drawingBook.printDetails());
    }
}
