// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 11 — Social Media Post Ranker
public class SocialPost implements Comparable<SocialPost>{
    private final String author;
    private final String content;
    private final int likes;
    private final int comments;
    
    public SocialPost(String author, String content, int likes, int comments){
        this.author=author;
        this.content=content;
        this.likes=likes;
        this.comments=comments;
    }
    //extra constructor, for convenience
    public SocialPost(SocialPost template){
        this(template.getAuthor(), template.getContent(), template.getLikes(), template.getComments());
    }

    public String getAuthor(){
        return author;
    }
    public String getContent(){
        return content;
    }
    public int getLikes(){
        return likes;
    }
    public int getComments(){
        return comments;
    }

    @Override
    public String toString(){
        return String.format("@%s |%4d likes| %d comments", author, likes, comments);
    }
    /**if the first has more likes-> 1, if the first has less likes -> -1**/
    @Override
    public int compareTo(SocialPost other_post){
        if(likes>other_post.getLikes()){
            return 1;
        }
        if(likes<other_post.getLikes()){
            return -1;
        }
        return 0;
    }
}