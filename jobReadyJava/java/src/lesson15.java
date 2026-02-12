public class lesson15 {

    public static class Dog {
        private String name;
        private double weight;

        public String getName() {
            return name;
        }

        public void setName1(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight1(double weight) {
            this.weight = weight;
        }

        public void bark() {
            System.out.println("WOOF!");
        }

        public void sit() {
            System.out.println("Sitting...");
        }
    }

    public static void main(String[] args) {
        Dog d =  new Dog();
        d.setName1("tes");
        String n1 = d.getName();

         d.setWeight1(10);
        Double w1 = d.getWeight();

        System.out.println(n1);
        System.out.println(w1);

    }
}
