package observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Subject sub = new Subject();
        new BulawayoSubscriber(sub);
        new HarareSubscriber(sub);
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your bid: ");
        sub.setState(scan.nextInt());
    }
}