public class concreteSubscriber implements Subscriber {

    private String subscriberName;

    public concreteSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news) {
        System.out.println("Hello, " + subscriberName + "!\nMake sure to read the newly published article: " + news);
        System.out.println("Have a great day :)\n--------------------------------\n");
    }

}
