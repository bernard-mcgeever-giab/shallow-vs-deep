public class Episode {
    private String name;
    private int epNo;

    public Episode(String name, int epNo) {
        this.name = name;
        this.epNo = epNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpNo() {
        return epNo;
    }

    public void setEpNo(int epNo) {
        this.epNo = epNo;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "name='" + name + '\'' +
                ", epNo=" + epNo +
                '}';
    }
}
