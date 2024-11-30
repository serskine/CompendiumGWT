package com.soupthatisthick.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CompendiumUI implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final VerticalPanel vPanel = new VerticalPanel();
        final Label myLbl =new Label("All your Base are belong to us!");

        vPanel.add(myLbl);

        RootPanel.get().add(vPanel);
    }
}
