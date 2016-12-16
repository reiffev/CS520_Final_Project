# CS520_Final_Project

#DESIGN CHOICES

For our UI design, we used the MVC Architecture design pattern.

Some of the design patterns we used are the Composite Pattern (for the View), Observer Pattern (for the Model to update the View), and Builder Pattern (for the Reader and Converter)

For this program we are using the output from mutation.sh, which includes the kill information as well as the code that has been mutated. Since the kill information is stored in a CSV file, we made a CSV Converter class that implements the Converter class. The Converter then grabs file storing the kill information in the mutation results folder and parses the file and returns the information to the reader. The Converter also currently reads in the whole Mutated code and not just the changed code snippet. The reader then compiles the information in an ArrayList of Mutant objects and returns them to the model.

Currently, we have ActionListeners on the Mutant JButtons in the MutantsView. When the mutant is selected, the mutants original code and mutant code will be displayed to the right in the OriginalCodeView and MutantCodeView

#HOW TO RUN

Download the JAR file
