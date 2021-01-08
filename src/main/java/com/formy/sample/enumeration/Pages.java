package com.formy.sample.enumeration;

import com.formy.sample.pages.*;

public enum Pages {
    AUTOCOMPLETE(AutocompletePage.class),
    BUTTONS(ButtonsPage.class),
    CHECKBOX(CheckboxPage.class),
    COMPLETE_FORM(CompleteWebFormPage.class),
    DATEPICKER(DatepickerPage.class),
    DRAG_AND_DROP(DragAndDropPage.class),
    DROPDOWN(DropdownPage.class),
    ENABLED_AND_DISABLED(EnabledAndDisabledPage.class),
    FILE_UPLOAD(FileUploadPage.class),
    HOME_PAGE(HomePage.class),
    KEY_AND_MOUSE_PRESS(KeyAndMousePressPage.class),
    MAIN(MainPage.class),
    MODAL(ModalPage.class),
    SCROLL(PageScrollPage.class),
    SWITCH_WINDOW(SwitchWindowPage.class);

    private Class<? extends BasePage> clazz;

    Pages(Class<? extends BasePage> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends BasePage> getClazz() {
        return clazz;
    }

    public static Pages byType(Class<? extends BasePage> clz) {
        for (Pages item : Pages.values()) {
            if (item.getClazz().getSimpleName().equalsIgnoreCase(clz.getSimpleName())) {
                return item;
            } else {
                continue;
            }
        }
        return null;
    }
}
