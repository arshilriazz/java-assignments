package assignments.assignment7.Part2;

public class Main {
    public static void main(String[] args) {
        UniCycle unicycle = new UniCycle();
        BiCycle bicycle = new BiCycle();
        TriCycle tricycle = new TriCycle();

        Cycle[] cycles = new Cycle[3];
        cycles[0] = (Cycle)unicycle;
        cycles[1] = (Cycle)bicycle;
        cycles[2] = (Cycle)tricycle;

//        for(int i = 0; i < 3; i++) {
//            cycles[i].balance();
//        }
        Cycle cycle1 = new UniCycle();
        Cycle cycle2 = new BiCycle();
        Cycle cycle3 = new TriCycle();

        UniCycle uniCycle = (UniCycle)cycle1;
        BiCycle biCycle = (BiCycle)cycle2;
        TriCycle triCycle = (TriCycle)cycle3;

        uniCycle.balance();
        biCycle.balance();
//        triCycle.balance();
    }
}

