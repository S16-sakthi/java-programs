import static javax.swing.text.html.HTML.Attribute.N;

public class class1 {
        String name;
        int age;
        class1(String n,int a) {
            name = n;
            age =  a;
        }
        void display () {
            System.out.println(name+ " " + age);
        }
        public static void main (String[] args){
            class1 c1 = new class1("mca", 20);
            class1 c2 = new class1("mca1", 60);
            c1.display();
            c2.display();
        }
    }

