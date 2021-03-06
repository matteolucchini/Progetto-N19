package Components;

import Resources.Resource;

public class MOBO extends AbstractComponent {

    public MOBO(String[] input) {
        super(input);
        resource = new Resource.Builder()
                .withNSATA(Integer.parseInt(caratteristiche[7]))
                .withSocket(caratteristiche[1])
                .withModules(Integer.parseInt(caratteristiche[2]))
                .withTypeRAM(caratteristiche[3])
                .withPower(0 - Integer.parseInt(caratteristiche[8]))
                .withNPci(Integer.parseInt(caratteristiche[4]))
                .withNPcie(Integer.parseInt(caratteristiche[5]))
                .withDimensionMOBO(caratteristiche[6])
                .withokMOBO(true)
                .build();
    }




    /*@Override
        public int compareTo(Object o) {
            return 0;
        }*/
}
