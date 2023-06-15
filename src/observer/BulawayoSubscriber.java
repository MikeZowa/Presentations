package observer;

public class BulawayoSubscriber extends Observer {
    public BulawayoSubscriber(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println("Hello Bulawayo Bidder the bid is now " + this.subject.getState());
    }
}
