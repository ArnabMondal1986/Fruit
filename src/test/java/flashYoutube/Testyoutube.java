package flashYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import Flash.FlashObjectWebDriver;

public class Testyoutube {
 
public static void main(String[] args) throws InterruptedException {
 
// Open firefox browser
FirefoxDriver driver = new FirefoxDriver();
 
// Maximize browser
driver.manage().window().maximize();
 
// FlashObjectWebDriver is seperate class which is available inside jar which we have    //attached
FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "movie_player");
 
// Pass the URL of video
driver.get("https://www.youtube.com/watch?v=GGq3LYADsNo");
Thread.sleep(50000);

//driver.findElement(By.cssSelector("button.videoAdUiSkipButton videoAdUiAction")).click();
 
// let the video load
while (Integer.parseInt(flashApp.callFlashObject("getPlayerState")) == 3){
Thread.sleep(1000);
}
 
// Play the video for 10 seconds
Thread.sleep(10000);
 
// pause video using pauseVideo method
flashApp.callFlashObject("pauseVideo");
 
Thread.sleep(5000);
 
// play video using playVideo method
flashApp.callFlashObject("playVideo");
Thread.sleep(5000);
 
// Seek to is method which will forword video to 140 second
flashApp.callFlashObject("seekTo","140","true");
 
// Wait for 5 seconds
Thread.sleep(5000);
 
//mute video using playVideo method
flashApp.callFlashObject("mute");
 
// Wait for 5 seconds
Thread.sleep(5000);
 
//set the volume of  video using setVolume method
flashApp.callFlashObject("setVolume","50");
 
// wait for 5 seconds
Thread.sleep(5000);
 
}
 
}