import java.io.*;

class TextTweet{
    String contents;
    int likes;

    TextTweet(String contents, int likes){
        this.contents = contents;
        this.likes = likes;
    }
    
    boolean hasMention(String username){
        String fullUserSpace = "@" + username + " ";
        String fullUser = "@" + username;
        if(contents.contains(fullUserSpace) || contents.endsWith(fullUser)){
            return true;
        }
        else return false;
    }

    boolean hasLike(){
        if(this.likes > 0){
            return true;
        }
        else return false;
    }

    String firstMention(){
        int FirstIndex = contents.indexOf("@");
        int LastIndex = contents.indexOf(" ", FirstIndex);

        String subString = contents.substring(FirstIndex+1, LastIndex);
        if(FirstIndex == -1 || LastIndex == -1){
            return "";
        }

        else return subString;
    }

}

class ReplyTweet{
    TextTweet replyTo;
    String contents;
    int likes;

    ReplyTweet(TextTweet replyTo, String contents, int likes){
        this.replyTo = replyTo;
        this.contents = contents;
        this.likes = likes;
    }

    boolean morePopularReply(){
        if(this.likes > replyTo.likes){
            return true;
        }
        else return false;
    }

    int allLikes(){
        return this.likes + replyTo.likes;
    }

    boolean hasMention(String username){
        int indexOfAt = contents.indexOf("@");
        int indexAfter = contents.indexOf(username, indexOfAt);
        
        int indexAt2 = replyTo.contents.indexOf("@");
        int indexAfter2 = replyTo.contents.indexOf(username, indexAt2);

        if(contents.substring(indexOfAt, indexAfter).equals(username)){
            return true;
        }

        if(replyTo.contents.substring(indexAt2, indexAfter2).equals(username)){
            return true;
        }
        
        if(indexOfAt == -1 || indexAfter == -1 || indexAt2 == -1 || indexAfter2 == -1){
            return false;
        }
        
        else return false;

    }
}

class Drill3{
    TextTweet ExampleTweet1 = new TextTweet("null", 0);
    ReplyTweet ExampleReply1 = new ReplyTweet(ExampleTweet1, "bruh", 40);
}