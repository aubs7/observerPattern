import java.util.*;

public class concreteNewsAgency implements newsAgency {
    private String newsAgencyName = "Makabagong Balita";

    private List<concreteSubscriber> subscriberList = new ArrayList<>();

    @Override
    public void add(concreteSubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void remove(concreteSubscriber subscriber) {
          subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String news) {
        for(concreteSubscriber subscriber : subscriberList){
            subscriber.update(news);
        }
    }

    public void publishNews(String news){
        System.out.println("********************************");
        System.out.println(newsAgencyName + " has published a new article: " + news);
        System.out.println("********************************\n");
        notifySubscriber(news);
    }
}
