package opgave1;

import demoopenwindow.MovieInputWindow;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.Text;

public class InputPerson extends Stage {

    public InputPerson(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    public final CheckBox chkSenior = new CheckBox();

    private Person person = null;

    private void initContent(GridPane pane){
        pane.setPadding(new Insets(20));
        pane.setPrefSize(300,100);
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0,1);

        Label lblSenior = new Label("Senior");
        pane.add(lblSenior,0,2 );

        pane.add(txfName,1,0,2,1);
        pane.add(txfTitle,1,1,2,1);

        pane.add(chkSenior,1,2);

        Button btnAdd =  new Button("Add");
        pane.add(btnAdd,5,0);

        btnAdd.setOnAction(event -> closeAction());
    }

    private void closeAction(){
        InputPerson.this.hide();
    }
    private void addAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        if (name.length() > 0 && title.length()> 0) {
            person = new Person(name,title,chkSenior.isSelected());
            txfName.clear();
            txfTitle.clear();
            InputPerson.this.hide();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("Input missing");
            alert.setContentText("Type the name or the title of the person");
            alert.show();
        }
    }

    public String getPerson(){
        String name = txfName.getText().trim();
        return name;
    }
    public String getTitle1(){
        String title = txfTitle.getText().trim();
        return title;
    }
    public boolean isSenior(){
        if(chkSenior.isSelected()){
            return true;
        }else{
            return false;
        }
    }
}
