package Music;
//Buat Object Class dari Driver Class berikut
public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 450.9);
        a.setType("Guitar");
        a.setPrice(301.5);
        //Gunakan if-else untuk menentukan Instrument yg paling mahal dan paling murah

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Instrument paling mahal adalah Guitar");
        }else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Instrument paling mahal adalah Piano");
        }else{
            System.out.println("Instrument paling mahal adalah Violin");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Instrument paling murah adalah Guitar");
        }else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Instrument paling murah adalah Piano");
        }else{
            System.out.println("Instrument paling murah adalah Violin");
        }

        

        
        a.print();
        b.print();
        c.print();
    }
}
