public class SimpGen {
    TwoGen() {
        TwoGen<Integer, String> tgobj = new TwoGen<Integer, String>(88, "Обобщение");
        tgobj.showTypes();
        int v = tgobj.getOb1();
        System.out.println("Значение: " + v);
        String str = tgobj.getOb2();
        System.out.println("Значение: " + str);
    }
}
