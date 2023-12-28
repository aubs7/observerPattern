public interface newsAgency {
  public void add(concreteSubscriber subscriber);
  public void remove(concreteSubscriber subscriber);
  public void notifySubscriber(String news);

}
