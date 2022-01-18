public class main {

    public static void main(String[] args) {
        DoublyListy insults = new DoublyListy();

        insults.addToHead("You never even played Pokemon");
        insults.addToHead("You can't cook and everyone knows it");
        insults.addToHead("You think Power Rangers are a type of truck");

        insults.addToTail("Bro, do you even dougie");
        insults.addToTail("Your old man don't know how to shuffle cards");
        insults.addToTail("You couldn't roll dice if your mom's spaghetti had legs");

        System.out.println(insults.printList());
    }
}
