/* James Buzzell
   08/04/2026
   CSD-402 Assignment 11.2 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class JbHbox extends Application {
    @Override
    public void start(Stage primStage) {
        // Declare HBox with 15px spacing between elements
        HBox myHbox = new HBox(15);
        
        // Set padding around entire HBox to 17
        myHbox.setPadding(new Insets(17, 17, 17, 17));

        // Center content alignment
        myHbox.setAlignment(Pos.CENTER);

        Button button1 = new Button("Open");
        Button button2 = new Button("Close");

        // Set horizontal grow priority for child node
        HBox.setHgrow(button1, Priority.ALWAYS); 
        button1.setMaxWidth(Double.MAX_VALUE);

        // Add child nodes to HBox
        myHbox.getChildren().addAll(button1, button2);

        Scene myScene = new Scene(myHbox, 290, 90);
        primStage.setScene(myScene);
        primStage.setTitle("James's HBox");
        primStage.show();
    }

    public static void main(String[] argues) {
        launch(argues);
    }
}




