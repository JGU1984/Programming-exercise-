# Programming-exercise-

You can run the program either in IntelliJ, just clone the repo and run Main.class and enter row, columns, X and Y one by one.

Or you can simply run it from a CLI, e.g. command prompt if you are a Windows person. Clone the repo, navigate to the directory containing Main.class
and run javac Main.class Enter, and then java Main. The some goes here, enter row, columns, X and Y one by one. 

A few assumptions I made along the way:
    - Even though it says "The table can be seen as a matrix", I interpreted it more as a visual aid 
        to get you in the right mindset, therefore I chose to handle the "table" in variables and scrapped
        the whole idea of 2D arrays. Also since the key part of the test was to keep track of the moving "object"


    - Even though one could argue the integers to handle are in arrays, hence the brackets.
        I chose to handle them one by one from stdin, as it wasn't explicitly formulated. 
        
        
    - The arbitrarily long stream of integers wasn't clearly stated who should provide it,
        thus I took control of it and created my own Intstreamer of random integers.
