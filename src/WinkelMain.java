public class WinkelMain {

    public static void main(String[] args) {

        Mandje mandje = new Mandje();

        Product melk = new Product("Melk", 3);

        mandje.add(melk, 1);
        mandje.add(new Product("Muesli", 4),2);
        mandje.add(new Product("Chocolade", 2),3);
        mandje.add(new Product("Koffie", 1),4);

        mandje.getMandje().forEach((k,v)-> System.out.println(k+"\t"+v));
        System.out.println();
        mandje.set(melk, 5);

        mandje.getMandje().forEach((k,v)-> System.out.println(k+"\t"+v));


        }



}
