public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalAction();

        Bird bird = new Bird();
        bird.animalAction();

        Snake snake = new Snake();
        snake.animalAction();

        dog.runBy4leg();
        snake.crawlBy0leg();
        bird.flyWith2Wing();
    }
}
