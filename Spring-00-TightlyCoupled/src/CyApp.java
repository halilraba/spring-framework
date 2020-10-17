public class CyApp {

    public static void main(String[] args) {
        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor parttime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime,parttime);
        mentor.manageAccount();
    }

}
