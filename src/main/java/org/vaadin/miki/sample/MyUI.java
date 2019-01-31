package org.vaadin.miki.sample;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.StyleGenerator;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.components.grid.DetailsGenerator;
import com.vaadin.ui.components.grid.ItemClickListener;

import javax.servlet.annotation.WebServlet;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();

        final Data[] items = Data.getData();

        final Grid<Data> gridWithItemRenderer = new Grid<>(Data.class);
        gridWithItemRenderer.setWidth("820px");
        gridWithItemRenderer.setColumnOrder("id", "name", "description");
        gridWithItemRenderer.setDataProvider(DataProvider.ofItems(items));
        gridWithItemRenderer.getColumn("name").setWidth(220);
        gridWithItemRenderer.getColumn("id").setHidden(false);
        gridWithItemRenderer.getColumn("id").setWidth(80);
        Grid.Column<Data, String> column = (Grid.Column<Data, String>) gridWithItemRenderer.getColumn("description");
        column.setWidth(500);
        column.setStyleGenerator((StyleGenerator<Data>) data -> data.getDescription().length() > 100 ? "too-long" : null);
        gridWithItemRenderer.setFrozenColumnCount(1);
        gridWithItemRenderer.addStyleName("details");
        gridWithItemRenderer.addItemClickListener(
            (ItemClickListener<Data>) itemClick -> {
                if(itemClick.getItem().getDescription().length() > 100)
                    gridWithItemRenderer.setDetailsVisible(itemClick.getItem(), !gridWithItemRenderer.isDetailsVisible(itemClick.getItem()));
            });
        gridWithItemRenderer.setDetailsGenerator((DetailsGenerator<Data>) data -> {
            TextArea area = new TextArea("",data.getDescription());
            area.setWidth("100%");
            area.setWordWrap(true);
            area.setReadOnly(true);
            return area;
        });

        gridWithItemRenderer.setBodyRowHeight(50);

        layout.addComponent(gridWithItemRenderer);
        setContent(layout);

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
