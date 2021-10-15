public class Bird extends Animal {
    public Bird() {
    }

    @Override
    public void animalWeight(int weight) {
        super.animalWeight(weight);
    }
    public void animalAction(){
        System.out.println("quak quak");
    }
    public void flyWith2Wing() {
        System.out.println("bird fly with 2 wings");
    }
}
