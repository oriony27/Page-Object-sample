package com.formy.sample.utils;

import com.formy.sample.enumeration.Pages;
import com.formy.sample.pages.*;

import java.util.HashMap;
import java.util.Map;

public class PageStorage {
    Map<Pages, BasePage> pages = new HashMap<>();

    public PageStorage() {
        pages.put(Pages.AUTOCOMPLETE, new AutocompletePage());
        pages.put(Pages.BUTTONS, new ButtonsPage());
        pages.put(Pages.CHECKBOX, new CheckboxPage());
        pages.put(Pages.COMPLETE_FORM, new CompleteWebFormPage());
        pages.put(Pages.DATEPICKER, new DatepickerPage());
        pages.put(Pages.DRAG_AND_DROP, new DragAndDropPage());
        pages.put(Pages.DROPDOWN, new DropdownPage());
        pages.put(Pages.ENABLED_AND_DISABLED, new EnabledAndDisabledPage());
        pages.put(Pages.FILE_UPLOAD, new FileUploadPage());
        pages.put(Pages.COMMON_PAGE, new CommonPage());
        pages.put(Pages.KEY_AND_MOUSE_PRESS, new KeyAndMousePressPage());
        pages.put(Pages.MAIN, new MainPage());
        pages.put(Pages.MODAL, new ModalPage());
        pages.put(Pages.SCROLL, new PageScrollPage());
        pages.put(Pages.SWITCH_WINDOW, new SwitchWindowPage());
    }

    @SuppressWarnings("unchecked")
    public <T extends BasePage> T getPage(Class<T> clazz) {
        Pages page = Pages.byType(clazz);
        return clazz.cast(pages.get(page));
    }
}