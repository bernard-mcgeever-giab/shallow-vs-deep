import java.util.ArrayList;
import java.util.List;

public class TvSeries implements Cloneable {
    private final String name;
    private final int seriesNo;
    // Notice one or more properties are a complex type and mutable
    private final List<Episode> episodes;

    public TvSeries(String name, int seriesNo, List<Episode> episodes) {
        this.name = name;
        this.seriesNo = seriesNo;
        this.episodes = episodes;
    }

    // Shallow copy method
    @Override
    public TvSeries clone() throws CloneNotSupportedException {
        // Cast to TvSeries as super returns Object
        return (TvSeries) super.clone();
    }

    // Deep copy
    public TvSeries deepCopy() {
        // New Episode objects are created during the copy
        final List<Episode> episodes = new ArrayList<>();

        for (Episode episode : this.episodes) {
            episodes.add(new Episode(episode.getName(), episode.getEpNo()));
        }

        return new TvSeries(this.name, this.seriesNo, episodes);
    }

    public String getName() {
        return name;
    }

    public int getSeriesNo() {
        return seriesNo;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "name='" + name + '\'' +
                ", seriesNo=" + seriesNo +
                ", episodes=" + episodes +
                '}';
    }
}
