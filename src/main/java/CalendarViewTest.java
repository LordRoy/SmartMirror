
import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CalendarViewTest extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        CalendarView calendarView = new CalendarView() ;

        BorderPane root = new BorderPane(calendarView.getView());
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) throws IOException {

/*        Calendar googleCalendar = new Calendar();

        List<Event> items = googleCalendar.getEvents();

        if (items.size() == 0) {
            System.out.println("No upcoming events found.");
        } else {
            System.out.println("Upcoming events");
            for (Event event : items) {
                DateTime start = event.getStart().getDate();
                if (start == null) {
                    start = event.getStart().getDateTime();
                }
                System.out.printf("%s (%s)\n", event.getSummary(), start.toStringRfc3339().charAt(5)+""+start.toStringRfc3339().charAt(6));
            }
        }*/
        launch(args);
    }
}