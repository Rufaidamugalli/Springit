package com.Rufaida.Springit;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class springproperties {
    /**
     * this is our welcome message !
     */
    private String welcomeMsg = "Hello Welt !";

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }
}
