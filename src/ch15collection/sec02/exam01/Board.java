package ch15collection.sec02.exam01;

public class Board {
    private String title;
    private String content;
    public Board(String title, String content, String string) {
        this.title= title;
        this.content = content;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
}

