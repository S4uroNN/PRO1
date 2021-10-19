package opgave5;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoublePropertyBase;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Gui extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("Opgave 5");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    //-------------------------------------------------
    //Building pane
    private final ListView<Name> lvwNames = new ListView<>();
    private final ArrayList<Name> boys = new ArrayList<>();
    private final ArrayList<Name> girls = new ArrayList<>();
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




        //list
        pane.add(lvwNames, 1, 1, 2, 3);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.getItems().setAll(boys);

        ChangeListener<Name> listener = (ov, oldName, newName) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        pane.add(txfName,1,5,2,1);

        Button btnAdd = new Button("Add Name");
        pane.add(btnAdd,3,5);

        btnAdd.setOnAction(event -> addNameAction());
        rdbBoy.setOnAction(event -> changeListAction());
        rdbGirl.setOnAction(event -> changeListAction());

    }
    //------------
    //Button Actions
    public void addNameAction(){
        String name = txfName.getText().trim();
        if(name.length()>0){
            if(rdbBoy.isSelected()){
                Name n = new Name(name);
                boys.add(n);
                lvwNames.getItems().setAll(boys);
            }else{
                Name n = new Name(name);
                girls.add(n);
                lvwNames.getItems().setAll(girls);
            }
            txfName.clear();
        }
    }
    public void changeListAction(){
        if(rdbBoy.isSelected()){
            lvwNames.getItems().setAll(boys);
        }else{
            lvwNames.getItems().setAll(girls);
        }
    }


    //------------
    //Methods
    private void initPersons(){

            boys.add(new Name("Jan"));
            boys.add(new Name("Jens"));
            boys.add(new Name("Hans"));

            girls.add(new Name("Lise"));
            girls.add(new Name("Anna"));
            girls.add(new Name("Victoria"));


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
