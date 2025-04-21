New design Pattern implementation on Lab3: Reading and Visualizing data
Design Patterns: 
Facade - dataVisualizer is now a JFrame basis that is used to take the file input and turn it into string array with all of the data. 
This design is implemented to allow easier setup and implementation of the data GUI, while also allowing expanded user interaction for custom datasets. 
Builder - visualObjects is implemented to allow a greater abstraction of object creation, allows for multiple panel visualizations to be created in a frame. 

Also follows SOLID principles by allowing higher levels of abstraction, so any child classes created are not limited in options. 

While not implemented, options exist to allow custom user data input to modify titles, headers, and column labels throughout chart. 
Very basic and does not represent the entire utilization of these classes, but shows how to construct these new classes and how they can be reproduced for the needed result. 
Building the entire custom GUI interface was more of a time requirement than first expected, so not completed. 
