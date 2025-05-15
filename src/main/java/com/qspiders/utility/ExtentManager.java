package com.qspiders.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportName = "report_" + System.currentTimeMillis() + ".html";
            File file = new File(System.getProperty("user.dir") + "\\Reports\\" + reportName);
            ExtentSparkReporter spark = new ExtentSparkReporter(file);
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}
