package chat;

public class Teacher {
    public static void main(String[] args) {
        new Thread(new TalkSend(5555,"localhost", 8888)).start();
        new Thread(new TalkRecive(9999,"学生")).start();
    }

}
