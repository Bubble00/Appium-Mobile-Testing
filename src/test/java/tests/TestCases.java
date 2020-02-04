package tests;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends Base {

    @Test
    public void testcaseone(){
        /**Testing if the song selected to play is the one playing after selecting*/
        MobileElement genres = driver.findElement(By.xpath("//*[@resource-id='com.example.android.uamp:id/title' and @text='Genres']"));
        genres.click();

        MobileElement rock = driver.findElement(By.xpath("//*[@resource-id=\"com.example.android.uamp:id/title\" and @text='Rock']"));
        rock.click();

        MobileElement songToPlay = driver.findElement(By.xpath("//*[contains(@class,'android.widget.TextView') and @text='Drop and Roll']"));
        songToPlay.click();

        MobileElement playingSong = driver.findElement(By.xpath("//*[contains(@content-desc,'Song currently playing') and contains(@resource-id,'com.example.android.uamp:id/title')]"));

        Assert.assertEquals(songToPlay.getText(),playingSong.getText());
    }
}
