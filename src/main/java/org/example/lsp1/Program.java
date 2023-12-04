package org.example.lsp1;

import java.util.ArrayList;
import java.util.Collection;

public class Program {

    // Тип S будет подтипом T тогда и только тогда,
    // когда каждому объекту oS типа S соттвествует некий объект oT типа T таким образом, что для всех
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.

    public static void main(String[] args) {
        Bird bird1 = new Bird(); // oT
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();
        Duck duck1 = new Duck(); // oS
        Duck duck2 = new Duck();

        Penguin penguin1 = new Penguin();

        Collection<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        birds.add(bird4);

        birds.add(duck1);
        birds.add(duck2);

        birds.add(penguin1);

        processFly(birds);
    }

    /**
     * P
     * @param birds
     */
    public static void processFly(Collection<Bird> birds){
        for (Bird bird : birds) {
            if (bird.isCanFly())
                bird.fly();
        }
    }
}
