package com.formy.sample.enumeration;

public enum Components {
    BUTTONS_LINK("Buttons"),
    CHECKBOX_LINK("Checkbox"),
    DATEPICKER_LINK("Datepicker"),
    DRAG_AND_DROP_LINK("Drag and Drop"),
    DROPDOWN_LINK("Dropdown"),
    ENABLE_AND_DISABLE_LINK("Enabled and disabled elements"),
    FILE_UPLOAD("File Upload"),
    KEY_AND_MOUSE_PRESS_LINK("Key and Mouse Press"),
    MODAL_LINK("Modal"),
    PAGE_SCROLL_LINK("Page Scroll"),
    RADIO_BUTTON_LINK("Radio Button"),
    SWITCH_WINDOWS_LINK("Switch Window"),
    COMPLETE_WEB_FORMS_LINK("Complete Web Form");

    private String linkName;

    Components(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkName() {
        return linkName;
    }
}
