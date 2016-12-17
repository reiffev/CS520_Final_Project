# CS520_Final_Project

##DESIGN CHOICES

For our User Interface design, we used the MVC Architecture design pattern. We chose this because, as the title of the project suggests, we were to create a UI design for the visualization of program mutations and mutant-kill information. This means that some information will need to be updated that the View will need to display, which is the basic definition of MVC.

We used the Composite Pattern for the View. This way, we are able to keep the program extensible and have the option for different Views to be added to the overall ComplexView. We also used the Observer Pattern for the Model to update the View. This was quite obvious as with the amount of views we had, we need to update all the Views once information had changed. The Observer Pattern does this for us with its <code>changed()</code> and <code>update()</code> methods. Finally, we used the Builder Pattern for the Reader and Converter for pretty much the same reason why we used the Composite Pattern for the View. If we had to read in information from other files, this would be doable thanks to the Builder Pattern.

For this program we are using the output from mutation.sh, which includes the kill information as well as the code that has been mutated. Since the kill information is stored in a CSV file, we made a CSV Converter class that implements the Converter class. The Converter then grabs file storing the kill information in the mutation results folder and parses the file and returns the information to the reader. The Converter also currently reads in the whole Mutated code and not just the changed code snippet. The reader then compiles the information in an ArrayList of Mutant objects and returns them to the model.

We have an ActionListener on the Mutant JButtons in the MutantsView. When the mutant is selected, the mutants original code and mutant code will be displayed to the right in the OriginalCodeView and MutantCodeView respectively.

##HOW TO RUN

Download/Clone the repository. Go into your files and double click on the JAR file located in the MVC folder.

To run in the bash shell, use the command <code>java -jar CS520_Final_Project.jar</code>
