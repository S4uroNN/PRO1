package opgave1;

import demoopenwindow.Movie;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.util.ArrayList;

public class Gui extends Application {




    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        addPerson  = new InputPerson("Create person", stage);
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    public  ArrayList<Person> persons = new ArrayList<>();
    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox chkActive = new CheckBox();
    private InputPerson addPerson;

    private void initContent(GridPane pane) {
        this.initPersons();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

//        Label lblName = new Label("Name:");
//        pane.add(lblName, 0, 0);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 3);

//        Label lblTitle = new Label("Title");
//        pane.add(lblTitle,0,1);

//        Label lblSenior = new Label("Senior:");
//        pane.add(lblSenior, 0,2);

//        pane.add(chkActive,1,2);
//        pane.add(txfTitle,1,1,2,1);
//        pane.add(txfName, 1, 0, 2, 1);


        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 1, 0, 1, 5);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        ChangeListener<Person> listener = (ov, oldPerson, newPerson) -> this.selectionChanged();
        lvwPersons.getSelectionModel().selectedItemProperty().addListener(listener);

        lvwPersons.getSelectionModel().clearSelection();

        Button btnaddPeron =  new Button("Add person");
        pane.add(btnaddPeron,4,1);



//        Button btnAdd = new Button("Add");
//        pane.add(btnAdd, 5, 0);
//
//        // connect a method to the button
//        btnAdd.setOnAction(event -> this.addAction());

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 4, 3);

        // connect a method to the button
        btnDelete.setOnAction(event -> this.deleteAction());
        btnaddPeron.setOnAction(event -> this.addPersonAction());

    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addPersonAction(){
        addPerson.showAndWait();

        if(addPerson != null){
            String name = addPerson.getPerson();
            String title = addPerson.getTitle1();
            Person p = new Person(name, title, addPerson.chkSenior.isSelected());
            persons.add(p);
            lvwPersons.getItems().setAll(persons);

        }
    }

    private void addAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        if (name.length() > 0 && title.length()> 0) {
            Person p = new Person(name, title, chkActive.isSelected());
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("Input missing");
            alert.setContentText("Type the name or the title of the person");
            alert.show();
        }
    }

    private void deleteAction() {
        int index = lvwPersons.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            persons.remove(index);
            txfName.clear();
            lvwPersons.getItems().setAll(persons);
        } else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Delete person");
            alert.setHeaderText("Person missing");
            alert.setContentText("Chose a person from the list you want to delete");
            alert.show();
        }
    }

    private void initPersons() {
        persons.add(new Person("Jens", "Jensen", true));
        persons.add(new Person("Hans", "Hansen", false));
        persons.add(new Person("Pia", "Peters", false));
    }

    // -------------------------------------------------------------------------
    // Selection changed action

    private void selectionChanged() {
        Person newPerson = lvwPersons.getSelectionModel().getSelectedItem();
        if (newPerson != null) {
            txfName.setText(newPerson.getFirstName());
        } else {
            txfName.clear();
        }
    }
}
