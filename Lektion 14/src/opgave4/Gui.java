package opgave4;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opgave1.Person;

import java.util.ArrayList;


public class Gui extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("Opgave 4");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    //-------------------------------------------------
    //Building pane
    private final ListView<Name> lvwNames = new ListView<>();
    private final ArrayList<Name> names = new ArrayList<>();
    private final TextField txfName = new TextField();
    private final RadioButton rdbBoy = new RadioButton();
    private final RadioButton rdbGirl = new RadioButton();

    private void initContent(GridPane pane) {
        this.initPersons();

        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setPrefSize(350,300);
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNames = new Label("Names:");
        pane.add(lblNames,0,1);

        Label lblName = new Label("Name:");
        lblName.setPadding(new Insets(0,0,0,20));
        pane.add(lblName ,0,5);


        //Testing radiobuttons
        ToggleGroup toggle = new ToggleGroup();
        pane.add(rdbGirl,1,0);
        rdbGirl.setPadding(new Insets(0,0,0,100));
        rdbGirl.setText("Girl");
        rdbGirl.setSelected(false);
        rdbGirl.setToggleGroup(toggle);

        pane.add(rdbBoy,1,0);

        rdbBoy.setText("Boy");
        rdbBoy.setPadding(new Insets(0,0,0,50));
        rdbBoy.setSelected(true);
        rdbBoy.setToggleGroup(toggle);
        //Testing radiobuttons



        //list
        pane.add(lvwNames, 1, 1, 2, 3);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.getItems().setAll(names);

        ChangeListener<Name> listener = (ov, oldName, newName) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        pane.add(txfName,1,5,2,1);

        Button btnAdd = new Button("Add Name");
        pane.add(btnAdd,3,5);

        btnAdd.setOnAction(event -> addNameAction());

    }
    //------------
    //Button Actions
    public void addNameAction(){
        String name = txfName.getText().trim();
        if(name.length()>0){
            Name n = new Name(name);
            names.add(n);
            lvwNames.getItems().setAll(names);
        }
    }


    //------------
    //Methods
    private void initPersons(){

            names.add(new Name("Jan"));
            names.add(new Name("Jens"));
            names.add(new Name("Hans"));


    }
    private void selectionChanged() {
       Name newName = lvwNames.getSelectionModel().getSelectedItem();
        if(newName != null){
            txfName.setText(newName.getFirstName());
        }else{
            txfName.clear();
        }
    }
}
