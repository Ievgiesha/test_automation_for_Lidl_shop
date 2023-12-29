package org.example.core.configuration;

import org.example.invoker.WebDriverInvoker;
import org.example.invoker.implementation.LocalChromeInvoker;
import org.example.invoker.implementation.LocalFireFoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_FIREFOX(new LocalFireFoxInvoker()),

    LOCAL_CHROME(new LocalChromeInvoker());
    private final WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver() {
        return webDriverInvoker.invokeWebDriver();
    }

}
