package stepDef;

import javax.swing.text.html.HTML;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ashwini\\eclipse-workspace\\Cucumber\\Features\\Acti.feature",glue = {"stepDef"},plugin= {"pretty","html:target\\HTML\\reports.html"})
public class Runner1 {
	

}
