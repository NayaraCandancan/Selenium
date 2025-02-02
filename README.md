# Web Test Automation

<h2> Description </h2>

This project aims to automate the testing of a web application using the Selenium WebDriver tool. Through the Behavior-Driven Development (BDD) approach, with the use of Gherkin, the tests are written in a natural language, facilitating understanding by all team members, including business analysts.

<h2>Technologies Used</h2> 

<ul>
  <li>Java: Core programming language.</li>
  <li>Selenium WebDriver: Framework for automating web browsers.</li>
  <li>Gherkin: Specific language for defining test scenarios in BDD.</li>
  <li>Cucumber: Tool for executing tests written in Gherkin.</li>
</ul>

<h2>Project Structure</h2>

**src/test/java:** 
<ul>
  <li>steps: Contains the step classes that implement the test logic.</li>
  <li>pages: Contains the page classes that represent the interface elements.</li>
  <li>runner: Contains the runner class that executes the tests.</li>
</ul>

**features:** Contains the Gherkin files with the test scenarios.

<h2>Prerequisites</h2>
<ul>
  <li>Java Development Kit (JDK): Install the latest version of the JDK.</li>
  <li>Build Tool: Maven</li>
  <li>IDE: IntelliJ IDEA or Eclipse.</li>
  <li>Drivers: Install the drivers corresponding to the browsers that will be used (Chrome, Firefox, etc.).</li>
  <li>Page Object Model: Design pattern for organizing web page elements.</li>
</ul>

<h2>How to Run the Tests</h2>
<ol>
  <li>Clone the repository:</li>
  
  ```
  git clone https://github.com/NayaraCandancan/Selenium.git
  ```

<li>Install the dependencies:</li>

Run ``` mvn clean install ``` at the project root.

<li> Run the tests:</li>

  Run ```mvn test``` at the project root.
</ol>

<h3>Contributions</h3>

Feel free to contribute to this project! To submit a new feature or fix a bug, follow these steps:

<ol>
<li>Fork this repository.</li>
<li>Create a new branch for your modification.</li>
<li>Make your changes and commit.</li>
<li>Submit a pull request.</li>
</ol>
