package com.ofnicon.successcontext.objects;

public class ContextPackage {

    private String title;
    private String description;
    private boolean checked;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isChecked() {
        return checked;
    }

    public ContextPackage(String title, String description, boolean checked) {
        this.title = title;
        this.description = description;
        this.checked = checked;
    }
}
