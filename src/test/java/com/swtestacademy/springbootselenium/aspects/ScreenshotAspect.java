package com.swtestacademy.springbootselenium.aspects;

import com.swtestacademy.springbootselenium.annotations.TakeScreenshot;
import com.swtestacademy.springbootselenium.utils.ScreenshotUtil;
import java.io.IOException;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ScreenshotAspect {
    @Autowired
    private ScreenshotUtil screenshotUtil;

    @After("@annotation(takeScreenshot)")
    public void after(TakeScreenshot takeScreenshot) throws IOException {
        this.screenshotUtil.takeScreenShot(takeScreenshot.value());
    }

}