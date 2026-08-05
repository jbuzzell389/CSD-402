/* James Buzzell
   08/04/2026
   CSD-402 Assignment 11.2 */

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JbFlowPane extends Application {
    @Override
    public void start(Stage stagePres) {
        // Declare the flowPane
        FlowPane myFlowpane = new FlowPane();
        
        myFlowpane.setOrientation(Orientation.HORIZONTAL); 
        myFlowpane.setHgap(15);                            
        myFlowpane.setVgap(20);                            
        myFlowpane.setAlignment(Pos.CENTER);               

        // Populate with elements of different sizes
        for (int i = 1; i <= 8; i++) {
            Button button = new Button("Button number" + i);
            button.setPrefWidth(65 + (i * 6));
            myFlowpane.getChildren().add(button);
        }

        // Create Scene and Stage
        Scene scenery = new Scene(myFlowpane, 415, 230);
        stagePres.setTitle("My Flowpane");
        stagePres.setScene(scenery);
        stagePres.show();
    }

    public static void main(String[] argu) {
        launch(argu);
    }
}
