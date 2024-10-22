import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // A 'new' TvSeries object is created as seriesOne
        Episode episodeOneShallow = new Episode("Hello Friend", 13);
        final TvSeries seriesOneShallow = new TvSeries("Mr Robot", 1, Collections.singletonList(episodeOneShallow));

        // A second TvSeries object is created by shallow copying seriesOne
        final TvSeries seriesTwo = seriesOneShallow.clone();
        // Change the name of S2ep1
        seriesTwo.getEpisodes().get(0).setName("Unmask");
        // S2ep1 name has changed
        System.out.println(seriesTwo.getEpisodes().get(0).getName()); // Unmask
        // But, so has S1ep1 :(
        System.out.println(seriesOneShallow.getEpisodes().get(0).getName()); // Unmask

        // A 'new' TvSeries object is created as seriesOne
        Episode episodeOneDeep = new Episode("Hello Friend", 13);
        final TvSeries seriesOneDeep = new TvSeries("Mr Robot", 1, Collections.singletonList(episodeOneDeep));

        // A second TvSeries object is created using a deep copy of seriesOne
        final TvSeries seriesTwoDeep = seriesOneDeep.deepCopy();
        // Change the name of S2ep1
        seriesTwo.getEpisodes().get(0).setName("Unmask");
        // S2ep1 name has changed
        System.out.println(seriesTwo.getEpisodes().get(0).getName()); // Unmask
        // And s1ep1 name remains correct :)
        System.out.println(seriesOneDeep.getEpisodes().get(0).getName()); // Hello Friend
    }
}