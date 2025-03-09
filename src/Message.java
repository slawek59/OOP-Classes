public class Message {
    private String text;

    public int getLength(){
        return text.length();
    }

    public boolean isMessageEmpty(){
        return  text.isEmpty();
    }
}
