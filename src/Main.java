public class Main {
    public static void main(String[] args) {
       //Create a StringBuilder object with a String pass as parameter
        StringBuilder reve = new StringBuilder("Dog");

        //Now, print string
        System.out.println("Origin word = " + reve.toString());

        //Reverse the String
        StringBuilder reverseReve = reve.reverse();

        //print String, It will work
        System.out.println("Reverse word = " + reverseReve.toString());
    }
}