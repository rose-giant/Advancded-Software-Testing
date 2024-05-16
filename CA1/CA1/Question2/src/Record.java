import java.util.List;

public class Record {
    public int termID;
    public int courseID;
    public double grade;
    public boolean isGuest;

    public boolean hasPassedPre(List<Record> rec, Course course) {
        for (int i = 0; i < course.pre.size(); i++) {
            boolean prePassed = false;
            for (int j = 0; j < rec.size(); j++) {
                if (rec.get(j).courseID != course.pre.get(i)) {
                    continue;
                }
                if (rec.get(j).grade >= 10 && (!rec.get(j).isGuest || rec.get(j).grade >= 12)) {
                    prePassed = true;
                    break;
                }
            }

            if (!prePassed)
                return false;
        }

        return true;
    }
}
