package com.example.application.views.main;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.IFrame;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.virtuallist.VirtualList;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;

import com.vaadin.flow.theme.Theme;

import java.io.FileReader;
import java.util.stream.Stream;

import javax.swing.filechooser.FileView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("index")
@PageTitle("Cars | Add Cars")
@Route("user")

//@HtmlImport("frontend://index.html")

public class UserView extends VerticalLayout {
   // Grid<Car> grid = new Grid<>(Car.class);
   // TextField filterText = new TextField();

    public UserView(){
       add(new H1("Users View"));
          

    }

}


