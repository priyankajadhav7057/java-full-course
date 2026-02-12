interface Flowers {
    String name = ("Rose" + "Lotus" + "Sunflowers" + " MariGold" + "Lily");

    void Beautiful();
}

interface Garden_Flowers {

}

class Bouquet_Flowers implements Flowers, Garden_Flowers {// this is called multiple inheritance
    public void Beautiful() {
        System.out.println("All are in my home and FarmHouse");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bouquet_Flowers Home = new Bouquet_Flowers();
        Home.Beautiful();

    }

}
