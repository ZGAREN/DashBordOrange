package com.example.demo;

import com.example.demo.service.IDashboradServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private IDashboradServie iDashboradServie;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        iDashboradServie.initGroupes();
        iDashboradServie.initCountry();
        iDashboradServie.initItinventory();
        iDashboradServie.initUsers();
        iDashboradServie.initTools();
        iDashboradServie.initStaus();
        iDashboradServie.initEcosysBiEnvirenment();
        iDashboradServie.initEcosysBigDataPlatform();
        iDashboradServie.initTechnicalStram();
    }
}
