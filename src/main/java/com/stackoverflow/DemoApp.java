package com.stackoverflow;

import java.awt.SplashScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoApp extends Application
{
    
    @Override
    public void start(
        final Stage stage)
    {
        stage.setTitle("Demo App");
        Scene scene = new Scene(new VBox(), 400, 350);
        scene.setFill(Color.OLDLACE);
        
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        menuBar.getMenus().addAll(menuFile);

        menuBar.setUseSystemMenuBar(true);
        
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
        stage.setScene(scene);
        stage.show();
    }

    private static void closeSplashScreen()
    {
        final SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) 
        {
            splash.close();
        }
    }

    public static void main( String[] args )
    {
        closeSplashScreen();
        launch(args);
    }
}
