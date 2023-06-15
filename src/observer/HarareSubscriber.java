package observer;

public class HarareSubscriber extends Observer {
    public HarareSubscriber(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.println("Hello Harare bidder the bid is now " + this.subject.getState());
    }
}