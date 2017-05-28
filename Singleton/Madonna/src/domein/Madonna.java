package domein;

import java.util.Calendar;

public class Madonna {

    private int aantalKeerGezongen;
    private final static Madonna instance = new Madonna();
    private final static MadonnaImitator imitator = new MadonnaImitator();

    private Madonna() {
    }

    public static Madonna getInstance() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY ? new MadonnaImitator() : instance;
    }

    public void zingEenLied() {
        ++aantalKeerGezongen;
        System.out.println("Ik zong " + aantalKeerGezongen + " keer");
    }

    private static class MadonnaImitator extends Madonna {

        @Override
        public void zingEenLied() {
            System.out.println("Ik zingt vals");
        }
    }
}
