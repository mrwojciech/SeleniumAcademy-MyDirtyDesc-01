package com.s3group.BasePage;

import com.s3group.Utils.MyWaits;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.s3group.Utils.MyDriver.getDriver;

public class BasePage extends MyWaits {

    public final Logger log = LoggerFactory.getLogger(this.getClass());

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        log.info("Initiating PageFactory for object: " + this.getClass().getSimpleName());
    }

}
