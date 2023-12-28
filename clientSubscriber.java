
public class clientSubscriber {
    public static void main(String[] args){
            concreteNewsAgency newsAgency = new concreteNewsAgency();

            concreteSubscriber subscriber1 = new concreteSubscriber("Michael B. Jordan");
            concreteSubscriber subscriber2 = new concreteSubscriber("Oscar Isaac");
            concreteSubscriber subscriber3 = new concreteSubscriber("Paul Rudd");
            concreteSubscriber subscriber4 = new concreteSubscriber("Zendaya");


            newsAgency.add(subscriber1);
            newsAgency.add(subscriber3);
            newsAgency.add(subscriber4);

            newsAgency.publishNews("iPhone XX Pro Max is set to release on 2025");

            newsAgency.add(subscriber2);
            newsAgency.remove(subscriber3);

            newsAgency.publishNews("Where to find snow in the Philippines?");
            newsAgency.publishNews("STAYC and NewJeans collaboration in the fall 2024");

    }
}
