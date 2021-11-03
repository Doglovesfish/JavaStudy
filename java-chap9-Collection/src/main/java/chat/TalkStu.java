package chat;

public class TalkStu {
    public static void main(String[] args) {
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkRecive(8888,"老师")).start();
    }
}
