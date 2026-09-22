public class inheritance1 {
    void eat() {
        System.out.println("eating");
    }
}        class Dog extends inheritance1{
            void bark (){
                System.out.println("barkig");

            }
        }
          class test{
          public static void main(String[] args){
              Dog d = new Dog();
              d.eat();
              d.bark();
          }
        }
