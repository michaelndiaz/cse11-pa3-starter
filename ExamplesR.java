class R{
    String text;
    R pirate;

    R(String text, R pirate){
        this.text = text;
        this.pirate = pirate;
    }
}

class ExamplesR{
   // R("blah blah", R);

    //1. You are not able to construct an R object because the constructor relies on a type "R" that has not been defined yet.
    //2. You cannot construct a tweet that replies to a reply to a tweet, as the constructor for the ReplyTweet only takes
    //   tweets that are structured as TextTweets. We would have to implement a constructor that takes ReplyTweets if we wanted
    //   to make this possible
}