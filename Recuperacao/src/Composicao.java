import java.util.ArrayList;

public class Composicao {


           public static void main(String[] args) {

            ArrayList<String> al1 = new ArrayList<String>();
            al1.add("A");
            al1.add("B");
               System.out.println("Elementos do ArrayList lista 1 :");
               System.out.println(al1);


            ArrayList<String> al2 = new ArrayList<String>();
            al2.add("F");
            al2.add("G");
               System.out.println("Elementos do ArrayList lista 2 :");
               System.out.println(al2);

            al1.addAll(al2);

               System.out.println("Elementos do ArrayList com composicao :");
               System.out.println(al1);


           }
}

