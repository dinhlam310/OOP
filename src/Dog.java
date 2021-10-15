public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public void animalWeight(int weight){
        super.animalWeight(weight);
    }
    public void animalAction(){
        System.out.println("gau gau");
    }
    public void runBy4leg() {

        System.out.println("dog run by 4 legs");
    }
}
