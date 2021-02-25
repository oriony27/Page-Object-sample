package com.formy.sample.enumeration;

public enum  PageUrls {
    AUTOCOMPLETE_PAGE("https://formy-project.herokuapp.com/autocomplete"),
    BUTTONS_PAGE("https://formy-project.herokuapp.com/buttons"),
    CHECKBOX_PAGE("https://formy-project.herokuapp.com/checkbox"),
    COMPLETE_WEB_FORM_PAGE("https://formy-project.herokuapp.com/form"),
    DATEPICKER_PAGE("https://formy-project.herokuapp.com/datepicker"),
    DRAG_AND_DROP_PAGE("https://formy-project.herokuapp.com/dragdrop"),
    DROPDOWN_PAGE("https://formy-project.herokuapp.com/dropdown"),
    ENABLED_AND_DISABLED_PAGE("https://formy-project.herokuapp.com/enabled"),
    FILE_UPLOAD_PAGE("https://formy-project.herokuapp.com/fileupload"),
    KEY_AND_MOUSE_PRESS_PAGE("https://formy-project.herokuapp.com/keypress"),
    MAIN_PAGE("https://formy-project.herokuapp.com/"),
    MODAL_PAGE("https://formy-project.herokuapp.com/modal"),
    SCROLL_PAGE("https://formy-project.herokuapp.com/scroll"),
    SWITCH_WINDOW_PAGE("https://formy-project.herokuapp.com/switch-window");

    private String pageUrl;

    PageUrls(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }
}
