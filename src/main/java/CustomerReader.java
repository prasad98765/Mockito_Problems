public class CustomerReader {
    private EntityManager EntityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.EntityManager = entityManager;
    }

    public String findFullName(long id) {
        Customer customer= this.EntityManager.find(Customer.class,id);
        return customer.faname + " " + customer.lname;
    }
}
