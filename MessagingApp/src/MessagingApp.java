public class MessagingApp {

    public static void main(String[] args) {

        MessageHandler myMessageHandler = new MessageHandler();
        int desktopId = 1;
        //first test the creation of desktop message storers
        for (int j = 0; j < 1000; j++) {
            desktopId = random(10);
            myMessageHandler.storeMessage("Message number:" + j.toString(), desktopId);
        }
        //get the messages for each ID and print to console
        // e.g. something like System.out.println(myMessageHandler.getRecentMessages(desktopId).toString());
        // next test overflow control
        myMessageHandler = new MessageHandler();
        desktopId = 1;
        for (int j = 0; j < 1010; j++) {
        }
    }
}
