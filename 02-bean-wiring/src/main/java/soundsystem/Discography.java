package soundsystem;

import java.util.List;

public class Discography {

  private String artist;
  private List<CompactDisc> cds;

  public Discography(String artist, List<CompactDisc> cds) {
    this.artist = artist;
    this.cds = cds;
  }

}
