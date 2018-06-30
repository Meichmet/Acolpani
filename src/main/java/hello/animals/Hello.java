package hello.animals;

public class Hello {

    public static void main(String[] args){
        System.out.println("hello.animals.Hello world");

        //Hej lis
        System.out.print("kakor");

        Animal a = new Animal("Max");
        for(int i = 0; i < 3; i++){
            a.move();
        }

        System.out.println("Number of animals: " + Animal.getNumber());
    }

}
