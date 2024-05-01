package com.example.seproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label spaceNameLabel;

    @FXML
    private Label idLabel;

    @FXML
    private Label maxCapacityLabel;

    @FXML
    private Label currentInsideLabel;

    @FXML
    private Label currentInsidePastHourLabel;

    // Method to initialize the controller, you can call this method from your main application or initialize it in FXML
    public void initialize() {
        // Make API requests and update labels
        updateLabelsFromAPI();
    }

    // Method to make API requests and update labels
    private void updateLabelsFromAPI() {
        // Make your API requests here and get the data

        // For example, let's say you have received data in a JSON format
        String jsonResponse = "{\"spaceName\":\"Space1\", \"id\":\"123\", \"maxCapacity\":100, \"currentInside\":50, \"currentInsidePastHour\":30}";

        // Parse JSON response and update labels
        updateLabels(jsonResponse);
    }

    // Method to update labels with the parsed JSON data
    private void updateLabels(String jsonResponse) {
        // Parse JSON response and update labels
        // You can use a JSON parsing library like Gson, Jackson, or org.json for parsing
        // For simplicity, let's use a basic approach here

        // Assuming jsonResponse contains the data in JSON format
        String spaceName = "Space1"; // Example data, replace with parsed data
        String id = "123"; // Example data, replace with parsed data
        int maxCapacity = 100; // Example data, replace with parsed data
        int currentInside = 50; // Example data, replace with parsed data
        int currentInsidePastHour = 30; // Example data, replace with parsed data

        // Update labels with parsed data
        spaceNameLabel.setText(spaceName);
        idLabel.setText(id);
        maxCapacityLabel.setText(String.valueOf(maxCapacity));
        currentInsideLabel.setText(String.valueOf(currentInside));
        currentInsidePastHourLabel.setText(String.valueOf(currentInsidePastHour));
    }
}