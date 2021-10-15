public class Snake extends Animal {
    public Snake() {
    }

    @Override
    public void animalWeight(int weight){
        super.animalWeight(weight);
    }
    public void animalAction(){
        System.out.println("psh psh");
    }
    public void crawlBy0leg() {
        System.out.println("snake crawl with 0 leg");
    }

}
