package org.geysermc.geyser.translator.text;

import lombok.Getter;
import lombok.Setter;

public class MessageContext {

    private final String locale;

    @Setter @Getter
    private String result;
    private boolean unresolved;

    public MessageContext(String locale) {
        this.locale = locale;
        this.unresolved = false;
    }

    public String locale() {
        return locale;
    }

    public boolean unresolved() {
        return unresolved;
    }

    public void markUnresolved() {
        unresolved = true;
    }
}
