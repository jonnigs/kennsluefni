public class SinglyLinkedList<T> {

    private class Node {

        Node next;
        T data;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private int length;

    SinglyLinkedList() {
        /*
        Smiður sem upphafsstillir tóman lista.
         */
        this.head = null;
        this.length = 0;
    }

    public int size() {
        /*
        Skilar fjölda staka í listanum.
         */
        return this.length;
    }

    public boolean isEmpty() {
        /*
        Skilar sönnu innihaldi listinn engin stök, annars ósönnu
         */
        return this.head == null;
    }

    @Override
    public String toString() {
        /*
        Aðferð sem sýnir fallega strengjaframsetningu á listanum.
         */
        return "[Hér þarf að skrifa kóða]";
    }

    public T get(int index) {
        /*
        Skilar staki númer index í listanum án þess að breyta honum.
         */
        if (index < 0 || this.size() <= index) {
            throw new ArrayIndexOutOfBoundsException("Vísað út fyrir lista");
        }

        // Hér þarf að skrifa kóða
        return null;
    }

    public void insert(int index, T data) {
        /*
        Bætir staki við listann í sæti númer index, án þess að yfirskrifa stak.
        Öllum stökum sem koma á eftir nýja stakinu er hliðrað í átt að enda listans.
         */
        if (index < 0 || this.size() < index) {
            throw new ArrayIndexOutOfBoundsException("Vísað út fyrir lista");
        }
        // Hér þarf að skrifa kóða
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        try {
            list1.insert(0, 2); // Athugum hvort við getum bætt við staki í tóman lista
            System.out.println(list1); // [ 2 ]
            list1.insert(0, 1); // Athugum hvort við getum bætt staki fremst í lista
            System.out.println(list1); // [ 1 2 ]
            list1.insert(2, 4); // Athugum hvort við getum bætt staki aftast í lista
            System.out.println(list1); // [ 1 2 4 ]
            list1.insert(2, 3); // Athugum hvort við getum bætt staki í miðjan lista
            System.out.println(list1); // [ 1 2 3 4]
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Innsetningaraðferðin brást þegar hún átti ekki að gera það");
            e.printStackTrace();
        }

        for (int i = 0; i < list1.size(); i++) { // Sýnum að get aðferðin virki
            System.out.println("list1.get(" + i + "): " + list1.get(i));
        }

        try {
            System.out.println(list1.get(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kall á list1.get(-1) mistókst réttilega");
        }

        try {
            System.out.println(list1.get(list1.size()));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kall á list1.get(list1.size()) mistókst réttilega");
        }

        // Prófum annan lista til að sýna að hann sé fjölnota:
        SinglyLinkedList<Character> list2 = new SinglyLinkedList<>();
        list2.insert(0, 'D');
        list2.insert(0, 'C');
        list2.insert(0, 'B');
        list2.insert(0, 'A');
        System.out.println(list2);
    }
}
