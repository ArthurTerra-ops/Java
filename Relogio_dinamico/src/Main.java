
public class Main{
    void main() {
        Relogio relogioBR = new RelogioBR();
        relogioBR.setSegundo(59);
        relogioBR.setMinuto(30);
        relogioBR.setHora(15);
        System.out.println(relogioBR.getTime());

        System.out.println(new RelogioBR().convert(relogioBR).getTime());
        System.out.println(new RelogioUS().convert(relogioBR).getTime());
    }
}

