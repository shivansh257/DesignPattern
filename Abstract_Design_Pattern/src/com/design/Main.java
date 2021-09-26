package com.design;

import com.design.app.Application;
import com.design.factory.FurnitureFactory;
import com.design.factory.ModernFurnitureFactory;
import com.design.factory.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        Application app = configureApplication("Modern");
        app.getFurniture();
        Application app2 = configureApplication("Old");
        app2.getFurniture();
    }

    /**
     * Application picks the factory type and creates it in run time
     */
    private static Application configureApplication(String brand) {
        Application app;
        FurnitureFactory furnitureFactory;

        if (brand.equals("Modern")) {
            furnitureFactory = new ModernFurnitureFactory();
            app = new Application(furnitureFactory);
        } else {
            furnitureFactory = new VictorianFurnitureFactory();
            app = new Application(furnitureFactory);
        }
        return app;
    }
}
