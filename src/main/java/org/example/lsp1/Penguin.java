package org.example.lsp1;

public class Penguin extends Bird{

    public Penguin(){
        canFly = false;
    }
    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
        //System.out.println("Пингвины не умееют летатать");
    }
}
