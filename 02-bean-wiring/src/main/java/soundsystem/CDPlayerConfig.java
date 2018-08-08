package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ComponentScan("soundsystem")
//@ComponentScan(basePackages = "soundsystem")
//@ImportResource("classpath:application-context.xml")
public class CDPlayerConfig {

  @Bean
  public CompactDisc sgtPeppers() {
    return new SgtPeppers();
  }

  @Bean
  public CompactDisc randomBeatlesCD() {
    int chice = (int) Math.floor(Math.random() * 4);
    if (chice == 0) {
      return new SgtPeppers();
    } else if (chice == 1) {
      return new WhiteAlbum();
    } else if (chice == 2) {
      return new HardDaysNight();
    } else {
      return new Revolver();
    }
  }

//  @Bean
//  public CDPlayer cdPlayer() {
//    return new CDPlayer(sgtPeppers());
//  }

//  @Bean
//  public CDPlayer anotherCDPlayer(CompactDisc compactDisc) {
//    return new CDPlayer(compactDisc);
//  }

  @Bean
  public CDPlayer cdPlayer2() {
    CDPlayer cdPlayer = new CDPlayer();
    cdPlayer.setCd(sgtPeppers());
    return cdPlayer;
  }

}
