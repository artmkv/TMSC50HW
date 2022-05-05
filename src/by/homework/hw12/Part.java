package by.homework.hw12;


public class Part {

    private PartsForRobot part ;

    public Part(PartsForRobot part) {
        this.part = part;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part1 = (Part) o;

        return part == part1.part;
    }

    @Override
    public int hashCode() {
        return part != null ? part.hashCode() : 0;
    }

    @Override
    public String
    toString() {
        return "Part{" +
                "part=" + part +
                '}';
    }

    public PartsForRobot getPart() {
        return part;
    }

    public void setPart(PartsForRobot part) {
        this.part = part;
    }
}
