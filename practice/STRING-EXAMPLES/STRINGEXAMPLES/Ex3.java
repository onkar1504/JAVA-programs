public class Ex3 {
    
    public static void main(String[] args)
     {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
    }
}
